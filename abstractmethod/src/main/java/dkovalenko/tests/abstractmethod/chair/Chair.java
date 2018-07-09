package dkovalenko.tests.abstractmethod.chair;

import dkovalenko.tests.abstractmethod.Furniture;

/**
 * Реализация предмета мебели, представляющая стул.
 */
public class Chair implements Furniture {

    @Override
    public String getName() {
        return "Chair";
    }
}
