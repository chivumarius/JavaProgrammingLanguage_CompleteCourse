/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 18 •
        ► "BINARY TO DECIMAL" ◄



  Requirements:

        • Write a Java program
            → that allows Entering, One by One,
            → "8 Integers" with "Binary Signification"
            → "O" or "1",
            → and "Calculating"
            → the "Decimal Number"
            → that is "Equivalent"
            → to this "Binary Series".



    • Note that:
        → to "Convert"
        → a "Number" in "Binary" representation
        → into "Decimal" representation,
        → you must "Proceed"
        → as "Follows":

        ▬ For "Example":
            → a "Number" with "4 Binary Digits": 110 1
            → will be "Converted" to "Decimal" Representation
            → by Taking "Digits"
            → from "Right" to "Left":

                (1 * 2^0) + (0 * 2^1) + (1 * 2^2) + (1 * 2^3) = 13

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;


import java.util.Scanner;


public class Ex18_Binary_to_Decimal {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "Variables" ▼
        int binaryNumber, decimalNumber = 0, sum = 0;



        // ▼ "Creating" a "Scanner" Object
        //      → for "Getting" the "Entered Data" ▼
        Scanner scanner = new Scanner(System.in);



        // ▼ "Do{} While{}" Loop
        //      → that "Allow Validation"
        //      → of "Entered Numbers"
        //      → of "0" and "1" ▼
        do {
            // ▼ "Message" for "User" ▼
            System.out.println("Please enter a Binary Digit (0 or 1): ");

            // ▼ "Storing" the "Entered Number" INSIDE A "STRING" ▼
            binaryNumber = scanner.nextInt();



            // ▼ "Checking" ▼
            if( binaryNumber != 0 && binaryNumber != 1 ){
                continue;
            }

            sum += Math.pow(2, decimalNumber) * binaryNumber;
            decimalNumber++;

        } while (decimalNumber < 8);


        // ▼ "CONSOLE DISPLAY" ▼
        System.out.println("TThis is the equivalent in Decimal : " + sum);
    }
}
