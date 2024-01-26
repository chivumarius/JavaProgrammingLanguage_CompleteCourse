/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "TEMPLATE" ◄
                - "PROBLEM 2" -




  Problem 2:
      • A "Computer Store"
            → wants to "Create" a "Program"
            → that "Helps" the "Customers"
            → to "Build" their "Own Computer"
            → "Following" these "Steps":
	            - Adding "Motherboard"
	            - Adding "Processor"
	            - Adding "Hard Disk"
	            - Adding "Graphics Card"


    • This "Store"
        → wants to Create "2 Variants":
            - "Standard" Computer &
            - "Super" Computer


    • "Note":
        → No "Common Steps"
        → between the "2 Variants"!


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.template.problem2;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunTemplatePattern();
    }


    // ▬ The "RunTemplatePattern()" Method ▬
    private static void RunTemplatePattern() {
        System.out.println("\n");

        // ▼ Create an "Standard Computer" ▼
        ComputerTemplate standardComputer = new StandardComputer();
        standardComputer.buildComputer();


        System.out.println("\n");


        // ▼ Create an "Super Computer" ▼
        ComputerTemplate superComputer = new SuperComputer();
        superComputer.buildComputer();


        System.out.println("\n");
    }
}
