/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 21 •
       ► "DATE FORMAT VALIDATION" ◄



  Requirements:

        • Write a Java program
            → that allows:

        1 - "Entering" a "Positive Integer"
            → of "8 Digits",
            → for Example "27032016"
            → (you must "Validate" this "Condition"),


        2 - "Decompose" this "Number"
            → in order to "Form" a "Date"
            → and Obtain "Three Integer" Values:
                •► Day,
                •► Month and
                •► Year.


                ▬ For Example:
                    → day = 17;
                    → month = 04;
                    → year = 2020;



        3 - "Verifying" after "Decomposition",
                → if the "Obtained Values"
                → form a "Valid Dte".


        4 - "Displaying" the "Date" as:
                    •► day/month/year
                → and "Indicate"
                → if "It" is a "Valid Date"
                → or "Not".



    • "Note":
        1 - Use "Operators"
            → "%" and "/"
            → to "Decompose"
            → the "Number".


        2 - The "Month"
            → must be Between "1" and "12".


        3- The "Day"
            → must be Between "1"
            → and the "Number" of "Days"
            → of the respective "Month".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;



import java.util.Scanner;



public class Ex21_Date_Format_Validation {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "Variables" ▼
        int n, d, m, y, daysNumber;



        // ▼ "Creating" an "Scanner" Object
        //      → for "Getting" the "Entered Data" ▼
        Scanner scanner = new Scanner(System.in);



        // ▼ "Do{} While{}" Loop
        //      → that "Allow Validation"
        //      → of "Entered Numbers"
        //      → of "0" and "1" ▼
        do {
            // ▼ "Message" for "User" ▼
            System.out.println("Enter a date in form of 8 Digits: ");

            //
            n = scanner.nextInt();
        } while (n < 1010000 || n > 31129999);



        // ▼ Getting "Day", "Month", "Year" ▼
        y = n % 10000;
        n /= 10000;
        m = n % 100;
        d = n /100;



        // ▼ "Validation" ▼
        if (m > 1 && m < 12){

            // ▼ "Months Validation" ▼
            // ▼ "Days Number" for "Each Month" ▼
            switch (m) {

                // ▼ "Months" with "31 Days" ▼
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysNumber = 31;
                    break;


                // ▼ "Months" with "30 Days" ▼
                case 4:
                case 6:
                case 9:
                case 11:
                    daysNumber = 30;
                    break;


                // ▼ "Months" with "28 or 29 Days" ▼
                default:
                    // ▼ "Leap Year" ▼
                    if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0)){
                        daysNumber = 29;    // ► "February Days" in "Leap Year" = "29"
                    } else {
                        daysNumber = 28;
                    }
            }



            // ▼ "Days Validation" ▼
            if (d >= 1 && d <= daysNumber){
                System.out.println(d + "/"+ m + "/"+ y + " is a Valid Date");
            } else {
                System.out.println(d + "/" + m + "/" + y + " is Not a Valid Date");
            }

        } else{
            System.out.println(d + "/" + m + "/" + y + " is Not a Valid Date");
        }
    }
}
