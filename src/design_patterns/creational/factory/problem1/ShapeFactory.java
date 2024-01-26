package design_patterns.creational.factory.problem1;


// ▬ "Factory Core" Design Pattern ▬
public class ShapeFactory {

    // ▬ The "getShape()" Method
    //      → in which we "Specify"
    //      → the "Shape Type"
    //      → we "Need" to "Create" ▬
    public Shape getShape(String shapeType){

        if (shapeType == null) {
            return null;
        } else if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }

        return null;
    }
}
