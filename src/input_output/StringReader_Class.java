
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "INPUT" / "OUTPUT" •
                 - ("I/O") -
               _________________
           • "STRING READER" CLASS •
      - ("READING"  DATA FROM A "STRING") -



    ▬ "StringReader" Class
        → is a "Character Stream"
        → with "String"
        → as a "Source".


    ▬ "StringReader"
        → "Takes" an "Input String"
        → and "Changes It"
        → into "Character Stream".


    ▬ "StringReader"
        → Inherits "Reader" Class.


    ▬ In "StringReader" Class,
        → "System Resources" like:
            • "Network Sockets" and
            • "Files"
        → are "Not Used",
        → therefore "Closing"
        → the "StringReader"
        → is "Not Necessary".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package input_output;


import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class StringReader_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) throws IOException {

        // ▼ Creating a "String" Variable ▼
        String sourceString = "Greetings to all!";


        try{

            // ▼ (1) "Reading" the "String Resource" ▼
            Reader reader = new StringReader(sourceString);


            // ▼ (2) "Storing" the "Char Data" in the "Array" ▼
            char[] readData = new char[50];

            // ▼ "Reading" the "Data"
            reader.read(readData);


            // (3) "Display" the "Data Read"
            System.out.println("\nThe data read: ");
            System.out.println(readData);


            // ▼ (4) "Closing" the "Reader" ▼
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
