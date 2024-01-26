/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                    • "PROGRAM" •
              - "WEBSITE IP FINDER" -



  Requirements:

        • Write a "Java Program"
            → that "Find" an "IP"
            → for "Any Website".
           
 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library.programs;


import javax.swing.*;
import java.awt.*;
import java.net.InetAddress;
import java.net.UnknownHostException;



public class Website_IP_Finder {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("Ip Finder Program");
        jFrame.setBounds(100,100,700,100);
        jFrame.setVisible(true);
        jFrame.setLayout(new GridLayout(1,3));



        // ▼ Creating an "Instance"/"Object" of "JLabel" Type
        //      → to "Display Text" ▼
        JLabel label = new JLabel("Enter URL: ");
        label.setBounds(50,70,150,20);
        jFrame.add(label);



        // ▼ Creating an "Instance"/"Object" of "JTextField" Type
        //      → to "Allow" the "User"
        //      → to "Enter" the "Text" ▼
        JTextField textField = new JTextField();
        textField.setBounds(50,100,200,20);
        jFrame.add(textField);



        // ▼ Creating an "Instance"/"Object" of "JButton" Type ▼
        JButton button = new JButton("Find IP");
        button.setBounds(50,150,80,30);
        button.setBackground(Color.BLUE);
        jFrame.add(button);


        // ▼ "Button Functionality" ▼
        button.addActionListener(e -> {

            // ▼ "Getting" the "Entered Text" from "Text Field" ▼
            String url = textField.getText();

            try {

                // ▼ "Getting" the "InetAddress" ▼
                InetAddress inetAddress = InetAddress.getByName(url);

                // ▼ "Getting" the "IP" ▼
                String ip = inetAddress.getHostAddress();

                // ▼ Displaying "Show Message Dialog" ▼
                JOptionPane.showMessageDialog(jFrame,"The IP is: " + ip);

            } catch (UnknownHostException unknownHostException) {
                unknownHostException.printStackTrace();
            }
        });

    }
}
