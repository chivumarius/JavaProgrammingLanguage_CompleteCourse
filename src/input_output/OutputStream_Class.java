
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "INPUT" / "OUTPUT" •
                 - ("I/O") -
               _________________
               • "STREAMS DATA" •
            • "OUTPUT STREAM" CLASS •
       - (TO "WRITE" THE "DATA" INTO THE "FILE") -




    ▬ The "Java.io.OutputStream" Class
        → is the "superclass"
        → of "All Classes" representing
        → an "Output Stream" of "Bytes".



    ▬ An "Output Stream"
        → Accepts "Output Bytes"
        → and "Sends Them"
        → to Some "Sink".



    ▬ "Applications"
        → that "Need" to "Define"
        → a "Sub-Class" of "OutputStream"
        → must "Always Provide"
        → at Least a "Method"
        → that "Writes One Byte"
        → of "Output".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package input_output;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



public class OutputStream_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ Creating a "String" Variable ▼
        String data = "Hello and welcome to this course! \nI am Marius and I will be your instructor.";


        // ▼ "Creating" an "OutputStream" Object ▼
        // Writing data to file
        OutputStream outputStream;


        try {

            // ▼ "Setting" the "OutputStream" Object  as "FileOutputStream" Type
            //      → for "Writing Data"
            //      → to the "File" ▼
            outputStream = new FileOutputStream("src/input_output/output-data/output-text.txt");


            // ▼ "Converts" the "String" into "Bytes" ▼
            byte[] dataBytes = data.getBytes();


            // ▼ "Writes Data" to the "File"
            outputStream.write(dataBytes);
            System.out.println("The Data was Written to the File!");


            // ▼ "Close" the "Output Stream"
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
