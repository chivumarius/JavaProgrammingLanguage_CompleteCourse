
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "INPUT" / "OUTPUT" •
                 - ("I/O") -
               _________________
               • "WRITER" CLASS •
          - (FOR "CHAR" DATA TYPE) -



    ▬ "Writer" Class
        → is an "Abstract" Class
        → for "Writing"
        → to "Character Stream"s.


    ▬ The "Methods"
        → that a "Sub-Class"
        → must "Implement" are:
            • "write(char[], int, int)",
            • "flush()", and
            • "close()".


    ▬ Most "Sub-Classes"
        → will "Override"
        → some of this "Methods"
        → to Provide "higher":
            • "Efficiency",
            • "Functionality"
            • or "Both".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package input_output;


import java.io.*;

public class Writer_Class_for_Char {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) throws IOException {

        // ▼ Creating a "String" Variable ▼
        String toInsertString =     """
                        Greetings to all,

                        I am Marius Chivu, your instructor, and in this course we will study the Java programming language together.""";


        try {

            // ▼ Creating a "Writer" Object of "FileWriter" Type ▼
            Writer writer = new FileWriter("src/input_output/data-to-write/text-to-write.txt");

            // ▼ "Writing" the "String" ▼ to the file
            writer.write(toInsertString);

            // ▼ "Displaying" the "Text" ▼
            System.out.println("\nThe Data was Successfully Written to the File!");


            // ▼ "Closing" the "Writer" Object ▼
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
