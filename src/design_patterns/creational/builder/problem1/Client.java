/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "CREATIONAL DESIGN PATTERNS" •
          ________________________________

                ► "BUILDER" ◄
               - "PROBLEM 1" -




  Problem 1:

    • A "Restaurant"
        → wants to Create
        → an "Ordering System"
        → for "Its Customers".


    • A "Customer"
        → can "Order" a "Sandwich"
        → Containing:
	        •► a "Kind" of "Meat"
	            → ("Beef", "Chicken", "Fish")

	        •► a "Kind" of "Sausage"
	            → ("Sweet-Sour", "Barbeque", "Mayonnaise")


    • "Remember",
        → a "Customer" can "Order"
        → any "Kind" of "Meat"
        → with any "Type" of "Sauce".




    • So, we "Need" to "Create"
        → the Following "Classes":
	        - Beef + SweetSour
	        - Beef + Barbeque
	        - Beef + Mayonnaise

	        - Chicken + SweetSour
	        - Chicken + Barbeque
	        - Chicken + Mayonnaise

	        - Fish + SweetSour
	        - Fish + Barbeque
	        - Fish + Mayonnaise



    • What about Creating
        → "10 kinds" of "Meat",
        → with "20 Kinds" of "Sausage"?
        → ("200 Classes"?)



○ Solution:
    • Implementation of Builder pattern

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.creational.builder.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunBuilderPattern();
    }


    // ▬ The "RunBuilderPattern()" Method ▬
    private static void RunBuilderPattern() {
        System.out.println("\n");

        // ▬♦▬ Create a "Sandwich" ▬♦▬
        // ▼ Create a "Hamburger" Object ▼
        Hamburger hamburger = new Hamburger();
        hamburger.createSandwich();
    }
}
