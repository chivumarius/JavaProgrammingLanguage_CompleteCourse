
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
         - "J RADIO BUTTONS" CLASS/ COMPONENT -
                ("ATOMIC CONTAINER")




    ▬ The "JRadioButton" Class
        → is an "Implementation"
        → of a "Radio Button",
        → an "Item"
        → that can be "Selected" or "Deselected"
        → and which "Displays Its State"
        → to the "User".


    ▬ The "JRadioButton"
        → should "Be Added"
        → in a "ButtonGroup"
        → to "Select" only "One Radio Buttons".



    ▬ The "JRadioButton"
        → it is "Widely Used
        → in "Exam Systems" or
        → "Quiz Applications".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;


public class JRadioButton_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("GUI COURSE");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setLayout(new FlowLayout());
        jFrame.setBounds(100,100,1000,1000);
        jFrame.setVisible(true);





       // ▬ (2) "J RADIO BUTTON" (ATOMIC CONTAINER) ▬
       // ▼ Creating new "Instances"/"Objects" of Type "JRadioButton" ▼
       JRadioButton radioBtn1 = new JRadioButton("C");
       JRadioButton radioBtn2 = new JRadioButton("C++");
       JRadioButton radioBtn3 = new JRadioButton("C#");
       JRadioButton radioBtn4 = new JRadioButton("Java");
       JRadioButton radioBtn5 = new JRadioButton("Python");
       JRadioButton radioBtn6 = new JRadioButton("JavaScript");



        // ▼ "FUNCTIONALITY" ▼
        // ▼ "Add Action Listener" → for "Radio Button 1" ▼
        radioBtn1.addActionListener(e -> {
            System.out.println("The " + radioBtn1.getText() + " language is Selected!");
        });


        // ▼ "Add Action Listener" → for "Radio Button 2" ▼
        radioBtn2.addActionListener(e -> {
            System.out.println("The " + radioBtn2.getText() + " language is Selected!");
        });


        // ▼ "Add Action Listener" → for "Radio Button 3" ▼
        radioBtn3.addActionListener(e -> {
            System.out.println("The " + radioBtn3.getText() + " language is Selected!");
        });


        // ▼ "Add Action Listener" → for "Radio Button 4" ▼
        radioBtn4.addActionListener(e -> {
            System.out.println("The " + radioBtn4.getText() + " language is Selected!");
        });


        // ▼ "Add Action Listener" → for "Radio Button 5" ▼
        radioBtn5.addActionListener(e -> {
            System.out.println("The " + radioBtn5.getText() + " language is Selected!");
        });


        // ▼ "Add Action Listener" → for "Radio Button 6" ▼
        radioBtn6.addActionListener(e -> {
            System.out.println("The " + radioBtn6.getText() + " language is Selected!");
        });




        // ▬ (3) "BUTTON GROUP" ▬
        // ▼ Creating an "Instance"/"Object" of Type "ButtonGroup" ▼
        ButtonGroup btnGroup = new ButtonGroup();

        // ▼ "Adding" the "Radio Buttons" to the "ButtonGroup" ▼
        btnGroup.add(radioBtn1);
        btnGroup.add(radioBtn2);
        btnGroup.add(radioBtn3);
        btnGroup.add(radioBtn4);
        btnGroup.add(radioBtn5);
        btnGroup.add(radioBtn6);



        // ▼ "Adding" the "Radio Buttons" to the "JFrame" ▼
        jFrame.add(radioBtn1);
        jFrame.add(radioBtn2);
        jFrame.add(radioBtn3);
        jFrame.add(radioBtn4);
        jFrame.add(radioBtn5);
        jFrame.add(radioBtn6);
    }
}
