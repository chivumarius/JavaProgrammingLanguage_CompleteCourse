package design_patterns.creational.abstract_factory.problem1;


// ▬ (2-1) "Shape Production" ▬
public class ShapeFactory extends AbstractFactory {

    // ▬ The "getShape()" Override Method
    //      → in which we "Specify"
    //      → the "Shape Type"
    //      → we "Need" to "Create" ▬
    @Override
    public Shape getShape(String shapeType) {

        // ▼ "Check" the "Conditions" ▼
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
