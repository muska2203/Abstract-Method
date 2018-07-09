package dkovalenko.tests.abstractmethod;

import java.io.Closeable;
import java.util.List;

/**
 * Интерфейс взаимодействия с пользователем.
 */
public interface UserCooperator extends Closeable {

    /**
     * Дать пользователю возможность выбрать фабрику мебели.
     *
     * @return выбранная фабрика.
     */
    FurnitureFactory chooseFurnitureFactory();

    /**
     * Дать пользователю возможность выбрать количество производимой мебели.
     *
     * @return количество мебели.
     */
    int chooseCountOfCreateFurniture();

    /**
     * Вывести пользователю информацию об указанных предметах мебели.
     *
     * @param furnitureList предметы мебели.
     */
    void showAll(List<Furniture> furnitureList);
}
