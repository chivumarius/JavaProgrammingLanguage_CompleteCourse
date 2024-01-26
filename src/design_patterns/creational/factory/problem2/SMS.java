package design_patterns.creational.factory.problem2;


// ▬ "Implements" the "Notification" Interface ▬
public class SMS implements Notification {

    // ▬The "userNotification()" Override Method ▬
    @Override
    public void userNotification() {
        System.out.println("Sending SMS");
    }
}
