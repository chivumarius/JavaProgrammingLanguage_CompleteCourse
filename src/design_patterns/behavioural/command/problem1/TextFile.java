package design_patterns.behavioural.command.problem1;


// ▬ "Receiver" Class ▬
public class TextFile {

    // ▼ "Property" Instance ▼
    private String fileName;



    // ▬ "Constructor" ▬
    public TextFile(String fileName) {
        this.fileName = fileName;
    }




    // ▬ The "open()" Method ▬
    public String open() {
        return "Opening file " + fileName;
    }



    // ▬ The "save()" Method ▬
    public String save() {
        return "Saving file " + fileName;
    }
}
