package design_patterns.creational.factory.problem1;


// ▬ "Implements" the "Shape" Interface ▬
public class Square implements Shape {

    // ▬ The "drawShape()" Method ▬
    @Override
    public void drawShape() {
        System.out.println("Drawing a Square");
    }
}
