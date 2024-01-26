/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "STRUCTURAL DESIGN PATTERNS" •
          ________________________________

                ► "DECORATOR" ◄
                - "PROBLEM 1" -




○ Problem 1:

    • Suppose we are "Building"
        → an "Application"
        → for a "Pizza Store"
        → and we "Need"
        → to "Model"
        → their "Pizza Classes".


    • Now "Suppose"
        → a "New Requirement",
        → in "Addition" to a "Pizza",
        → "Customer" can also "Ask"
        → for "Several Toppings" such as:
            •► "Fresh Tomato",
            •► "Cheese",
            •► "Barbeque" etc.



○ Solution
    • Take a "Pizza" Object
        → and "Decorate" It
        → with "Toppings"
        → at "Runtime":
            •► "Pizza" with "Cheese" & "Tomato"

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.structural.decorator.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunDecoratorPattern();
    }


    // ▬ The "RunDecoratorPattern()" Method ▬
    private static void RunDecoratorPattern() {
        System.out.println("\n");

        // ▬▬ TESTING "DECORATOR PATTERN" ▬▬
        // ▼ Creating a "Pizza" Object of "Veggie" Type ▼
        Pizza pizza1 = new Veggie();  // ◄ The "Initial Pizza" ◄
        System.out.println("Pizza: " + pizza1.getDescription() + " has the Cost: " + pizza1.getCost() + " $");


        System.out.println("\n");


        // ▬▬ Decorating the "Pizza" with the "Cheese" Toppings ▬▬
        System.out.println("After Decoration: ");

        pizza1 = new Cheese(pizza1.getDescription(), pizza1);
        System.out.println("Pizza: " + pizza1.getDescription() + " has the Cost: " + pizza1.getCost() + " $");


        System.out.println("\n");



        // ▬▬ Decorating the "Pizza" with the "Tomato" Toppings ▬▬
        pizza1 = new Tomato(pizza1.getDescription(), pizza1);
        System.out.println("Pizza: " + pizza1.getDescription() + " has the Cost: " + pizza1.getCost() + " $");


        System.out.println("\n");
    }
}
