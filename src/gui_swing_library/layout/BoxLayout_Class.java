
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
           - "BOX LAYOUT" CLASS/ COMPONENT -




    ▬ The "BoxLayout" Class
        → is Used to "Arrange"
        → the "Components"
        → either:
            • "Vertically" or
            • "Horizontally".


     ▬ For "This Purpose",
        → the "BoxLayout" Class
        → provides "Four Constants":
            • "X_AXIS"
                → for "Horizontal Alignment"
                → from the "LEFT"
                → to the "RIGHT",

            • "Y_AXIS"
                → for "Vertical Alignment"
                → from the "TOP"
                → to the "BOTTOM",

            • "LINE_AXIS"
                → for "Line Alignment",

            • "PAGE_AXIS"
                → for "Page Alignment".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library.layout;

import javax.swing.*;
import java.awt.*;


public class BoxLayout_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (0) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("GUI COURSE");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setVisible(true);

        // ▼ "BoxLayout"
        //      → with "Horizontal Placement"
        //      → of the "Components"
        //
        jFrame.setLayout(new BoxLayout(
                jFrame.getContentPane(),
                BoxLayout.X_AXIS)
        );


        // ▼ "BoxLayout"
        //      → with "Vertical Placement"
        //      → of the "Components"
        //      → using "Y_AXIS" Constant:
//        jFrame.setLayout(new BoxLayout(
//                jFrame.getContentPane(),
//                BoxLayout.Y_AXIS)
//        );


        // ▼ "BoxLayout"
        //      → with "Horizontal Placement"
        //      → of the "Components",
        //      → using "LINE_AXIS" Constant:
//        jFrame.setLayout(new BoxLayout(
//                jFrame.getContentPane(),
//                BoxLayout.LINE_AXIS)
//        );


        // ▼ "BoxLayout"
        //      → with "Vertical Placement"
        //      → of the "Components",
        //      → using "PAGE_AXIS" Constant:
//        jFrame.setLayout(new BoxLayout(
//                jFrame.getContentPane(),
//                BoxLayout.PAGE_AXIS)
//        );




        // ▼ Creating an "Array" of "5 Buttons" ▼
        Button[] buttons = new Button[5];


        // ▼ "For" Loop ▼
        for (int i = 0; i < buttons.length; i++) {
            // ▼ Creating Each "Button" ▼
            buttons[i] = new Button("Button " + (i + 1));

            // ▼ "Adding" the "Buttons" to the "Frame" ▼
            jFrame.add(buttons[i]);

        }


        // ▼ "Setting" the "Colors" of the "Buttons" ▼
        buttons[0].setBackground(Color.RED);
        buttons[1].setBackground(Color.GREEN);
        buttons[2].setBackground(Color.BLUE);
        buttons[3].setBackground(Color.ORANGE);
        buttons[4].setBackground(Color.MAGENTA);
    }
}
