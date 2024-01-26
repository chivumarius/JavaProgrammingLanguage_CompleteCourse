package design_patterns.behavioural.command.problem2;


// ▬ [4] "Utility" Class ▬
public class FileSystemReceiverUtility {

    public static FileSystemReceiver getUnderlyingFileSystem() {

        // ▼ Get the "Operating System Name" ▼
        String osName = System.getProperty("os.name");

        System.out.println("The Operating System is: " + osName);


        // ▼ Check if the "Operating System" is "Windows" ▼
        if (osName.contains("Windows")) {
            //
            return new Windows();
        } else {
            // ▼ Else, return "Linux" Object ▼
            return new Linux();
        }
    }
}
