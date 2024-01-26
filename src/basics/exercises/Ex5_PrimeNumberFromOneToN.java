/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 5 •
      ► "PRIME NUMBER" FROM "1" TO "N" ◄



  Requirements:

        • Write a "Java Program"
            → to Display "Prime Numbers"
            → from "1" to "n"
            → "Entered" by "User".

   Mathematical Explanation:

            "Prime Number"    "Dividers"        "Counter"
        •       7       →     1, 7         =       2
        •       8       →     1, 2, 4, 8   =       4

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;


import java.util.Scanner;



public class Ex5_PrimeNumberFromOneToN {

    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "CREATING" AN "SCANNER" OBJECT
        //      → FROM "SCANNER" CLASS
        //      → FOR "STORING THE "ENTERED NUMBERS" ▼
        Scanner scanner = new Scanner(System.in);


        // (STEP 1) "GETTING NUMBER" FROM "USER":
        // ▼ "MESSAGE" IN THE "CONSOLE" ▼
        System.out.println("Please enter a number: ");

        // ▼ "STORING" THE "ENTERED NUMBER" ▼
        int number = scanner.nextInt();
        int nr;


        // (STEP 2) "ALGORITHM" OF "PRIME NUMBER":

        // ▼ CREATING A "EMPTY STRING" (WE CAN USE "ARRAY") ▼
        StringBuilder primeNumbers = new StringBuilder();



        // ▼ "ITERATION" ACCORDING TO THE "ENTERED NUMBER" BY THE "USER" ▼
        for(int i = 1; i <= number; i++) {

            // ▼ VARIABLE ▼
            int counter = 0;

            // ▼ UNVERSED LOOP FOR DIVISION ▼
            for(nr = i; nr >= 1; nr--){

                if(i%nr == 0){
                      counter++;
                }
            }


            if (counter == 2) {

                // ▼ "APPENDING" THE "PRIME NUMBERS" TO THE "STRING" ▼
                primeNumbers.append(i).append(" ");
            }
        }

        System.out.print("The prime numbers from 1 to n are: " + primeNumbers);

    }
}
