/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "CREATIONAL DESIGN PATTERNS" •
          ________________________________

                ► "BUILDER" ◄
               - "PROBLEM 2" -




  Problem 2:

      • We "Need"
        → to Add "Delivery" Option
        → ("TakeAway", "OnTable", "Delivery") for the order, so the customer can choose now:
	        - "Meat"
	        - "Sauce"
	     - "Delivery"




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


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.creational.builder.problem2;



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

        System.out.println("\n");
    }
}
