
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
           - "CARD LAYOUT" CLASS/ COMPONENT -




    ▬ The "CardLayout" Class
        → "Arranges" Each "Component"
        → in the "Container"
        → as a "Card".


    ▬ Only "One Card"
        → is "Visible"
        → at a "Time"
        → and the "Container"
        → "Acts" as a "Stack"
        → of "Cards".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library.layout;

import javax.swing.*;
import java.awt.*;


public class CardLayout_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (0) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("GUI COURSE");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setVisible(true);

        // ▼ "CardLayout"
        //      → with "Horizontal Gap"
        //      → and "Vertical Gap" ▼
        jFrame.setLayout(new CardLayout(20, 20));





        // ▬ (1) "J BUTTON" (ATOMIC CONTAINER) ▬
        // ▼ Creating All "InstanceS"/"ObjectS" of Type "JButton" ▼
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");



        // ▼ "Setting" the "Buttons Colors" ▼
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.yellow);



        // ▼ "Adding" the "Buttons" to the "jFrame" ▼
        jFrame.add(btn1);
        jFrame.add(btn2);
        jFrame.add(btn3);
    }
}
