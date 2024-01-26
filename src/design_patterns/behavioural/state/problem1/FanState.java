package design_patterns.behavioural.state.problem1;


// ▬ [1] "State" of "State" Pattern ▬
public interface FanState {

    // ▬ "Method" ▬
    void push(PullingFan wrapper);
}
