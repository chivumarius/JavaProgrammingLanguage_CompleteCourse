/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "MEDIATOR" ◄
                - "PROBLEM 2" -




  Problem 2:

    • Imagine we're "Building"
        → a simple "Cooling System"
        → that Consists of:
            •► a "Fan",
            •► a "Power Supply" and
            •► a "Button".


    • "Pressing" the "Button"
        → will either:
            •► "Turn On" or
            •► "Turn Off"
        → the "Fan". Before we turn the fan on, we need to turn on the power.


    • "Similarly",
        → we have to "Turn Off"
        → the "Power"
        → right "After" the "Fan"
        → is "Turned Off".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.mediator.problem2;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunMediatorPattern();
    }


    // ▬ The "RunMediatorPattern()" Method ▬
    private static void RunMediatorPattern() {
        System.out.println("\n");

        // ▼ Create a new "Mediator" Object ▼
        Mediator mediator = new Mediator();

        // ▼ Create a "Fan" Object ▼
        Fan fan = new Fan(mediator, false);

        // ▼ Create a "PowerSupplier" Object ▼
        PowerSupply powerSupply = new PowerSupply();

        // ▼ Create a "Button" Object ▼
        Button button = new Button(mediator);

        // ▼ Linking the Objects to the "Mediator" ▼
        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupply(powerSupply);


        // ▼ "Pressing" the "Button Once" ▼
        mediator.pressButton();

        System.out.println("\n");


        // ▼ "Pressing" the "Button Twice" ▼
        mediator.pressButton();

        System.out.println("\n");


        // ▼ "Pressing" the "Button Three Times" ▼
        mediator.pressButton();

        System.out.println("\n");
    }
}
