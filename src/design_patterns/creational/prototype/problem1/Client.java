/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "CREATIONAL DESIGN PATTERNS" •
          ________________________________

                ► "PROTOTYPE" ◄
                - "PROBLEM 1" -




  Problem 1:

    • Say you "Have" an "Object",
        → and you "Want" to "Create"
        → an "Exact Copy" of "It".

        ► How would you "do it"?



  • "First",
    → you have to "Create" a "New Object"
    → of the "Same Class".

  • "Then"
    → you have to "Go"
    → through "All" the "Fields"
    → of the "Original Object"
    → and "Copy" their "Values"
    → "Over" to the "New Object".




○ Okay!
   → But there’s a "Catch".

  • "Not All Objects"
    → "Can Be Copied" that "Way"
    → because "Some" of the "Object's Fields"
    → may be "Private"
    → and "Not Visible"
    → from "Outside"
    → of the "Object Itself".




○ Solution:

  • The "Prototype" Pattern
        → "Delegates" the "Cloning Process"
        → to the "Actual Objects"
        → that are "Being Cloned".



  • The "Pattern"
        → "Declares" a "Common Interface"
        → for "All Objects"
        → that "Support Cloning".


  • This "Interface"
        → lets you "Clone"
        → an "Object"
        → "Without Coupling" your "Code"
        → to the "Class"
        → of that "Object".



  • "Usually",
        → such an "Interface"
        → "Contains" just a "Single Clone Method".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.creational.prototype.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunPrototypePattern();
    }


    // ▬ The "RunPrototypePattern()" Method ▬
    private static void RunPrototypePattern() {
        System.out.println("\n");

        // ▼ Create a "Shape" Object of "Point" Type ▼
        Shape shape1 = new Point(1, 3);
        System.out.println(shape1.getTranslationX());



        // ▬▬ Clone the "Shape1 Object" ▬▬
        Shape shape2 = shape1.clone();

        // ▼ Access the "Method" of "Shape1" ▼
        System.out.println(shape2.getTranslationX());



        System.out.println("\n");
    }
}
