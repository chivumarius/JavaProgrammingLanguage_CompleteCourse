
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
              - "J TABBED PANE" CLASS/ COMPONENT -
                ("INTERMEDIATE CONTAINER")




    ▬ The "JTabbedPane" Class
        → is used to "Switch"
        → between a "Group" of "Components"
        → by "Clicking" on a "Tab"
        → with a Given
            • "Title" or
            • "Icon".



    ▬ It "Inherits"
        → "JComponent" Class.


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;



public class JTabbedPane_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("First GUI FRAME");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setLayout(null);
        jFrame.setVisible(true);



        // ▬ (2) "J PANEL" (INTERMEDIATE CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JPanel" ▼
        JPanel mainPamel = new JPanel();
        JPanel salePamel = new JPanel();
        JPanel contactPamel = new JPanel();


        // ▼ "Setting" the "Color" for "Each JPanel" ▼
        mainPamel.setBackground(Color.BLUE);
        salePamel.setBackground(Color.GREEN);
        contactPamel.setBackground(Color.YELLOW);




        // ▬ (3) "J TABBED PANE" (INTERMEDIATE CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JTabbedPane" ▼
        JTabbedPane jTabbedPane = new JTabbedPane();

        // ▼ "Setting" the "JTabbedPane" ▼
        jTabbedPane.setBounds(50, 50, 200, 200);


        // ▼ "Adding" the "JPanel" Objects to the "JTabbedPane" ▼
        jTabbedPane.add("Main", mainPamel);
        jTabbedPane.add("Sale", salePamel);
        jTabbedPane.add("Contact", contactPamel);


        // ▼ Adding the "jTabbedPane" to the "jFrame" ▼
        jFrame.add(jTabbedPane);
    }
}
