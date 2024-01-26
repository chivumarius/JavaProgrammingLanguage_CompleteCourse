
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
              - "J SCROLL PANE" CLASS/ COMPONENT -
                ("INTERMEDIATE CONTAINER")




    ▬ A "JScrollPane"
        → is "Used" to Make "Scrollable View"
        → of a "Component".


    ▬ When "Screen Size"
        → is "Limited",
        → we Use a "Scroll Pane"
        → to "Display" a "Large Component"
        → or a "Component" whose "Size"
        → can "Change Dynamically".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;


public class JScrollPane_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("First GUI FRAME");


        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 500);
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



        // ▬ (3) "J SCROLL PANE" ▬
        // ▼ Creating an "Instance"/"Object" of Type "JScrollPane" ▼
        JScrollPane scrollPane = new JScrollPane();


        // ▼ "Setting" the "JScrollPane" ▼
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(100, 100, 400, 400);


        // ▼ "Adding" the "JScrollPane" to the "iFrame" ▼
        jFrame.add(scrollPane);

    }
}
