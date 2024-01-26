package design_patterns.behavioural.memento.problem2;


// ▬ [3] "Memento" Class [Part 1 of Memento]
//          → for "Saving" the "Text" ▬
public class TextWindowMemento {

    // ▼ "Property" ▼
    private String text;



    // ▬ "Constructor" ▬
    public TextWindowMemento(String text) {
        this.text = text;
    }


    // ▬ "Getter" → for "Text" Property ▬
    public String getText() {
        return text;
    }
}
