package design_patterns.structural.composite.problem1;

// ▬ "Leaf 3" → that "Implements" the "Shape" Interface ▬
public class Square implements Shape {

    // ▼ "Property" ▼
    String initialColor;

    // ▬ "Constructor" ▬
    public Square(String initialColor){
        this.initialColor = initialColor;
        System.out.println("Creating a Square with color: " + initialColor);
    }




    // ▬ The "draw()" Override Method ▬
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing a Square with color: " + fillColor);
    }
}
