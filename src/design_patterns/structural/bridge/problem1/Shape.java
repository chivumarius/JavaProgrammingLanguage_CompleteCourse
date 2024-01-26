package design_patterns.structural.bridge.problem1;


// ▬ (2) "Abstraction" ▬
public abstract class Shape {

    // ▼ Creating a "Color" Object ▼
    Color color;


    // ▬ The "Constructor" ▬
    public Shape(Color color) {
        this.color = color;
    }



    // ▬ The "applyColorToShape()" Method ▬
    public abstract void applyColorToShape();

}
