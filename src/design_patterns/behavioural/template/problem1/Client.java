/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "TEMPLATE" ◄
                - "PROBLEM 1" -




  Problem 1:

    • We Need to Help a "Construction Company"
        → to "Build Houses".


    • There are "Specific Steps"
        → to "Follow" in "Order"
        → to "Build" a "House":
            - Building "Foundation"
            • Building "Pillars"
	        - Building "Walls"
	        - Building "Windows"


    • We can't "Change"
        → the "Order" of "Execution".


    • Some "Steps"
        → are "Common"
        → between "All Types"
        → of "Houses".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.template.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunTemplatePattern();
    }


    // ▬ The "RunTemplatePattern()" Method ▬
    private static void RunTemplatePattern() {
        System.out.println("\n");

        // ▼ Create an "Wooden House" ▼
        HouseTemplate woodenHouse = new WoodenHouse();

        // ▼ "Using" yhe "Template Method" ▼
        woodenHouse.buildHouse();



        System.out.println("\n");


        // ▼ Create an "Wooden House" ▼
        HouseTemplate glassHouse = new GlassHouse();

        // ▼ "Using" yhe "Template Method" ▼
        glassHouse.buildHouse();


        System.out.println("\n");
    }
}
