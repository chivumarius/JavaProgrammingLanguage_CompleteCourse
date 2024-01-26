/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "STRUCTURAL DESIGN PATTERNS" •
          ________________________________

                ► "DECORATOR" ◄
                - "PROBLEM 2" -




  Problem 2:
      • A Factory
            → Creates a "Basic Car".


      • We "Need" to "Add"
            → "Luxury" & "Sports Features"
            → to these "Cars".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.structural.decorator.problem2;


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
        // ▼ Creating a "BasicCar" Object ▼
        BasicCar basicCar = new BasicCar();

        // ▼ (1) Creating a "Car" Object of "SportsCar" Type ▼
        Car car1 = new SportsCar(basicCar);

        // ▼ (2) Creating a "Car" Object of "LuxuryCar" Type ▼
        Car car2 = new LuxuryCar(car1);

        // ▼ "Assembling" the "Car1" Method ▼
        car2.assemble();


        System.out.println("\n");
    }
}
