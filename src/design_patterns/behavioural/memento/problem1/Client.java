/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "MEMENTO" ◄
                - "PROBLEM 1" -




  Problem 1:

     • Let's "Create"
        → a simple "String Saving"
        → and "Restoring Application" ("Clipboard").

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.memento.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunMementoPattern();
    }


    // ▬ The "RunMementoPattern()" Method ▬
    private static void RunMementoPattern() {
        System.out.println("\n");

        // ▼ Creating "Objects" (Classes "Initializations") ▼
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // ▼ Setting "State 1" ▼
        originator.setState("Memento 1");

        // ▼ "Saving" the "State 1" to the "Caretaker" ▼
        caretaker.add(originator.saveStateToMemento());



        // ▼ Setting "State 2" ▼
        originator.setState("Memento 2");

        // ▼ ""Saving" the "State 2" to the "Caretaker" ▼
        caretaker.add(originator.saveStateToMemento());



        // ▼ "Displaying" the "States" ▼
        System.out.println("Current State: " + originator.getState());
        System.out.println("First Saved State: " + caretaker.get(0).getState());

        System.out.println("\n");
    }
}
