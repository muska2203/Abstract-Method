package dkovalenko.tests.abstractmethod.chair;

import dkovalenko.tests.abstractmethod.Furniture;
import dkovalenko.tests.abstractmethod.FurnitureFactory;

/**
 * Фабрика стульев.
 */
public class ChairFactory implements FurnitureFactory {

    @Override
    public Furniture create() {
        return new Chair();
    }
}
