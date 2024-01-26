/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "VISITOR" ◄
                - "PROBLEM 2" -




  Problem 2:

    • We "Need" to "Create"
        → a "Computer" Program
        → that "Defines" and "Accepts"
        → the New "Hardware" Installed
        → like:
            •► "Mouse",
            •► "Keyboard",
            •► "Monitor" etc.

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.visitor.problem2;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunVisitorPattern();
    }


    // ▬ The "RunVisitorPattern()" Method ▬
    private static void RunVisitorPattern() {
        System.out.println("\n");


        // ▼ Creating a "New Computer" ▼
        ComputerPart computer = new Computer();

        // ▼ Accepting the "Visitor" ▼
        computer.accept(new ComputerPartDisplayVisitor());


        System.out.println("\n");
    }
}
