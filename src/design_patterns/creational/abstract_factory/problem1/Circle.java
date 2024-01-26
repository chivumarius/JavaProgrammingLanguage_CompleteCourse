package design_patterns.creational.abstract_factory.problem1;


// ▬ "Implements" the "Shape" Interface ▬
public class Circle implements Shape {

    // ▬ The "drawShape()" Method ▬
    @Override
    public void drawShape() {

        System.out.println("Drawing a Circle");
    }
}
