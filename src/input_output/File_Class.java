
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "INPUT" / "OUTPUT" •
                 - ("I/O") -
               _________________
                • "FILE" CLASS •



    ▬ The "File" Class
        → is an "Abstract Representation"
        → of "File" and "Directory Path Name".


    ▬ A "Path Name"
        → can be either
            • "Absolute" or
            • "Relative".


    ▬ The "File" Class
        → have several methods for working with directories and files such as creating new directories or files, deleting and renaming directories or files, listing the contents of a directory etc.


    ▬ The "File" Class
        → is the "Entry Point"
        → to the "File System". It allows you to create an object (logical) that is associated to a file or a directory on disk.


    ▬ The "Existence"
        → of this "Object"
        → does "Not Mean"
        → that the "File" or "Directory"
        → "Exists" on "Disk".

        • It's just an "Object"
            → in memory.


    ▬ The "File" Class
        → is "Not Used" to make "Input/Output"
        → because it does "Not Specify"
        → how the "Information"
        → is "Extracted" or "Stored"
        → in the "File",
        → it "Describes" the "Properties"
        → of the "File Itself".



    ▬ A "File" Type "Object"
        → is used to "Manipulate"
        → the "Information Associated"
        → with a "Disk File", such as:
            • "Permissions",
            • "Times",
            • "Date",
            • "Directories",

        → as well as "Navigating"
            → through the "Hierarchy".


    ▬ A "Directory" in "Java"
        → is "Treated"
        → as a "Simple File".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package input_output;


import java.io.File;
import java.io.IOException;


public class File_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ Creating a "File" Object ▼
        File file1 = new File("src/input_output/FileCreation.txt");


        try {

            if (file1.createNewFile()) {
                // ▼ Getting the "File Absolute Path" ▼
                System.out.println("File Created: " + file1.getAbsolutePath());
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
