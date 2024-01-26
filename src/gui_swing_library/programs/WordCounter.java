/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                    • "PROGRAM" •
                  - "WORD COUNTER" -



  Requirements:

        • Write a "Java Program"
            → that "Counts" the "Number"
            → of "Words" from an "Inserted String".
           
 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library.programs;


import javax.swing.*;
import java.awt.*;


public class WordCounter {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("Word Counter");
        jFrame.setLayout(null);
        jFrame.setBounds(100,100,500,500);
        jFrame.setVisible(true);




        // ▼ Creating an "Instance"/"Object" of "JTextArea" Type
        //      → to "Insert Text" ▼
        JTextArea textArea  = new JTextArea();
        textArea.setBounds(50,50,300,200);
        jFrame.add(textArea);




        // ▼ Creating an "Instance"/"Object" of "JButton" Type ▼
        JButton button = new JButton("Check");
        button.setBounds(180,300,100,30);
        button.setBackground(Color.blue);
        jFrame.add(button);


        // ▼ "Button Functionality" ▼
        button.addActionListener(e -> {
            // ▼ Getting the "Entered Text" from "TextArea" ▼
            String text = textArea.getText();

            // ▼ If There is "Text" in "TextArea" ▼
            if (!text.equals("")){

                // ▼ "Splitting Up" the "String"
                //      → and "Storing Word"
                //      → into "Array" ▼
                String[] words = text.split("\\s");  // "\s" = "Space"

                // ▼ Displaying the "Number" of "Worlds"
                JOptionPane.showMessageDialog(jFrame, "Total number of words: " + words.length);
            }
        });

    }
}
