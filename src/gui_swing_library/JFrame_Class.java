
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
              - "J FRAME" CLASS/ COMPONENT -
                ("TOP-LEVEL CONTAINER")



    ▬ The "JFrame" Class
        → is a "Type" of "Container"
        → which "Inherits" the "java.awt.Frame" Class.


     ▬ "JFrame"
        → is a "Top-Level Component"
        → that Includes "All Other Components" ("Text", "Buttons", "Menu").


     ▬ "JFrame"
        → works like the "Main Window"
        → where "Components" like:
            • "labels",
            • "buttons",
            • "text Fields"
       → are "Added"
       → to "Create" a "GUI".


    ▬ "Unlike Frame", "JFrame"
        → has the "Option"
        → to "Hide" or "Cose" the "Window"
        → with the "Help"
        → of "setDefaultCloseOperation(int)" Method.


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;

import javax.swing.*;


// ▬ Creating "JFrame"
//      → by "Extending" our "Class" with "JFrame" ▬
public class JFrame_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("First GUI FRAME");


        // ▼ "Setting" the "Bounds" of the "JFrame" ▼
        jFrame.setBounds(200, 200, 1000, 1000);

        // ▼ "Setting" the "Layout" of the "JFrame" ▼
        jFrame.setLayout(null);

        // ▼ "Setting" the "Visibility" of the "JFrame" ▼
        jFrame.setVisible(true);

        // ▬ Creating a "Constructor" ▬
//        new JFrame_Class();
    }

    // ▬ Creating a "Constructor" ▬
    // ▬ The "Commanded Way":
    //      → "Set" the "JFrame"
    //      → in the "Constructor" ▬
//    public JFrame_Class() {
//        setTitle("First GUI FRAME");
//        setBounds(100, 100, 1000, 1000);
//        setLayout(null);
//        setVisible(true);
//    }
}
