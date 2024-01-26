package design_patterns.behavioural.state.problem2;


// ▬ [1-1] "Concrete State" of "State" Pattern ▬
public class Vibration implements MobileState {

    // ▬ The "alert()" Method Override ▬
    @Override
    public void alert(AlertStateContext context) {
        // ▼ "Display" the "Message" ▼
        System.out.println("Vibration Mode");
    }
}
