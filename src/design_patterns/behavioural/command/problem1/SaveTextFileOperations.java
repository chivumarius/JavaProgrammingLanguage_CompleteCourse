package design_patterns.behavioural.command.problem1;


// ▬ "Implements" the "TextFileOperation" Interface ▬
public class SaveTextFileOperations implements TextFileOperation {

    // ▼ The "TextFile" Instance ▼
    private TextFile textFile;



    // ▬ "Constructor" ▬
    public SaveTextFileOperations(TextFile textFile) {
        this.textFile = textFile;
    }



    // ▬ The "execute()" Override Method ▬
    @Override
    public String execute() {

        // ▼ Save the "TextFile" Instance ▼
        return textFile.save();
    }
}
