/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "STRATEGY" ◄
                - "PROBLEM 2" -




  Problem 2:

    • We are "Developing"
        → a "Social Media Application"
        → that "Allows" the "User"
        → to "Share"
            •► "Pictures",
            •► "Songs" and
            •► "Other Media"

        → "Over":
            •► "Facebook",
            •► "Twitter" and
            •► "Instagram"

        → through this "App".


    • We Need to "Create"
        → this "App"
        → that "Connects"
        → to these "Social Platforms".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.strategy.problem2;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunStrategyPattern();
    }


    // ▬ The "RunStrategyPattern()" Method ▬
    private static void RunStrategyPattern() {
        System.out.println("\n");

        // ▼ Creating the "SocialMediaContext" Object ▼
        SocialMediaContext context = new SocialMediaContext();

        // ▼ "Setting" the "Facebook Strategy" ▼
        context.setSocialStrategy(new Facebook());
        context.connectTo("Marius");
        context.connectTo("Jeanine");
        context.connectTo("Nicholas");

        System.out.println("\n");


        // ▼ "Setting" the "Instagram Strategy" ▼
        context.setSocialStrategy(new Instagram());
        context.connectTo("Marius");
        context.connectTo("Jeanine");
        context.connectTo("Nicholas");

        System.out.println("\n");


        // ▼ "Setting" the "Twitter Strategy" ▼
        context.setSocialStrategy(new Twitter());
        context.connectTo("Marius");
        context.connectTo("Jeanine");
        context.connectTo("Nicholas");

        System.out.println("\n");
    }
}
