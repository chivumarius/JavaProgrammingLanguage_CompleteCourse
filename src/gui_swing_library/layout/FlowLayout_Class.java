
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
           - "FLOW LAYOUT" CLASS/ COMPONENT -




    ▬ The "FlowLayout" Class
        → is used to "Arrange"
        → the "Components"
        → in a "Line",
        → "One" After "Another" (in a "Flow").


    ▬ "FlowLayout"
        → is the "Default Layout" of the
            • "Applet" or
            • "Panel".

    ▬ "FlowLayout"
        → is the "Responsive" Layout.

    ▬ It can "Displays"
        → the "Components" to the:
            • "LEFT" or "0",
            • "CENTER" or "1" (by "Default"),
            • "RIGHT" or "2".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library.layout;

import javax.swing.*;
import java.awt.*;


public class FlowLayout_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (0) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("GUI COURSE");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setVisible(true);

        // ▼ "FlowLayout"
        //      → with "Left" Alignment ▼
        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
//        jFrame.setLayout(new FlowLayout(0)); // ► "Left" Alignment





        // ▬ (1) "J BUTTON" (ATOMIC CONTAINER) ▬
        // ▼ Creating All "InstanceS"/"ObjectS" of Type "JButton" ▼
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn10 = new JButton("10");


        // ▼ "Setting" the "Buttons Colors" ▼
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.yellow);
        btn4.setBackground(Color.blue);
        btn5.setBackground(Color.magenta);
        btn6.setBackground(Color.orange);
        btn7.setBackground(Color.cyan);
        btn8.setBackground(Color.gray);
        btn9.setBackground(Color.pink);
        btn10.setBackground(Color.darkGray);




        // ▼ "Adding" the "Buttons" to the "jFrame" ▼
        jFrame.add(btn1);
        jFrame.add(btn2);
        jFrame.add(btn3);
        jFrame.add(btn4);
        jFrame.add(btn5);
        jFrame.add(btn6);
        jFrame.add(btn7);
        jFrame.add(btn8);
        jFrame.add(btn9);
        jFrame.add(btn10);
    }
}
