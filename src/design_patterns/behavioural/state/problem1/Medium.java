package design_patterns.behavioural.state.problem1;


// ▬ [1-3] "Concrete State" of "State" Pattern ▬
public class Medium implements FanState {

    // ▬ The "push()" Override Method ▬
    @Override
    public void push(PullingFan wrapper) {
        wrapper.setCurrentFanState(new High());
        System.out.println("Fan is now in High Speed");
    }
}
