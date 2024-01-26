/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "CREATIONAL DESIGN PATTERNS" •
          ________________________________

            ► "ABSTRACT FACTORY" ◄
               - "PROBLEM 1" -




  Problem 1:

    • In the Previous "Factory Pattern"
        → we have "Created"
        → the "ShapeFactory"
        → that "Allows Us"
        → to Create "3 Shapes":
            - "Circle",
            - "Square",
            - "Rectangle".


    • "Now",
        → we "Need"
        → to "Create"
        → New "Rounded" Shapes.

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.creational.abstract_factory.problem1;


public class Client {

    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunAbstractFactoryPattern();
    }


    // ▬ The "RunAbstractFactoryPattern()" Method ▬
    private static void RunAbstractFactoryPattern() {
        System.out.println("\n");

        // ▬♦▬ "Abstract Factory" Design Pattern ▬♦▬
        // ▬♦▬ (I) "Normal Shape" ▬♦▬
        AbstractFactory normalShapeFactory = FactoryProducer.getFactory(false);

        // ► "CIRCLE" ◄
        Shape normalShape1 = normalShapeFactory.getShape("Circle");
        normalShape1.drawShape();


        // ► "RECTANGLE" ◄
        Shape normalShape2 = normalShapeFactory.getShape("Rectangle");
        normalShape2.drawShape();



        // ► "SQUARE" ◄
        Shape normalShape3 = normalShapeFactory.getShape("Square");
        normalShape3.drawShape();



        System.out.println("\n");





        // ▬♦▬ (II) "Rounded Shape" ▬♦▬
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        // ► "ROUNDEDCIRCLE" ◄
        Shape roundedShape1 = roundedShapeFactory.getShape("Circle");
        roundedShape1.drawShape();


        // ► "ROUNDED RECTANGLE" ◄
        Shape roundedShape2 = roundedShapeFactory.getShape("Rectangle");
        roundedShape2.drawShape();


        // ► "ROUNDED SQUARE" ◄
        Shape roundedShape3 = roundedShapeFactory.getShape("Square");
        roundedShape3.drawShape();


        System.out.println("\n");

    }
}
