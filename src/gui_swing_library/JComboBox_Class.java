
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
          - "J COMBO BOX" CLASS/ COMPONENT -
                ("ATOMIC CONTAINER")




    ▬ The "JComboBox" Class
        → is a "Component"
        → which "Combines" a
            • "Button" or "Editable Field" and a
            • "Drop-Down List".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;


public class JComboBox_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("First GUI FRAME");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100, 100, 1000, 1000);
        jFrame.setLayout(null);
        jFrame.setVisible(true);



        // ▼ Creating an "Array" of "Strings" ▼
        String[] languages = {"Java", "C#", "C++"};


        // ▬ (2) "J COMBO BOX" (ATOMIC CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JTextField" ▼
        JComboBox comboBox = new JComboBox(languages);
        comboBox.setBounds(50, 50, 200, 20);
        jFrame.add(comboBox);

        // ▼ "Action Listener" → for "comboBox" ▼
        comboBox.addActionListener(e -> {
            // ▼ Getting the "Selected Item" ▼
            String language = (String) comboBox.getSelectedItem();


            // ▼ "Cases Detection" ▼
            switch (language) {
                case "Java" -> jFrame.getContentPane().setBackground(Color.red);
                case "C#" -> jFrame.getContentPane().setBackground(Color.yellow);
                case "C++" -> jFrame.getContentPane().setBackground(Color.green);
            }
        });
    }
}
