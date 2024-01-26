package design_patterns.behavioural.memento.problem1;


// ▬ [2] "Originator" Class ▬
public class Originator {

    // ▼ Property ▼
    private String state;



    // ▬ "Getter" → for "state" Property ▬
    public String getState() {
        return state;
    }

    // ▬ "Setter" → for "state" Property ▬
    public void setState(String state) {
        this.state = state;
    }


    // ▬ The "saveStateToMemento()" Method
    //      → for "Linking" the "Memento" Class
    //      → to the "Originator" Class ▬
    public Memento saveStateToMemento() {
        return new Memento(state);
    }


    // ▬ The "restoreStateFromMemento()" Method
    //      → for "Restoring Memento" ▬
    public void restoreStateFromMemento(Memento memento) {
        // ▼ "Setting" the "State" Property ▼
        state = memento.getState();
    }
}
