package design_patterns.creational.abstract_factory.problem1;


// ▬ (2-2) "Rounded Shape Production" ▬
public class RoundedShapeFactory extends AbstractFactory {


    // ▬ The "getShape()" Override Method
    //      → in which we "Specify"
    //      → the "Shape Type"
    //      → we "Need" to "Create" ▬
    @Override
    public Shape getShape(String shapeType) {

        // ▼ "Check" the "Conditions" ▼
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new RoundedCircle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedCircle();
        }
        return null;
    }
}
