package design_patterns.structural.adapter.problem_2_first_way;



// ▬ The "Rhombus" Class
//      → that "Implements" the "GeometricShape" Interface ▬
public class Rhombus implements GeometricShape {

    // ▼ "Properties" ▼
    private final double a;
    private final double b;


    // ▬ The "Constructor" ▬
    public Rhombus(double a, double b) {
        this.a = a;
        this.b = b;
    }



    // ▬ The "area()" Override Method ▬
    @Override
    public double area() {
        double s = a * b;
        return s;
    }


    // ▬ The "perimeter()" Override Method ▬
    @Override
    public double perimeter() {
        return 2 * (a + b);
    }


    // ▬ The "drawShape()" Override Method ▬
    @Override
    public void drawShape() {
        System.out.println(
                "Drawing Rhombus with Area: " + area()
                        + " and Perimeter: " + perimeter()
        );
    }
}
