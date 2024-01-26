
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
              - "J BUTTON" CLASS/ COMPONENT -
                ("ATOMIC CONTAINER")




    ▬ An "Atomic Component"
        → is a "Component"
        → that has "No Container" inside it,
        → being a "Unique Entity"

    ▬ "Example" of "Atomic Component":
        • "Button",
        • "TextField",
        • "Label",
        • "RadioButton",
        • "CheckBox",
        • "Combo Box",
        • "List",
        • "Tree",
        • "Menu",
        • "TextArea",
        • "FileChooser",
        • "Color Chooser" etc.



    ▬ The "JButton" Class
        → is used to "Create"
        → a "Labeled Button"
        → that has "Platform Independent Implementation".


    ▬ The "Application Result"
        → in some "Action"
        → when the "Button" is "Pushed".


    ▬ JButton"
        → Inherits "AbstractButton" Class.

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;


public class JButton_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("First GUI FRAME");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.getContentPane().setBackground(Color.YELLOW);



        // ▬ (2) "J BUTTON" (ATOMIC CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JButton" ▼
        JButton btn1 = new JButton("Click Me");
        btn1.setBounds(50, 50, 100, 30);


        // ▼ "Event Listener" → for "btn1"
        //      → When the "Button" is "Clicked" ▼
        btn1.addActionListener(e -> {
            // ▼ Changing the "Background Color" of the "Frame" ▼
            jFrame.getContentPane().setBackground(Color.BLUE);
        });


        // ▼ "Adding" the "jButton" to the "jFrame" ▼
        jFrame.add(btn1);
    }
}
