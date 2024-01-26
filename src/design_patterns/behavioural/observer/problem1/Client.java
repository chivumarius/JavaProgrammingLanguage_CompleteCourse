/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "OBSERVER" ◄
                - "PROBLEM 1" -




  Problem 1:

    • We "Need"
        → to "Create" a "Program"
        → that "Takes" a "Decimal Number"
        → and "Transforms" it
        → into:
            •► "Binary",
            •► "Octal",
            •► "Hexadecimal" Forms.


    • "Also", it "Listens"
        → to the "Changes" of this "Number"
        → and "Make" instantaneous "Changes"
        → to the "Previous Forms".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.observer.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunObserverPattern();
    }


    // ▬ The "RunObserverPattern()" Method ▬
    private static void RunObserverPattern() {
        System.out.println("\n");

        // ▼ Create a "Subject" Object ▼
        Subject subject = new Subject();


        // ▼ Creating "Observers" ▼
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);


        // ▼ Before Changing the "State" ▼
        System.out.println("Initial State: 20");
        subject.setState(20);


        System.out.println("\n");

        // ▼ Changing the "Bunber"
        //      → from "20" to "30" ▼
        System.out.println("Changed  State: 30");
        subject.setState(30);



        System.out.println("\n");
    }
}
