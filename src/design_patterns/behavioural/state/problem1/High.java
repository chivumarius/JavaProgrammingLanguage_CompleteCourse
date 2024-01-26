package design_patterns.behavioural.state.problem1;


// ▬ [1-4] "Concrete State" of "State" Pattern ▬
public class High implements FanState {

    // ▬ The "push()" Override Method ▬
    @Override
    public void push(PullingFan wrapper) {
        wrapper.setCurrentFanState(new Off());
        System.out.println("Turning Fan OFF");
    }
}
