package design_patterns.behavioural.state.problem1;


// ▬ [1-1] "Concrete State" of "State" Pattern ▬
public class Off implements FanState {

    // ▬ The "push()" Override Method ▬
    @Override
    public void push(PullingFan wrapper) {
        wrapper.setCurrentFanState(new Low());
        System.out.println("Fan is now in Low Speed");
    }
}
