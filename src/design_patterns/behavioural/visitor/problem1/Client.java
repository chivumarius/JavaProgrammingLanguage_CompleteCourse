/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "VISITOR" ◄
                - "PROBLEM 1" -




  Problem 1:

    • We have a "Restaurant Software"
        → that "Allows" the "User"
        → to "Order Pizza"!


    • We "Need" to "Add"
        → "Delivery Option"
        → to the "Order",
        → so the "User" can "Choose":
	        •► his order delivered by Take Away
	        •► his order delivered to the Table
	        •► his order delivered by Delivery



    • We Need to Add
        → this New "Feature"
        → without "Changing Any"
        → in "Objects" ("Pizza")

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.visitor.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunVisitorPattern();
    }


    // ▬ The "RunVisitorPattern()" Method ▬
    private static void RunVisitorPattern() {
        System.out.println("\n");


        // ▼ Create the "Pizza" Object of "Cheese" Type ▼
        Pizza pizza1 = new Cheese();

        // ▼ "Pizza Delivery" ▼
        HowTo deliveryMethod = new OnTable();

        // ▼ Linking "Delivery Method" to the "Pizza 1" ▼
        deliveryMethod.visit(pizza1);

        // ▼ "Output" ▼
        System.out.println(
                deliveryMethod
                + " " + pizza1
        );



        System.out.println("\n");
    }
}
