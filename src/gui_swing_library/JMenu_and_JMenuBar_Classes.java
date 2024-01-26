
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
          - "J MENU" & "J MENU BAR" CLASSES/ COMPONENTS -
                ("ATOMIC CONTAINERS")





    ▬ The "JMenuBar" Class
        → is "Used" to Display "Menu Bar"
        → on the "Window"
        → or "Frame".


    ▬ "JMenuBar"
        → may have "Several Menus".


    ▬ The "JMenu" Class
        → is a "Pull Down Menu" Component
        → which is "Displayed"
        → from the "Menu Bar".


    ▬ "JMenu"
        → "inherits" the "JMenuItem" Class.


    ▬ The "JMenuItem" Class
        → "Adds" a Simple "Labeled Menu Item".


    ▬ The "Items"
        → Used in a "Menu"
        → must "Belong"
        → to the "JMenuItem"
        → or any of "Its Sub-Class".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;


public class JMenu_and_JMenuBar_Classes {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (0) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("GUI COURSE");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setLayout(null);
        jFrame.setBounds(100,100,1000,1000);
        jFrame.setVisible(true);





       // ▬ (1) "J MENU BAR" (ATOMIC CONTAINER) ▬
       // ▼ Creating am "Instance"/"Object" of Type "JMenuBar" ▼
       JMenuBar menuBar = new JMenuBar();

       // ▼ "Adding" the "JMenuBar" to the "jFrame" ▼
       jFrame.setJMenuBar(menuBar);


        // ▬ (2) "J MENU" (ATOMIC CONTAINER) ▬
        // ▼ Creating am "Instance"/"Object" of Type "JMenu" ▼
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu toolsMenu = new JMenu("Tools");
        JMenu helpMenu = new JMenu("Help");

        // ▼ "Adding" All "JMenu" to the "JMenuBar" ▼
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(toolsMenu);
        menuBar.add(helpMenu);



        // ▬ (3) "J MENU ITEMS" (ATOMIC CONTAINER) ▬
        // ▼ (3-1-1) The "File Menu Items" ▼
        JMenuItem fileMenuItem1 = new JMenuItem("New");
        JMenuItem fileMenuItem2 = new JMenuItem("Open");
        JMenuItem fileMenuItem3 = new JMenuItem("Save");
        JMenuItem fileMenuItem4 = new JMenuItem("Exit");




        // ▼ (3-1-2) "Adding" the "File Menu Item1" to the "File Menu" ▼
        fileMenu.add(fileMenuItem1);
        fileMenu.add(fileMenuItem2);
        fileMenu.add(fileMenuItem3);
        fileMenu.add(fileMenuItem4);


        // ▼ (3-1-3.1) "Add Action Listener" to the "File Menu Item1" ▼
        fileMenuItem1.addActionListener(e -> {

                // ▼ "Getting" the "Entered Text" from the "textArea" ▼
                String menuItemName1 = fileMenuItem1.getText();

                // ▼ Displaying the "Entered Text" ▼
                System.out.println(menuItemName1);
        });

        // ▼ (3-1-3.2) "Add Action Listener" to the "File Menu Item1" ▼
        fileMenuItem2.addActionListener(e -> {

            // ▼ "Getting" the "Entered Text" from the "textArea" ▼
            String menuItemName2 = fileMenuItem2.getText();

            // ▼ Displaying the "Entered Text" ▼
            System.out.println(menuItemName2);
        });


        // ▼ (3-1-3.3) "Add Action Listener" to the "File Menu Item1" ▼
        fileMenuItem3.addActionListener(e -> {

            // ▼ "Getting" the "Entered Text" from the "textArea" ▼
            String menuItemName3 = fileMenuItem3.getText();

            // ▼ Displaying the "Entered Text" ▼
            System.out.println(menuItemName3);
        });

        // ▼ (3-1-3.4) "Add Action Listener" to the "File Menu Item1" ▼
        fileMenuItem4.addActionListener(e -> {

            // ▼ "Getting" the "Entered Text" from the "textArea" ▼
            String menuItemName4 = fileMenuItem4.getText();

            // ▼ Displaying the "Entered Text" ▼
            System.out.println(menuItemName4);
        });






        // ▼ (3-2.1) The "Edit Menu Items" ▼
        JMenuItem editMenuItem1 = new JMenuItem("Edit Item 1");
        JMenuItem editMenuItem2 = new JMenuItem("Edit Item 2");
        JMenuItem editMenuItem3 = new JMenuItem("Edit Item 3");


        // ▼ (3-2.2) "Adding" the "Edit Menu Item1" to the "Edit Menu" ▼
        editMenu.add(editMenuItem1);
        editMenu.add(editMenuItem2);
        editMenu.add(editMenuItem3);




        // ▼ (3-3.1) The "View Menu Items" ▼
        JMenuItem viewMenuItem1 = new JMenuItem("View Item 1");
        JMenuItem viewMenuItem2 = new JMenuItem("View Item 2");
        JMenuItem viewMenuItem3 = new JMenuItem("View Item 3");


        // ▼ (3-3.2) "Adding" the "View Menu Item1" to the "View Menu" ▼
        viewMenu.add(viewMenuItem1);
        viewMenu.add(viewMenuItem2);
        viewMenu.add(viewMenuItem3);



        // ▼ (3-4.1) The "Tool Menu Items" ▼
        JMenuItem toolMenuItem1 = new JMenuItem("Tool Item 1");
        JMenuItem toolMenuItem2 = new JMenuItem("Tool Item 2");
        JMenuItem toolMenuItem3 = new JMenuItem("Tool Item 3");



        // ▼ (3-4.2) "Adding" the "Tool Menu Item1" to the "Tool Menu" ▼
        toolsMenu.add(toolMenuItem1);
        toolsMenu.add(toolMenuItem2);
        toolsMenu.add(toolMenuItem3);



        // ▼ (3-5.1) The "Help Menu Items" ▼
        JMenuItem helpMenuItem1 = new JMenuItem("Help Item 1");
        JMenuItem helpMenuItem2 = new JMenuItem("Help Item 2");
        JMenuItem helpMenuItem3 = new JMenuItem("Help Item 3");


        // ▼ (3-4.2) "Adding" the "Help Menu Item1" to the "Help Menu" ▼
        helpMenu.add(helpMenuItem1);
        helpMenu.add(helpMenuItem2);
        helpMenu.add(helpMenuItem3);
    }
}
