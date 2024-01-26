package design_patterns.structural.adapter.problem_2_second_way;


// ▬ The "Triangle" Class
//      → that "Implements" the "GeometricShape" Interface ▬
public class Triangle implements GeometricShape {

    // ▼ "Properties" ▼
    private final double a;
    private final double b;
    private final double c;


     // ▬ "Constructor" ▬
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    // ▬ The "area()" Override Method ▬
    @Override
    public double area() {

        double s = (a + b + c) / 2;

        // ▼ Calculate the "Area" ▼
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    // ▬ The "perimeter()" Override Method ▬
    @Override
    public double perimeter() {
        return a + b + c;
    }


    // ▬ The "drawShape()" Override Method ▬
    @Override
    public void drawShape() {
        System.out.println(
                "Drawing Triangle with Area: " + area()
                + " and Perimeter: " + perimeter()
        );
    }
}
