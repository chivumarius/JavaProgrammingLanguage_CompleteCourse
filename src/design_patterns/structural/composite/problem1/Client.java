/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "STRUCTURAL DESIGN PATTERNS" •
          ________________________________

                ► "COMPOSITE" ◄
                - "PROBLEM 1" -




 Problem 1:

    • When we "Need"
        → to "Create" a "Structure"
        → in a "Way"
        → that the "Objects" in the "Structure"
        → Must be "Treated" the "Same Way".


    • A "Drawing"
        → is a "Structure"
        → that "Consists" of "Objects"
        → such as:
            •► Circle,
            •► Lines,
            •► Triangle etc.


    • When we "Fill"
        → the "Drawing" with "Color"
        → (say "RedColor"),
        → the "Same Color" also
        → gets "Applied" to the "Objects"
        → in the "Drawing".


    • Here "Drawing"
        → is "Made Up" of "Different Parts"
        → and they "All"
        → have "Same Operations".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.structural.composite.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunCompositePattern();
    }



    // ▬ The "RunCompositePattern()" Method ▬
    private static void RunCompositePattern() {
        System.out.println("\n");
        // ♦♦♦ "COMPOSITE"  DESIGN PATTERN ♦♦♦

        // ▼ Create a "Shapes" Objects of "Triangle", "Circle" and "Square" Type ▼
        Shape triangle1 = new Triangle("Blue");
        Shape circle1 = new Circle("Yellow");
        Shape square1 = new Square("Green");



        // ▼ Create a "Drawing" Object ▼
        Drawing drawing = new Drawing();

        // ▼ Add the "Shapes" to the "Drawing" ▼
        drawing.addShape(triangle1);
        drawing.addShape(circle1);
        drawing.addShape(square1);


        System.out.println("\n");

        // ▼ "Apply" the "RedColor Color" to "All" the "Shapes" ▼
       drawing.draw("RedColor");


        System.out.println("\n");
    }
}
