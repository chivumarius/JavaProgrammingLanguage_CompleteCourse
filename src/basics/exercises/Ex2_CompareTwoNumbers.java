/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 2 •
        - COMPARE 2 NUMBERS -



  Requirements:

        • Write a "Java Program"
            → that "Compares 2 Numbers"
            → "Entered" by "User".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;


import java.util.Scanner;



public class Ex2_CompareTwoNumbers {

    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "CREATING" AN "SCANNER" OBJECT
        //      → FROM "SCANNER" CLASS
        //      → FOR "STORING THE "ENTERED NUMBERS" ▼
        Scanner scanner = new Scanner(System.in);

        // ▼ "DECLARATION" OF "VARIABLES" ▼
        int number1, number2;


        // (1) "FIRST MESSAGE" IN THE "CONSOLE":
        System.out.println("Please enter the first number: ");

        // ▼ "STORING" THE "FIRST ENTERED NUMBER" ▼
        number1 = scanner.nextInt();



        // (2) "SECOND MESSAGE" IN THE "CONSOLE":
        System.out.println("Please enter the second number: ");

        // ▼ "STORING" THE "SECOND ENTERED NUMBER" ▼
        number2 = scanner.nextInt();



        // ▬ "FUNCTIONALITY" OF "NUMBER COMPARISONS"
        //      → USING "CONDITIONAL STATEMENTS" ▬
        if(number1 > number2) {
            System.out.print("Number 1 is greater");
        } else if(number1 < number2) {
            System.out.print("Number 2 is greater");
        } else {
            System.out.print("The numbers are equal!");
        }
    }
}
