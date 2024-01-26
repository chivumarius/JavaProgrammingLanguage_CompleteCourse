
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
              - "J PANEL" CLASS/ COMPONENT -
                ("INTERMEDIATE CONTAINER")




    ▬ The "JPanel"
        → is a Simplest "Container" Class,
        → an "Intermediate Container"
        → used to "Structure"
        → the "Graphic Application".


    ▬ It provides "Space"
        → in which an "Application"
        → can "Attach"
        → any "Other Component".


    ▬ It "Inherits"
        →the "JComponents" Class.


    ▬ It D"oesn't Have"
        → "Title Bar".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;


public class JPanel_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "P FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("First GUI FRAME");


        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setLayout(null);
        jFrame.setVisible(true);



        // ▬ (2) "J PANEL" (INTERMEDIATE CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JPanel" ▼
        JPanel iPanel = new JPanel();

        // ▼ "Setting" the "iPanel" ▼
        iPanel.setBounds(100, 100, 300, 300);
        iPanel.setBackground(Color.red);
        iPanel.setLayout(null);
        iPanel.setVisible(true);


        // ▼ "Adding" the "iPanel"
        //      → to the "jFrame" ▼
        jFrame.add(iPanel);
    }

}
