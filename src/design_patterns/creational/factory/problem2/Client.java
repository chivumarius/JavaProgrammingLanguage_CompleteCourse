/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "CREATIONAL DESIGN PATTERNS" •
          ________________________________

                ► "FACTORY" ◄
               - "PROBLEM 2" -




  Problem 2:

    • We Want to "Implement"
        → a "Notification Service"
        → through:
            - Email
	        - SMS
	        - Push Notifications


    • Our "Main Purpose"
        → is to:

            1- "Create Object"
                → "Without Exposing"
                → the "Creation Logic"
                → to the "Client".

	        2- "Refer" to "Newly Created Object"
	            → using a "Common Interface".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.creational.factory.problem2;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunFactoryPattern();
    }


    // ▬ The "RunFactoryPattern()" Method ▬
    private static void RunFactoryPattern() {
        System.out.println("\n");


        // ▬♦▬ "Factory" Design Pattern ▬♦▬
        // ▬♦▬ "Hiding" the "Ordinary Object Creation" ▬♦▬

        // ▼ Create a "NotificationFactory" Object ▼
        NotificationFactory notificationFactory = new NotificationFactory();

        // ▼ Create a "Notification" Object of "Email" Type ▼
        Notification notification1 = notificationFactory.createNotification("EMAIL");
        notification1.userNotification();


        // ▼ Create a "Notification" Object of "SMS" Type ▼
        Notification notification2 = notificationFactory.createNotification("SMS");
        notification2.userNotification();



//        // ▼ Create a "Notification" Object of "Push Notification" Type ▼
        Notification notification3 = notificationFactory.createNotification("PUSH");
        notification3.userNotification();

        System.out.println("\n");
    }
}
