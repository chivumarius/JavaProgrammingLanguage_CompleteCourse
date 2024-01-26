package design_patterns.behavioural.command.problem2;


// ▬ [1-1] "Implements" the "Command" Interface ▬
public class OpenFileCommand implements Command {

    // ▼ Create a "FileSystemReceiver" Object/Instance ▼
    private FileSystemReceiver fileSystemReceiver;



    // ▬ "Constructor" ▬
    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }



    // ▬ The "execute()" Override Method ▬
    @Override
    public void execute() {

        // ▼ "Open" the "File" ▼
        this.fileSystemReceiver.openFile();
    }
}
