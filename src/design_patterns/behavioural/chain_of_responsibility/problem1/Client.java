/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

           ► "CHAIN OF RESPONSIBILITY" ◄
                - "PROBLEM 1" -




  Problem 1:

    • We "Need" to "Create"
        → a "Special Calculator".


    • We "Need" to "Create"
        → "Chained" and
        → "Linked Mathematical Operations":
	        1- "Receive" the "Equation"

	        2- "Check" for "Addition" Operation,
	            → if so, it will "Do It",
	            → otherwise it will be "Passed Next"

	        3- "Check" for "Subtraction" Operation,
	            → if so, it will "Do It",
	            → otherwise it will be "Passed Next"

	        4- "Check" for "Multiplication" Operation,
	            → if so, it will "Do It",
	            → otherwise it will be "Passed Next"

	        5- "Check" for "Division" Operation,
	            → if so, it will "Do It",
	            → otherwise it will "Terminate".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.chain_of_responsibility.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunChainOfResponsibilityPattern();
    }


    // ▬ The "RunChainOfResponsibilityPattern()" Method ▬
    private static void RunChainOfResponsibilityPattern() {
        System.out.println("\n");

        // 1- Defining "All ChainOfResponsibility" of "Responsibility"
        Chain chain1 = new AddNumbers();
        Chain chain2 = new SubtractNumbers();
        Chain chain3 = new MultiplyNumbers();
        Chain chain4 = new DivideNumbers();



        // 2- Telling "Each ChainOfResponsibility" what is the "Next" ChainOfResponsibility
        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);


        // ▬♦▬ "Addition" Operation ▬♦▬
        // 3- "Testing Equation"
//        Numbers equation1 = new Numbers(54, 46, "add");
//        Numbers equation1 = new Numbers(47, 17, "subtract");
        Numbers equation1 = new Numbers(2, 5, "multiply");
//        Numbers equation1 = new Numbers(99, 3, "divide");

        // 4- "Calculating" → "Starting" from the "First ChainOfResponsibility"
        chain1.calculate(equation1);



        System.out.println("\n");
    }
}
