
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
         - "BORDER LAYOUT" CLASS/ COMPONENT -






   ▬ "BorderLayout"
        → is the "Default Layout"
        → for the "Window Objects"
        → such as:
            • "JFrame",
            • "JWindow",
            • "JDialog",
            • "JInternalFrame" etc.


    ▬ "BorderLayout"
        → "Arranges" the "Components"
        → in the "Five Regions".
            • "North" Side,
            • "South" Side,
            • "East" Side and
            • "West" Side
            • "Center" Part.


    ▬ Each "Region"
        → can "Contain" Only "One Component"
        → and is "Identified"
        → by a Corresponding "Constant" as:
            • NORTH,
            • "SOUTH",
            • "EAST",
            • "WEST", and
            • "CENTER".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library.layout;


import javax.swing.*;
import java.awt.*;


public class BorderLayout_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (0) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("GUI COURSE");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setVisible(true);

        // ▼ "BorderLayout" with "Gaps" ▼
        jFrame.setLayout(new BorderLayout(10, 10));





        // ▬ (1) "J BUTTON" (ATOMIC CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JButton" ▼
        JButton btn1 = new JButton("North");
        JButton btn2 = new JButton("South");
        JButton btn3 = new JButton("East");
        JButton btn4 = new JButton("West");
        JButton btn5 = new JButton("Center");


        // ▼ "Setting" the "Buttons Colors" ▼
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.yellow);
        btn4.setBackground(Color.blue);
        btn5.setBackground(Color.magenta);




        // ▼ "Adding" the "Buttons" to the "jFrame" ▼
        jFrame.add(btn1, BorderLayout.NORTH);
        jFrame.add(btn2, BorderLayout.SOUTH);
        jFrame.add(btn3, BorderLayout.EAST);
        jFrame.add(btn4, BorderLayout.WEST);
        jFrame.add(btn5, BorderLayout.CENTER);

    }
}
