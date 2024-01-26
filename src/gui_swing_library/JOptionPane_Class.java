
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
            - "J OPTION PANE" CLASS/ COMPONENT -




    ▬ The "JOptionPane" Class
        → is used to provide
        → "Standard Dialog Boxes" such asl
            • "Message Dialog Box",
            • "Confirm Dialog Box" and
            • "Input Dialog Box".


    ▬ "Dialog Boxes"
        → are "Used"
        → to "Display Information"
        → or "Get Input"
        → from the "User".


    ▬ The "JOptionPane" Cass
        → Inherits "JComponent" Class.


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;

import javax.swing.*;


public class JOptionPane_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {


       // ▼ Calling ".showInputDialog()" Method
       //      → to Obtaining "User Input"
       //      → from "JOptionPane" Component ▼
       String firstName = JOptionPane.showInputDialog("Enter First Integer");
       String secondName = JOptionPane.showInputDialog("Enter Second Integer");



       // ▼ Converting the "String Inputs"
        //      → to "Int Value"
        //      → for using it in a "Calculation" ▼
        int firstNumber = Integer.parseInt(firstName);
        int secondNumber = Integer.parseInt(secondName);


        // ▼ Calculating the "Sum" of "Two Numbers" ▼
        int sum = firstNumber + secondNumber;


        // ▼ "Displaying" the "Result"
        //      → in "JOptionPane" Component
        //      → by Calling ".showMessageDialog()" Method ▼
        JOptionPane.showMessageDialog(
                null,
                "The Sum is: " + sum,
                "Sum of Two Integers",
                JOptionPane.PLAIN_MESSAGE
        );
    }

}
