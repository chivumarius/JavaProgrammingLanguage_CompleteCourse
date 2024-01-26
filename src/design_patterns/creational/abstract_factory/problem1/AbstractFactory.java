package design_patterns.creational.abstract_factory.problem1;


// ▬ (1) "Factory" of "Factories" ▬
public abstract class AbstractFactory {

    // ▬ The "getShape()" Method ▬
    public abstract Shape getShape(String shapeType);
}
