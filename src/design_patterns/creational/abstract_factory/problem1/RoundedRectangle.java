package design_patterns.creational.abstract_factory.problem1;


// ▬ "Implements" the "Shape" Interface ▬
public class RoundedRectangle implements Shape {

    // ▬ The "drawShape()" Override Method ▬
    @Override
    public void drawShape() {

        System.out.println("Drawing a Rounded Rectangle");
    }
}
