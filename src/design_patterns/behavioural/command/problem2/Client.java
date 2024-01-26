/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "COMMAND" ◄
                - "PROBLEM 2" -




  Problem 2:

    • We need to Create
        → a "File System Utility"
        → with Methods to:
            •► "Open",
            •► "Write" and
            •► "Close" files.


    • This "File System Utility"
        → should "Support"
        → Multiple "Operating Systems"
        → such as:
            •► "Windows" and
            •► "Linux".


    ○ "Note":
        • This "Utility"
            → uses the "Loose Coupling"
            → in a "Request-Response" Model.


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.command.problem2;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunCommandPattern();
    }


    // ▬ The "RunCommandPattern()" Method ▬
    private static void RunCommandPattern() {
        System.out.println("\n");


        // 0- "Receiver"
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtility
                .getUnderlyingFileSystem();

        // ▬♦▬ (1) "OPEN FILE" ▬♦▬
        // 1- "Command": "Open"
        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);


        // 2- "Invoker"
        FileInvoker openFileInvoker = new FileInvoker(openFileCommand);
        openFileInvoker.execute();


        System.out.println("\n");



        // ▬♦▬ (2) "SAVE FILE" ▬♦▬
        // 1- "Command": "Save"
        SaveFileCommand saveFileCommand = new SaveFileCommand(fileSystemReceiver);


        // 2- "Invoker"
        FileInvoker saveFileInvoker = new FileInvoker(saveFileCommand);
        saveFileInvoker.execute();


        System.out.println("\n");



        // ▬♦▬ (3) "CLOSE FILE" ▬♦▬
        // 1- "Command": "Close"
        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);


        // 2- "Invoker"
        FileInvoker closeFileInvoker = new FileInvoker(closeFileCommand);
        closeFileInvoker.execute();


        System.out.println("\n");
    }
}
