package design_patterns.behavioural.state.problem2;


// ▬ [2] "Context" of "State" Pattern ▬
public class AlertStateContext {

    // ▼ "Object" ▼
    private MobileState currentState;



    // ▬ "Constructor" ▬
    public AlertStateContext() {
        this.currentState = new Vibration();
    }


    // ▬ "Setter" → for the "CurrentState" Property ▬
    public void setCurrentState(MobileState currentState) {
        this.currentState = currentState;
    }


    // ▬ The "aker()" Method ▬
    public void alert(){
        // ▼ Set the "State" ▼
        currentState.alert(this);
    }
}
