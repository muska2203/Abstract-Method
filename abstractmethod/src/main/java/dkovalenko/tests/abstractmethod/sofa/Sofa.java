package dkovalenko.tests.abstractmethod.sofa;

import dkovalenko.tests.abstractmethod.Furniture;

/**
 * Реализация предмета мебели, представляющая Диван.
 */
public class Sofa implements Furniture {

    @Override
    public String getName() {
        return "Sofa";
    }
}
