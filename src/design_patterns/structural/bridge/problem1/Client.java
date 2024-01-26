/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "STRUCTURAL DESIGN PATTERNS" •
          ________________________________

                ► "BRIDGE" ◄
              - "PROBLEM 1" -




  Problem 1:

    • Say you "Have"
        → a "Geometric Shape" Class
        → with a "Pair" of "Sub-Classes":
            •► "Circle" and
            •► "Square".


    • You "Want"
        → to "Extend" this "Class Hierarchy"
        → to Incorporate "Colors",
        → so you "Plan"
        → to Create "RedColor" and "Blue"
        → Shape "Sub-Classes".


    ▬ Adding
        → "New Shape" Types and "Colors"
        → to the "Hierarchy"
        → will "Grow" It "Exponentially".


    ▬ To "Add"
        → a "Triangle Shape"
        → you'd "Need" to "Introduce"
        → "Two Sub-Classes", one for each color.


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.structural.bridge.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunBridgePattern();
    }


    // ▬ The "RunBridgePattern()" Method ▬
    private static void RunBridgePattern() {

        // ♦♦♦ TESTING "BRIDGE DESIGN PATTERN" ♦♦♦

        // ▼ Creating a "Shape" Object of "Circle" Type ▼
        Shape shape1 = new Circle(new RedColor());

        // ▼ "Applying" the "Color" to the "Shape" ▼
        shape1.applyColorToShape();


        // ▼ Creating a "Shape" Object of "Circle" Type ▼
        Shape shape2 = new Triangle(new BlueColor());

        // ▼ "Applying" the "Color" to the "Shape" ▼
        shape2.applyColorToShape();

    }
}
