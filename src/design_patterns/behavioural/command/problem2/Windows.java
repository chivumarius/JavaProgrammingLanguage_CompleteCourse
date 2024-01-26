package design_patterns.behavioural.command.problem2;


// ▬ [2-1] "Sub-Receiver" Class
////          →"Implements" the "FileSystemReceiver" Interface ▬
public class Windows implements FileSystemReceiver {

    // ▬ The "open()" Override Method ▬
    @Override
    public void openFile() {
        System.out.println("Opening file in Windows");
    }


    // ▬ The "save()" Override Method ▬
    @Override
    public void saveFile() {
        System.out.println("Saving file in Windows");
    }


    // ▬ The "close()" Override Method ▬
    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows");
    }
}
