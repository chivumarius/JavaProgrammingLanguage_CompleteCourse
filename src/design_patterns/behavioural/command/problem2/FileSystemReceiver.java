package design_patterns.behavioural.command.problem2;


// ▬ [2] "Receiver" Interface ▬
public interface FileSystemReceiver {

    // ▬ "Methods" ▬
    void openFile();
    void saveFile();
    void closeFile();
}
