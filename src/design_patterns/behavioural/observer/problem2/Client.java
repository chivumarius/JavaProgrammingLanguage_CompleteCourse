/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "OBSERVER" ◄
                - "PROBLEM 2" -




  Problem 2:
        • We "Need" to "Create"
            → a "Notification System"
            → for a "News Agency"
            → that "Wants" to "Notify Channels"
            → when it "Receives News".


        • "Receiving News"
            → is what "Changes" the "State"
            → of the "News Agency"
            → and it "Causes" the "Channels"
            → to be "Notified".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.observer.problem2;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunObserverPattern();
    }


    // ▬ The "RunObserverPattern()" Method ▬
    private static void RunObserverPattern() {
        System.out.println("\n");

        // ▼ "OBSERVABLE" ▼
        NewsAgency newsAgency = new NewsAgency();

        // ▼ "OBSERVER" ▼
        NewsChannel cnn = new NewsChannel();


        // ▼ Add the "NewsChannel" to the "List"
        //      → in order to "Get Notified" about the "News" ▼
        newsAgency.addObserver(cnn);
        newsAgency.setNews("Breaking News");


        System.out.println("\n");



        // ▼ Create the "News Channel" Object ▼
        NewsChannel eurosport = new NewsChannel();

        // ▼ Add the "NewsChannel" to the "List"
        //      → in order to "Get Notified" about the "News" ▼
        newsAgency.addObserver(eurosport);
        newsAgency.setNews("The football game was won by the Barcelona team!");


        System.out.println("\n");
    }
}
