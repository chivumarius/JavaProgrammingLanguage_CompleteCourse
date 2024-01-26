package design_patterns.structural.bridge.problem1;

// ▬ This "Extends" the "Shape" Class ▬
public class Circle extends Shape {

    // ▬ The "Constructor" ▬
    public Circle(Color color){
        super(color);
    }


    // ▬ The "applyColorToShape()" Override Method ▬
    @Override
    public void applyColorToShape() {

        // ▼ Creating the "Shape" ▼
        System.out.println("Circle filled with color ");

        // ▼ Applying the "Color" to "Shape" ▼
        color.applyColor();
    }
}
