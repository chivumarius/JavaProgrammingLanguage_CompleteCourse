package design_patterns.behavioural.state.problem1;


// ▬ [2] "Context" of "State" Pattern ▬
public class PullingFan {

    // ▼ "Property" ▼
    private FanState currentFanState;


    // ▬ "Constructor" ▬
    public PullingFan() {
        this.currentFanState = new Off();
    }


    // ▬ "Setter" → for the "CurrentFanState" Property ▬
    public void setCurrentFanState(FanState currentFanState) {
        this.currentFanState = currentFanState;
    }



    // ▬ The "push()" Method ▬
    public void push(PullingFan wrapper) {
        this.currentFanState.push(this);
    }
}
