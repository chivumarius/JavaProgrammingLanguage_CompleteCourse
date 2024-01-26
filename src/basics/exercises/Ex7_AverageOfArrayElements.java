/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 7 •
      ► "AVERAGE" OF "ARRAY ELEMENTS" ◄



  Requirements:

        • Write a "Java Program"
            → that "Allow" the "User"
            → to "Enter" - "10 Numbers"
            → and "Gives" their "Average".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;

import java.util.Scanner;


public class Ex7_AverageOfArrayElements {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▬▬▬ (STEP 1) ▬▬▬
        // ▼ "MESSAGE" IN THE "CONSOLE" ▼
        System.out.println("Please enter 10 numbers to find their average: ");


        // ▼ "CREATING" AN "SCANNER" OBJECT
        //      → FROM "SCANNER" CLASS
        //      → FOR "STORING THE "ENTERED VALUES" ▼
        Scanner scanner = new Scanner(System.in);




        // ▬▬▬ (STEP 2) ▬▬▬
        // ▼ "DECLARING" AN "ARRAY" OF "SIZE 10" ▼
        int[] numberArray = new int[10];


        // ▼ "FOR()" LOOP
        //      → TO "INSERT" & "SORE ELEMENTS"
        //      → INTO "ARRAY" ▼
        for(int i = 0; i < numberArray.length; i++) {
            // ▼ "STORING" THE "ALL ENTERED VALUES" INSIDE "ARRAY" ▼
            numberArray[i] = scanner.nextInt();
        }




        // ▬▬▬ (STEP 3) ▬▬▬
        // ▼ CREATING "VARIABLES" WITH A "STARTING VALUE" ▼
        int sum = 0;
        double average = 0d;


        // ▼ "FOR()" LOOP
        //      → TO "GET" THE "SUM" OF "ALL ELEMENTS"
        //      → OF "ARRAY" ▼
//        for(int i = 0; i < numberArray.length; i++) {
//            // ▼ "ADDING EACH ELEMENT" OF "ARRAY"
//            //      → TO THE "SUM" ▼
//            sum = sum + numberArray[i];     // sum += numberArray[i]
//        }




        // ▼ "FOR EACH()" LOOP
        //      → TO "GET" THE "SUM" OF "ALL ELEMENTS"
        //      → OF "ARRAY" ▼
        for(int i : numberArray) {
            // ▼ ADDING "EACH ELEMENT"
            //      → TO "SUM" VARIABLE ▼
            sum = sum + i;   // sum += i
        }



        // ▼ "CALCULATION" OF THE "ARRAY AVERAGE" ▼ELEMENT
        average = (double) sum / numberArray.length;


        // ▼ "CONSOLE DISPLAY" ▼
        System.out.println("The average is: "+ average);
    }
}
