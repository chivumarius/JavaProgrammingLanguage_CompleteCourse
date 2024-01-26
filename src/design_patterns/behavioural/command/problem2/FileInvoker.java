package design_patterns.behavioural.command.problem2;


// ▬ [3] "Invoker" Class ▬
public class FileInvoker {

    // ▼ Creating a "Command" Object/Instance ▼
    private Command command;


    // ▬ "Constructor" ▬
    public FileInvoker(Command command) {
        this.command = command;
    }


    // ▬ The "execute()" Method ▬
    public void execute() {
        this.command.execute();
    }
}
