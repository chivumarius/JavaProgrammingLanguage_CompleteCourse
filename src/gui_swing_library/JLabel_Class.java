
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
              - "J LABEL" CLASS/ COMPONENT -
                ("ATOMIC CONTAINER")




    ▬ The "Object" of "JLabel" Class
        → is a "Component"
        → for "Placing Text"
        → in a "Container".



    ▬ "JLabel"
        → is used to "Display"
        → a "Single Line"
        → of "Read Only Text".



    ▬ The "Text"
        → can be "Changed"
        → by an "Application"
        → but a "User Cannot Edit It" Directly. It inherits the JComponent class.

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;


public class JLabel_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("First GUI FRAME");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setLayout(new FlowLayout());
        jFrame.setVisible(true);



        // ▬ (2) "J LABEL" (ATOMIC CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JLabel" ▼
        JLabel jLabel = new JLabel("Hello to everyone");

        // ▼ "Adding" the "jLabel" to the "jFrame" ▼
        jFrame.add(jLabel);


        // ▬ (3) "J BUTTON" (ATOMIC CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JButton" ▼
        JButton jButton = new JButton("Change Text");

        // ▼ "Setting" the "jButton" Bounds ▼
        jButton.setBounds(50, 50, 100, 30);
        jButton.setBackground(Color.BLUE);

        // ▼ "Action Listener" → for "jButton" ▼
        jButton.addActionListener(e -> {
            // ▼ "Changing" the "jLabel" Text ▼
            jLabel.setText("I am Marius and I will be your Instructor!");
        });

        // ▼ "Adding" the "jButton" to the "jFrame" ▼
        jFrame.add(jButton);
    }
}
