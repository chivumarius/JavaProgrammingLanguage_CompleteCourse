package design_patterns.behavioural.command.problem1;


// ▬ "Implements" the "TextFileOperation" Interface ▬
public class OpenTextFileOperations implements TextFileOperation {

    // ▼ The "TextFile" Instance ▼
    private TextFile textFile;



    // ▬ "Constructor" ▬
    public OpenTextFileOperations(TextFile textFile) {
        this.textFile = textFile;
    }


    // ▬ The "execute()" Override Method ▬
    @Override
    public String execute() {
        // ▼ "Open" the "TextFile" ▼
        return textFile.open();
    }
}
