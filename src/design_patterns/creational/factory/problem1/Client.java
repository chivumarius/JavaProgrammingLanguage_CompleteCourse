/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "CREATIONAL DESIGN PATTERNS" •
          ________________________________

                ► "FACTORY" ◄
               - "PROBLEM 1" -




  Problem 1:
    • We have "3 shapes" to "Create":
	    - "Circle"
	    - "Square"
	    - "Rectangle"


    • To "Create" a "Circle":
	    Shape c = new Circle();


    • "But":
        → If we "want" to "create objects"
        → "Without Exposing" the "Creation Logic"
        → to the "Client"
        → and "Refer" to N"ewly Created Object"
        → "Using" a "Common Interface".


    • Create a "Circle"
        → "Without Writing":
	        Shape c - new Circle();


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.creational.factory.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunFactoryPattern();
    }


    // ▬ The "RunFactoryPattern()" Method ▬
    private static void RunFactoryPattern() {
        System.out.println("\n");

        // ▬♦▬ "Ordinary Object Creation" ▬♦▬
        // ▼ Create a "Shape" Object of "Circle" Type ▼
//        Shape c = new Circle();
//        c.drawShape();



        // ▬♦▬ "Factory" Design Pattern ▬♦▬
        // ▬♦▬ "Hiding" the "Ordinary Object Creation" ▬♦▬
        // ▼ Create a "ShapeFactory" Object ▼
        ShapeFactory shapeFactory = new ShapeFactory();

        // ▼ Create a "Shape" Object of "Circle" Type ▼
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.drawShape();


        // ▼ Create a "Shape" Object of "Rectangle" Type ▼
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.drawShape();


        // ▼ Create a "Shape" Object of "Square" Type ▼
        Shape shape3 = shapeFactory.getShape("Square");
        shape3.drawShape();


        System.out.println("\n");
    }
}
