package design_patterns.behavioural.command.problem2;


// ▬ [1-3] "Implements" the "Command" Interface ▬
public class CloseFileCommand implements Command {

    // ▼ Create a "FileSystemReceiver" Object/Instance ▼
    private FileSystemReceiver fileSystemReceiver;


    // ▬ "Constructor" ▬
    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }


    // ▬ The "execute()" Override Method ▬
    @Override
    public void execute() {

        // ▼ "Close" the "File" ▼
        this.fileSystemReceiver.closeFile();
    }
}
