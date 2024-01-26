/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "CREATIONAL DESIGN PATTERNS" •
          ________________________________

                ► "PROTOTYPE" ◄
                - "PROBLEM 2" -




  Problem 2:

    • We "Need"
        → to "Implement" a "Coloring System"
        → for "Shapes".


    • We "Need"
        → to "Create Duplicates"
        → of the "Colors Object"
        → and "Store Them"
        → into "colorMap<String, Color>"
        → "Inside" a "Color Store".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.creational.prototype.problem2;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunPrototypePattern();
    }


    // ▬ The "RunPrototypePattern()" Method ▬
    private static void RunPrototypePattern() {
        System.out.println("\n");

        // ▼ Create a "ColorStore" Object ▼
        ColorStore colorStore = new ColorStore();

        // ▼ Access the "Duplicated Color" ▼
        colorStore.duplicateColors(new RedColor());


        System.out.println("\n");
    }
}
