package dkovalenko.tests.abstractmethod;

import dkovalenko.tests.abstractmethod.console.ConsoleUserCooperator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        UserCooperator userCooperator = new ConsoleUserCooperator();
        List<Furniture> furnitureList = new ArrayList<>();
        FurnitureFactory factory = userCooperator.chooseFurnitureFactory();

        int count = userCooperator.chooseCountOfCreateFurniture();
        for (int i = 0; i < count; i++) {
            furnitureList.add(factory.create());
        }
        userCooperator.showAll(furnitureList);
        userCooperator.close();


    }

}
