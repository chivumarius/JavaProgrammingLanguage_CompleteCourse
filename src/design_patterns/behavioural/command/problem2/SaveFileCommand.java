package design_patterns.behavioural.command.problem2;


// ▬ [1-2] "Implements" the "Command" Interface ▬
public class SaveFileCommand implements Command {

    // ▼ Create a "FileSystemReceiver" Object/Instance ▼
    private FileSystemReceiver fileSystemReceiver;


    // ▬ "Constructor" ▬

    public SaveFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }



    // ▬ The "execute()" Override Method ▬
    @Override
    public void execute() {

        // ▼ "Save" the "File" ▼
        this.fileSystemReceiver.saveFile();
    }
}
