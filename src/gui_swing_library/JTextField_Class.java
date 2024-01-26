
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
           - "J TEXT FIELD" CLASS/ COMPONENT -
                ("ATOMIC CONTAINER")




    ▬ The "Object" of a "JTextField" Class
        → is a "Text Component"
        → that Allows to "Insert"
        → a "Single Line Text".


    ▬ "JTextField"
        → Inherits "JTextComponent" Class.
    

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;


public class JTextField_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("First GUI FRAME");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setLayout(new GridLayout());
        jFrame.setVisible(true);



        // ▬ (2) "J TEXT FIELD" (ATOMIC CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JTextField" ▼
        JTextField textField = new JTextField();
        textField.setBackground(Color.yellow);

        // ▼ "Adding" the "jTextField" to the "jFrame" ▼
        jFrame.add(textField);



        // ▬ (3) "J LABEL" (ATOMIC CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JLabel" ▼
        JLabel jLabel = new JLabel("");

        // ▼ "Adding" the "jLabel" to the "jFrame" ▼
        jFrame.add(jLabel);



        // ▬ (4) "J BUTTON" (ATOMIC CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JButton" ▼
        JButton jButton = new JButton("Get Text");
        jButton.setBackground(Color.blue);

        // ▼ "Action Listener" for the "JButton" ▼
        jButton.addActionListener(e -> {

            // ▼ "Getting" the "Entered Text" from the "TextField" ▼
            String enteredText = textField.getText();

            // ▼ "Displaying" the "Entered Text" in the "JLabel" ▼
            jLabel.setText(enteredText);
        });

        // ▼ "Adding" the "jButton" to the "jFrame" ▼
        jFrame.add(jButton);
    }
}
