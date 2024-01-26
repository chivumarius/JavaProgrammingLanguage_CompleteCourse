
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
              - "J TOOL BAR" CLASS/ COMPONENT -
                ("INTERMEDIATE CONTAINER")




    ▬ "JToolBar" Container
        → allows us to "Group" other "Components",
        → usually "Buttons" with "Icons"
        → in a "Row" or "Column".


    ▬ "JToolBar"
        → provides a "Component"
        → which is "Useful"
        → for "Displaying"
            •> "Commonly" Used "Actions" or
            •> "Controls".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;



public class JToolbar_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("First GUI FRAME");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setLayout(null);
        jFrame.setVisible(true);



        // ▬ (2) "J TOOL BAR" (INTERMEDIATE CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JToolBar" ▼
        JToolBar jToolBar = new JToolBar();

        // ▼ "Setting" the "jToolBar" ▼
        jToolBar.setBounds(0, 0, 200, 50);
        jToolBar.setRollover(true);


        // ▼ "Adding" the "jToolBar" to the "jFrame" ▼
        jFrame.add(jToolBar);



        // ▬ (3) "J BUTTON" (ATOMIC CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JButton" ▼
        JButton jButton1 = new JButton("File");
        JButton jButton2 = new JButton("Edit");
        JButton jButton3 = new JButton("View");
        JButton jButton4 = new JButton("Build");
        JButton jButton5 = new JButton("Help");

        // "Adding" the "Buttons" to the "jToolBar" ▼
        jToolBar.add(jButton1);

        jToolBar.addSeparator(); // ◄ "Horizontal Space" between "Buttons"
        jToolBar.add(jButton2);

        jToolBar.addSeparator(); // ◄ "Horizontal Space" between "Buttons"
        jToolBar.add(jButton3);

        jToolBar.addSeparator(); // ◄ "Horizontal Space" between "Buttons"
        jToolBar.add(jButton4);

        jToolBar.addSeparator(); // ◄ "Horizontal Space" between "Buttons"
        jToolBar.addSeparator();

        jToolBar.addSeparator(); // ◄ "Horizontal Space" between "Buttons"
        jToolBar.add(jButton5);

    }
}
