/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 25 •
       ► "DIVISIBILITY" ◄




    ▬ (Q1) "Question 1":

        • Write a "divisible()" Method
            → that "Takes" in "Parameter"
            → "Two Integers":
                •> "x" and
                •> "y"
            → and "Returns"
            → "How Many Times"
                •> "x" is "Divisible" by "y" and
                •> -1" if "x" is "Not Divisible" by "y".


        • "Examples"
            x= 136, y = 5:
                → 136 is Divisible "O Times" by "5".

            X= 384, y = 4:
                → "384" is Divisible "4 Times" by "4".





    ▬ (Q2) "Question 2":
        • Write a "Divisible" Class
            → that allows enterinc two integers a and b and produces the following output after applyinc the method divisible.

        • "Example":
            •> Enter two integers: 144 4
                → "144" is "Divisible 3 Times" by "4"

            •> Enter two integers: 625 5
                → "625" is "Divisible 4 times" by "5"

            •> Enter two integers: 766 12
                → "766" is "Not Divisible" by "12".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;


import java.util.Scanner;




public class Ex25_Divisibility {


    // ▬ First Run Method ▬
    public static void main(String[] args){

        // ▬ (Q2) "Question 2": "Divisible()" Method ▬

        // ▼ "Creating" a "Scanner" Object
        //      → for "Enter Data" ▼
        Scanner scanner = new Scanner(System.in);

        // ▼ "Displaying" the "Message" in the "Console" ▼
        System.out.println("Enter 2 Numbers");

        // ▼ "Storing" the "User Inputs"
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // ▼ "Calling" the "Divisible()" Method
        int  m = Divisible(x, y);

        // ▼ "Displaying" the "Message"
        System.out.println(" " + m + " Times");
    }




    // ▬ (Q1) "Question 1": "Divisible()" Method ▬
    public static int Divisible(int x, int y){

        // ▼ "Checking" if "x" is "Not Divisible" by "y" ▼
        if(x % y != 0) return -1;

        int c = 0;


        while(x / y != 0 && x % y == 0){
            // ▼ "Dividing" "x" by "y" ▼
            x /= y;  // x = x / y
            c++;
        }

        //
        return c;
    }

}
