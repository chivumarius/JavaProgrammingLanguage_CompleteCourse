package design_patterns.structural.bridge.problem1;


// ▬ This "Extends" the "Shape" Class ▬
public class Square extends Shape {

    // ▬ The "Constructor" ▬
    public Square(Color color){
        super(color);
    }

    // ▬ The "applyColorToShape()" Override Method ▬
    @Override
    public void applyColorToShape() {
        // ▼ Creating the "Shape" ▼
        System.out.println("Square filled with color: ");

        // ▼ Applying the "Color" to "Shape" ▼
        color.applyColor();
    }
}
