/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "STRUCTURAL DESIGN PATTERNS" •
          ________________________________

                ► "BRIDGE" ◄
              - "PROBLEM 2" -




  Problem 2:
      ▬ We have a "Factory"
            → that "Produces Vehicles":
                •► "Bike",
                •► "Bus",
                •► "Cars" etc.

            → and "Every Vehicle"
            → have "Workshops":
                •► Produce,
                •► "Assemble",
                •► "Painting",
                •► "Testing" etc.


    ▬ If the "Factory"
        → "Needs" to "Produce"
        → a "Truck"?


    ▬ If the "Factory"
        → "Needs" to Add "Lubrication Workshop"?

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.structural.bridge.problem2;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunBridgePattern();
    }


    // ▬ The "RunBridgePattern()" Method ▬
    private static void RunBridgePattern() {

        System.out.println("\n");

        // ♦♦♦ TESTING "BRIDGE DESIGN PATTERN" ♦♦♦

        // ▼ Creating a "Vehicle" Object of "Car" Type ▼
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();

        System.out.println("\n");


        // ▼ Creating a "Vehicle" Object of "Bike" Type ▼
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();

        System.out.println("\n");


        // ▼ Creating a "Vehicle" Object of "Track" Type ▼
        Vehicle vehicle3 = new Track(new Paint(), new Assemble());
        vehicle3.manufacture();

        System.out.println("\n");
    }
}
