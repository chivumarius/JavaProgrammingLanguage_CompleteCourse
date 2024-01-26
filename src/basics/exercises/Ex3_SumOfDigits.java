/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 3 •
          ► SUM OF DIGITS ◄



  Requirements:

        • Write a "Java Program"
            → that "Compute" the "Sum" of "Digits"
            → for a "Number".


  Mathematical Explanation:


             (/100)  (/10)   (/1)
        27   =         20  +  7    =  2  +  7
        428  = 400   + 20  +  8    =  4  + 2  + 8

        sum = 0 + 27
        sum = 27 + 7


        number = 7
        number = 0


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;


import java.util.Scanner;


public class Ex3_SumOfDigits {

    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "CREATING" AN "SCANNER" OBJECT
        //      → FROM "SCANNER" CLASS
        //      → FOR "STORING THE "ENTERED NUMBERS" ▼
        Scanner scanner = new Scanner(System.in);


        // ▼ "MESSAGE" IN THE "CONSOLE" ▼
        System.out.println("Please enter a number to sum its digits: ");


        // ▼ "STORING" THE "ENTERED NUMBER" ▼
        int number = scanner.nextInt();


        // ▼ "SUM" OF "DIGITS" ▼
        int sum = 0;




        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ -
        // ▬ "WHILE(){...}" LOOP
        //          → IT WILL "TEST" A  "CONDITION"
        //          → ABD "THEN" IT WILL  "DO  SOMETHING" ▬
        while (number != 0){

            // ▼ "RE-ASSIGNMENT" OF "VARIABLES" ▼
            sum = sum + (number % 10);
            number = number / 10;

        }

        //
        System.out.print("The sum of the digits of the number is: " + sum);

    }
}
