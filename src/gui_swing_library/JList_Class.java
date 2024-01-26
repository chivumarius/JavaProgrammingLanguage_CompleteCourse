
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
            - "J LIST" CLASS/ COMPONENT -
                ("ATOMIC CONTAINER")




    ▬ The "JList" Class
        → is a "Component" 
        → which "Displays" a "List" of "Objects" 
        → and Allows the User 
        → to "Select" One or More "Items". 

    
    ▬ "ListModel" 
        → is a "Separate Model"
        → that "Maintains" 
        → the "Contents" of the "List".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;


public class JList_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("GUI COURSE");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setLayout(new FlowLayout());
        jFrame.setBounds(100,100,1000,1000);
        jFrame.setVisible(true);




        // ▬ (2) "DEFAULT LIST MODEL" ▬
        // ▼ Creating an "Instance"/"Object" of Type "DefaultListModel" ▼
        DefaultListModel<String> listModel = new DefaultListModel();

        // ▼ "Setting" the "listModel" ▼
        listModel.add(0, "Java");
        listModel.add(1, "C");
        listModel.add(2, "C#");
        listModel.add(3, "C++");
        listModel.add(4, "Python");



       // ▬ (3) "J LIST" (ATOMIC CONTAINER) ▬
       // ▼ Creating an "Instance"/"Object" of Type "JList" ▼
        JList<String> jList = new JList(listModel);

       // ▼ "Setting" the "jList" ▼
        jList.setBounds(100,100,400,400);


       // ▼ "Adding" the "jList" to the "jFrame" ▼
       jFrame.add(jList);




       // ▬ (4) "J BUTTON" (ATOMIC CONTAINER) ▬
       // ▼ Creating an "Instance"/"Object" of Type "JButton" ▼
       JButton jButton = new JButton("Get Selected Items");
       jButton.setBackground(Color.blue);


       // ▼ "Action Listener" for the "jButton" ▼
        jButton.addActionListener(e -> {

            // ▼ Getting "Single Selected Item" ▼
//              System.out.println(jList.getSelectedValue());


            // ▼ Getting "Multiple Selected Item" ▼
            for (Object item : jList.getSelectedValues()){
                System.out.println(item);
            }
        });

        // ▼ "Adding" the "jButton" to the "jFrame" ▼
       jFrame.add(jButton);
    }
}
