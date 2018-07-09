package dkovalenko.tests.abstractmethod.console;

import dkovalenko.tests.abstractmethod.Furniture;
import dkovalenko.tests.abstractmethod.FurnitureFactory;
import dkovalenko.tests.abstractmethod.UserCooperator;
import dkovalenko.tests.abstractmethod.chair.ChairFactory;
import dkovalenko.tests.abstractmethod.sofa.SofaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Интерфейс взаимодействия с пользователем посредством консоли.
 */
public class ConsoleUserCooperator implements UserCooperator {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public FurnitureFactory chooseFurnitureFactory() {
        while (true) {
            System.out.println("Выберите что будем производить : \n1 - Стулья, \n2 - Диваны.");
            try {
                int choose = Integer.parseInt(bufferedReader.readLine());
                switch (choose) {
                    case 1:
                        return new ChairFactory();
                    case 2:
                        return new SofaFactory();
                    default:
                        System.out.println("Выберите один из предложенных вариантов.");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Введены не верные символы.");
            }
        }
    }

    @Override
    public int chooseCountOfCreateFurniture() {
        while (true) {
            System.out.println("Сколько мебели будем производить?");
            try {
                return Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void showAll(List<Furniture> furnitureList) {
        for (Furniture furniture : furnitureList) {
            System.out.println(furniture.getName());
        }
    }

    @Override
    public void close() throws IOException {
        bufferedReader.close();
    }
}
