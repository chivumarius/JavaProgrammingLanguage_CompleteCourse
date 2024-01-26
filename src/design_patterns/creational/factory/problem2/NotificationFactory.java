package design_patterns.creational.factory.problem2;


// ▬ "Factory" Design Pattern ▬
public class NotificationFactory {

    // ▬ The "createNotification()" Method
    //      → in which we "Specify"
    //      → the "Notification Name"
    //      → we "Need" to "Create" ▬
   public Notification createNotification(String name) {

      // ▼ "Checking" the "Condition" ▼
      if (name == null || name.isEmpty()) {
          return null;
      }


      // ▼ Switch Case ▼
      switch (name) {
          case "SMS":
              return new SMS();     // ► "Create" a "SMS" Object
          case "EMAIL":
              return new Email();   // ► "Create" an "Email" Object
          case "PUSH":
              return new PushNotification();    // ► "Create" a "PushNotification" Object
          default:
             throw new IllegalArgumentException("Unknown Notification Service");
      }
    }
}
