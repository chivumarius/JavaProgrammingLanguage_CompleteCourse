package design_patterns.behavioural.memento.problem2;


// ▬ [2] "Originator" Class [Part 2 of Memento]
//          → "Holds" the "Currently Entered Text" and
//          → "Saving", "Adding" and "Restore" of the "Text" ▬
public class TextWindow {

    // ▼ "String Builder"
    //      → for adding "More Text" ▼
    private StringBuilder currentText;



    // ▬ "Constructor" ▬
    public TextWindow() {
        this.currentText = new StringBuilder();
    }


    // ▬ Adding "Text" to the "Text Window" ▬
    public void addText(String text) {
        currentText.append(text);
    }


    // ▬ Saving the "Memento Text"
    public TextWindowMemento save() {
        return new TextWindowMemento(currentText.toString());
    }



    // ▬ Restoring the "Memento Text" ▬
    public void restore(TextWindowMemento saveMemento) {
        currentText.setLength(0);
        currentText.append(saveMemento.getText());
    }



    // The "getCurrentText()" Method ▬
    public String getCurrentText() {
        return currentText.toString();
    }
}
