/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "STRATEGY" ◄
                - "PROBLEM 1" -




  Problem 1:

    • In a "Shopping App",
        → we Need to Implement
        → the Different "Payment Options"
        → that "Allow" the "Users"
        → to "Pay"
        → with "Credit Cards" or "Paypal".



    • C"redit Cards"
        → "Holds" the Following "Details":
	        - "Card Holder Name"
	        - "Card Number"
	        - "CVV"
	        - "Date" of "Expiry"



    • "Paypal"
        → "Holds":
	        - "Email Id"
	        - "Password"


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.strategy.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunStrategyPattern();
    }


    // ▬ The "RunStrategyPattern()" Method ▬
    private static void RunStrategyPattern() {
        System.out.println("\n");


        // ▼ Create the "ShoppingCart" Object ▼
        ShoppingCart cart = new ShoppingCart();

        // ▼ Selecting "Credit Card Payment" as "Payment Methods" ▼
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100);

        // ▼ Selecting "Paypal Payment" as "Payment Methods" ▼
        cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        cart.checkout(50);


        System.out.println("\n");
    }
}
