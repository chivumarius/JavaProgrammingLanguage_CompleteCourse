
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "INPUT" / "OUTPUT" •
                 - ("I/O") -
               _________________
                • "DIRECTORY" •



    ▬ The "File" Class
        → is an "Abstract Representation"
        → of "File" and "Directory Path Name".


    ▬ A "Directory" in "Java"
        → is "Treated"
        → as a "Simple File".



    ▬ "Therefore":
        • A "File" in a "File" Type Object.

        • A "Directory" in a "File" Type Object
            → that Contain a "List"
            → of "Files" and "Directories".

    ▬ The "Directory"
        → is "Created"
        → by a "File" Object
        → and using the "mkdir()" method.


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package input_output;


import java.io.File;


public class Directory {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ Creating a "File" Type "Object" fpr "Directory" ▼
        File directory1 = new File("src/input_output/myDirectory");

        // ▼ Creating a "Directory" ▼
        directory1.mkdir();


        // ▼ Getting the "Directory Absolute Path" ▼
        System.out.println("Directory Created: " + directory1.getAbsolutePath());


        // ▼ "Checking": If a "Directory" is a "Directory" ▼
        if (directory1.isDirectory()) {

            // ▼ "Getting" the "Directory Name" ▼
            System.out.println("Directory Name: " + directory1.getName() + "\n");

            // ▼ "Getting" a "List"
            //      → of "All" the "Files" and "Directories"
            //      → from the "Directory" ▼
            String[] files = directory1.list();


            // ▼ "Displaying" the "List"
            //      → by using "for()" Loop ▼
            for (int i = 0; i < files.length; i++) {

                // ▼ "Creating" a "File" Object ▼
                File file1 = new File(directory1 + "/" + files[i]);


                // ▼ "Nested Directories" ▼
                if (file1.isDirectory()) {
                    // ▼ "Is a Directory" ▼
                    System.out.println(files[i] + " is a Directory");
                } else {
                    // ▼ "Is a File" ▼
                    System.out.println(files[i] + " is a File");
                }
            }

        } else {
            // ▼ "Is a File" ▼
            System.out.println(" Is not aDirectory");
        }
    }
}
