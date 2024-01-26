package design_patterns.behavioural.memento.problem2;


// ▬ [1] "Caretaker" Class  [Part 3 of Memento]
//          → contains the "App Features"
public class TextEditor {

    // ▼ "Instance Variables" ▼
    private TextWindow textWindow;
    private TextWindowMemento saveTextWindow;


    // ▬ "Constructor" ▬
    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }



    // ▬ The "writeText()" Method ▬
    public void writeText(String text) {
        textWindow.addText(text);
    }



    // ▬ The "print()" Method ▬
    public String print() {
       return textWindow.getCurrentText();
    }



    // ▬ The "save()" Method ▬
    public void save() {
        saveTextWindow = textWindow.save();
    }



    // ▬ The "undo()" Method ▬
    public void undo() {
        textWindow.restore(saveTextWindow);
    }
}
