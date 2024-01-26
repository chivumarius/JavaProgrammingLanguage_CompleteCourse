package design_patterns.behavioural.memento.problem1;


// ▬ [1] "Memento" Class ▬
public class Memento {

    // ▼ Property ▼
    private String state;


    // ▬ "Constructor" ▬
    public Memento(String state) {
        this.state = state;
    }


    // ▬ "Getter" → for "state" Property ▬
    public String getState() {
        return state;
    }
}
