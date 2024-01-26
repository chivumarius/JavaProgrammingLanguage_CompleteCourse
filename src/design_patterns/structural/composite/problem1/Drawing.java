package design_patterns.structural.composite.problem1;


import java.util.ArrayList;
import java.util.List;


// ▬ "Composite Object"
//      → that "Implements" the "Shape" Interface ▬
public class Drawing implements Shape {

    // ▼ Collects of "Shapes" Objects
    //      → using a "Array List" Collection Type ▼
    private List<Shape> shapes = new ArrayList<>();


    // ▬ The "addShape()" Method ▬
    public void addShape(Shape shape) {
        // ▼ "Adding Shapes" to the "Drawing" ▼
        this.shapes.add(shape);
    }



    // ▬ The "removeShape()" Method ▬
    public void removeShape(Shape shape) {
        // ▼ "Removing Shapes" to the "Drawing" ▼
        this.shapes.remove(shape);
    }



    // ▬ The "removeAllShapes()" Method ▬
    public void removeAllShapes() {
        // ▼ "Removing All the Shapes" from the "Drawing" ▼
        this.shapes.clear();
        System.out.println("All the Shapes are removed from the Drawing.");
    }




    // ▬ The "draw()" Override Method ▬
    @Override
    public void draw(String fillColor) {

        // ▼ Checking for All the Shapes ▼
        for (Shape shape : shapes) {
            // ▼ "Drawing All the Shapes" from the "Drawing" ▼
            shape.draw(fillColor);
        }
    }
}
