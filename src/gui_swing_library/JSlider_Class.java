
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
            - "J SLIDER" CLASS/ COMPONENT -
                ("ATOMIC CONTAINER")




    ▬ The "JSlider" Cass
        → is "Used"
        → to "Create" the "Slider".


    ▬ By using "JSlider",
        → a "User" can "Select" a "Value"
        → from a "Specific Range".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;
import java.awt.*;


public class JSlider_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("GUI COURSE");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setLayout(new FlowLayout());
        jFrame.setBounds(100,100,1000,1000);
        jFrame.setVisible(true);





       // ▬ (2) "J SLIDER" (ATOMIC CONTAINER) ▬
       // ▼ Creating an "Instance"/"Object" of Type "JSlider" ▼
       JSlider jSlider = new JSlider(JSlider.HORIZONTAL,0,100,50);

       // ▼ "Adding" the "jSlider" to the "jFrame" ▼
       jFrame.add(jSlider);

       // ▼ "Slider Functionality" by "Add Change Listener" Method ▼
        jSlider.addChangeListener(e -> {

            // ▼ Getting the "Selected Value" of the "JSlider" ▼
            int sliderValue = jSlider.getValue();

            // ▼ Printing the "Selected Value" of the "JSlider" ▼
            System.out.println("\nSlider Selected Value: " + sliderValue);
        });
    }
}
