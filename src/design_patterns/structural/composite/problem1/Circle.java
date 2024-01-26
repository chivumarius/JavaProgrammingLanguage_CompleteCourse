package design_patterns.structural.composite.problem1;


// ▬ "Leaf 2" → that "Implements" the "Shape" Interface ▬
public class Circle implements Shape {

    // ▼ "Property" ▼
    String initialColor;

    // ▬ "Constructor" ▬
    public Circle(String initialColor){

        this.initialColor = initialColor;
        System.out.println("Creating a Circle with color: " + initialColor);
    }



    // ▬ The "draw()" Override Method ▬
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing a Circle with color: " + fillColor);
    }
}
