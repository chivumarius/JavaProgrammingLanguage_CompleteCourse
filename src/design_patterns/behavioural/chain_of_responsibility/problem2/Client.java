/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

           ► "CHAIN OF RESPONSIBILITY" ◄
                - "PROBLEM 2" -




  Problem 2:

    • We "Need" to "Create"
        → an "ATM" Program
        → that "Distribute"
        → the "Money"
        → in the "ATM" Machine.


    • The "User"
        → "Enters" the "Amount"
        → to be "Withdrawn" and
        → the "Machine Starts"
        → to "Distribute" the "Amount"
        → in "Terms" of "Currency Bills":
            •► 10 $, 20 $, 50 $


    • If the "User"
        → "Enters" an "Amount Below 10",
        → the "Machine"
        → will "Refuse" the "Request".


    • The "ChainOfResponsibility"
        → will "Process"
        → the "Request":
	        •► 50$ → 20$ → 10$


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.chain_of_responsibility.problem2;


import java.util.Scanner;

public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunChainOfResponsibilityPattern();
    }


    // ▬ The "RunChainOfResponsibilityPattern()" Method ▬
    private static void RunChainOfResponsibilityPattern() {

        // 1- Defining "All ChainOfResponsibility" of "Responsibility"
        MoneyDistributor chain1 = new Dollar50();
        MoneyDistributor chain2 = new Dollar20();
        MoneyDistributor chain3 = new Dollar10();


        // 2- Telling "Each ChainOfResponsibility" what is the "Next" ChainOfResponsibility
        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);


        // ▼ Loop ▼
        while (true) {
            int amount = 0;

            System.out.println("Enter the amount to withdraw: ");

            // ▼ Create a "Scanner" Object ▼
            Scanner enteredInput = new Scanner(System.in);

            // ▼ Getting the "Amount" from the "User" ▼
            amount = enteredInput.nextInt();


            // ▼ Checking if the "Amount" is multiple of 10 ▼
            if(amount % 10 != 0){
                System.out.println("Please enter an amount that is multiple of 10");
                return;
            }

            // ▼ Processing the "Request"/"Withdraw" ▼
            chain1.distribute(new Currency(amount));
        }
    }
}
