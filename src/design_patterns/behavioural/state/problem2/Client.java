/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                 ► "STATE" ◄
                - "PROBLEM 2" -




  Problem 2:

    • In our "Mobiles",
        → we have a "Button"
        → for "Changing" the Mobile "Alert State".


    • For "Example":
        •► "Vibration" to "Silent"


    • "Based" on this "Alert State",
        → "Behavior" of the "Mobile Changes".



○ Solution

    • This is "Achieved"
        → by "Implementing"
        → the "State" Design Pattern:


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.state.problem2;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunStatePattern();
    }


    // ▬ The "RunStatePattern()" Method ▬
    private static void RunStatePattern() {
        System.out.println("\n");

        // ▼ Create the "AlertStateContext" Objects ▼
        AlertStateContext context = new AlertStateContext();

        // ▼ "Display" the "Current State" ▼
        context.alert();


        System.out.println("\n");


        // ▼ "Change" the "CurrentState" to "Silent" ▼
        context.setCurrentState(new Silent());

        // ▼ "Display" the "Current State" ▼
        context.alert();


        System.out.println("\n");
    }
}
