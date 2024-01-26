package design_patterns.behavioural.state.problem2;


// ▬ [1-2] "Concrete State" of "State" Pattern ▬
public class Silent implements MobileState {
    // ▬ The "alert()" Method Override ▬
    public void alert(AlertStateContext context) {
        System.out.println("Silent Mode");
    }
}
