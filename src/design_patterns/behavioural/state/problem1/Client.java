/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                 ► "STATE" ◄
                - "PROBLEM 1" -




  Problem 1:

    • A "Button" in a "Fan",
        → "Allows" the "User"
        → when "Clicking It",
        → to "Change" Its "State":
	        •► "On"
	        •► "Low Speed"
	        •► "Medium Speed"
	        •► "High Speed"
	        •► "Off"


  • We Need to "Create"
    → a Program
    → to this "Fan"
    → to "Allow" the "User"
    → to "Change" the "State".



○ Solution

  • This is "Achieved"
    → by "Implementing"
    → the "State" Design Pattern.


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.state.problem1;


import java.util.Scanner;

public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunStatePattern();
    }


    // ▬ The "RunStatePattern()" Method ▬
    private static void RunStatePattern() {
        System.out.println("\n");

        // ▼ Create the "PullingFan" Objects ▼
        PullingFan fan1 = new PullingFan();


        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Press Enter");


            String input = scanner.nextLine();

            if (input.isEmpty()) {
               fan1.push(fan1);

            }
        }



    }
}
