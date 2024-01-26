package design_patterns.structural.composite.problem1;


// ▬ "Leaf 1" → that "Implements" the "Shape" Interface ▬
public class Triangle implements Shape{

    // ▼ "Property" ▼
    String initialColor;

    // ▬ "Constructor" ▬
    public Triangle(String initialColor){
        this.initialColor = initialColor;
        System.out.println("Creating a Triangle with color: " + initialColor);
    }




    // ▬ The "draw()" Override Method ▬
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing a Triangle with color: " + fillColor);
    }
}
