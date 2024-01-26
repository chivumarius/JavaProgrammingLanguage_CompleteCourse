/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "COMMAND" ◄
                - "PROBLEM 1" -




  Problem 1:

    • Let's "Develop"
        → a "Text File" Application.


    • In such a "Case",
        → we should Implement "All Functionalities Required"
        → for "Performing"
        → some "Text-File" Related "Operations":
	        - "Opening",
	        - "Writing",
	        - "Saving" a "Text File"
	   → and so forth.

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.command.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunCommandPattern();
    }


    // ▬ The "RunCommandPattern()" Method ▬
    private static void RunCommandPattern() {
        System.out.println("\n");


        // 1- "Invoker" Object
        TextFileOperationsInvoker invoker = new TextFileOperationsInvoker();


        // 2- "File"
        TextFile textFile = new TextFile("File1.txt");


        // 3- "Open Text File Operation" Object
        TextFileOperation openOperation = new OpenTextFileOperations(textFile);

        // ▼ "Executing" the "Open Operation" ▼
        System.out.println(invoker.executeOperation(openOperation));


        // 4- "Saving Operation" Object
        TextFileOperation saveOperation = new SaveTextFileOperations(textFile);

        // ▼ "Executing" the "Save Operation" ▼
        System.out.println(invoker.executeOperation(saveOperation));


        System.out.println("\n");
    }
}
