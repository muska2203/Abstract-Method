package dkovalenko.tests.abstractmethod.sofa;

import dkovalenko.tests.abstractmethod.Furniture;
import dkovalenko.tests.abstractmethod.FurnitureFactory;

/**
 * Фабрика диванов
 */
public class SofaFactory implements FurnitureFactory {

    @Override
    public Furniture create() {
        return new Sofa();
    }
}
