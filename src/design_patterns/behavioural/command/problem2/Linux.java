package design_patterns.behavioural.command.problem2;


// ▬ [2-2] "Sub-Receiver" Class
//          → "Implements" the "FileSystemReceiver" Interface ▬
public class Linux implements FileSystemReceiver {

    // ▬ The "open()" Override Method ▬
    @Override
    public void openFile() {
        System.out.println("Opening file in Linux");
    }


    // ▬ The "save()" Override Method ▬
    @Override
    public void saveFile() {
        System.out.println("Saving file in Linux");
    }


    // ▬ The "close()" Override Method ▬
    @Override
    public void closeFile() {
        System.out.println("Closing file in Linux");
    }
}
