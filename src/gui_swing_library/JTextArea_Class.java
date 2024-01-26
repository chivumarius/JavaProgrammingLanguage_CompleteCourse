
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
          - "J TEXT AREA" CLASS/ COMPONENT -
                ("ATOMIC CONTAINER")




    ▬ The "JTextArea" Class
        → is a "Multi-Line Area"
        → used to Display "Plain Text"
        → and  to "Edit Text".


    ▬ "JTextArea"
        → inherits "JComponent" class.


    ▬ The "Text"
        → in "JTextArea"
        → can be "Set"
        → to "Different" available "Fonts"
        → and can be "Added"
        → to a "New Text".


    ▬ A "Text Area"
        → can be "Customized"
        → to the "Need"
        → of "User".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;


public class JTextArea_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("GUI COURSE");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setLayout(null);
        jFrame.setBounds(100,100,1000,1000);
        jFrame.setVisible(true);





       // ▬ (2) "J TEXT AREA" (ATOMIC CONTAINER) ▬
       // ▼ Creating new "Instances"/"Objects" of Type "JTextArea" ▼
       JTextArea textArea = new JTextArea(10,10);

       // ▼ "Setting" the "textArea" Bounds ▼
       textArea.setBounds(10,50,200,200);
       textArea.setBackground(Color.LIGHT_GRAY);


       // ▼ "Adding" the "textArea" to the "jFrame" ▼
       jFrame.add(textArea);



        // ▬ (3) "J BUTTON" (ATOMIC CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JButton" ▼
        JButton btn = new JButton("Get Text Area");
        btn.setBounds(10,300,200,50);

        // ▼ "Adding" the "btn" to the "jFrame" ▼
        jFrame.add(btn);

        // ▼ Adding "Action Listener" for "Button" ▼
        btn.addActionListener(e -> {

            // ▼ "Getting" the "Entered Text" from the "textArea" ▼
            String enteredText = textArea.getText();

            // ▼ Displaying the "Entered Text" ▼
            System.out.println(enteredText);
        });

    }
}
