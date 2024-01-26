package design_patterns.behavioural.state.problem1;


// ▬ [1-2] "Concrete State" of "State" Pattern ▬
public class Low implements FanState {

    // ▬ The "push()" Override Method ▬
    @Override
    public void push(PullingFan wrapper) {
        wrapper.setCurrentFanState(new Medium());
        System.out.println("Fan is now in Medium Speed");
    }
}
