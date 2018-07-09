package dkovalenko.tests.abstractmethod;

/**
 * Фабрика мебели.
 */
public interface FurnitureFactory {

    /**
     * Создать предмет мебели.
     *
     * @return предмет мебели, в зависимости от реализации фабрики мебели.
     */
    Furniture create();
}
