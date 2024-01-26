
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
              - "J SPLIT PANE" CLASS/ COMPONENT -
                ("INTERMEDIATE CONTAINER")




    ▬ "JSplitPane"
        → is used to "Divide Two Components".


    ▬ The "Two Components"
        → are "Divided Based"
        → on the "Look"
        → and "Feel Implementation",
        → and they can be "Resized"
        → by the "User".


    ▬ If the "Minimum Size"
        → of the "Two Components"
        → is "Greater Than"
        → the "Size" of the "Split Pane",
        → the "Divider" will "Not Allow Us"
        → to "Resize It".


    ▬ in a "Slit Pane"
        → the "Two Components"
        → can be "Aligned":
            • "Left" to "Right"
                → using "JSplitPane.HORIZONTAL_SPLIT", or
            • "Top" to "Bottom"
                → using "JSplitPane.VERTICAL_SPLIT".


    ▬ When the "components"
        → are "resized"
        → the "Minimum Size"
        → of the "Components"
        → is "Used" to "Determine"
        → the "Maximum/Minimum Position"
        → on which the "Components"
        → can be "Set To".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;



public class JSplitPane_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("First GUI FRAME");


        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setLayout(new GridLayout());
        jFrame.setVisible(true);



        // ▬ (2) "PANEL" (INTERMEDIATE CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "Panel" ▼
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();


        // ▼ "Setting" the "Panel 1" ▼
        panel1.setBounds(100, 100, 200, 200);
        panel1.setBackground(Color.CYAN);


        // ▼ "Setting" the "Panel 2" ▼
        panel2.setBounds(400, 400, 200, 200);
        panel2.setBackground(Color.MAGENTA);



        // ▬ (3) "J SPLIT PANE" (INTERMEDIATE CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JSplitPane" ▼
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);


        // ▼ Adding the "splitPane" to the "jFrame" ▼
        jFrame.add(splitPane);
    }
}
