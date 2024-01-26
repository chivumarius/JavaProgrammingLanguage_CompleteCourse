package design_patterns.structural.bridge.problem1;


// ▬ This "Extends" the "Shape" Class ▬
public class Triangle extends Shape{

    // ▬ The "Constructor" ▬
    public Triangle(Color color) {
        super(color);
    }

    // ▬ The "applyColorToShape()" Override Method ▬
    @Override
    public void applyColorToShape() {

        // ▼ Creating the "Shape" ▼
        System.out.println("Triangle filled with color: ");

        // ▼ Applying the "Color" to "Shape" ▼
        color.applyColor();
    }
}
