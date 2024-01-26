/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 19 •
          ► "STARS PATTERN" ◄



  Requirements:

        • Write a java program 
            → that allows:
            
            1. Entering an Integer "n" 
                → with "Value" between "5" and "15" 
                → and must be an "Odd Number".



            2. Displaying 
                → the "Form" Given here "Below"
                → using "stars", 
                → where "n" 
                → is the "Number" of "Stars"
                → in the "First Line".



              ▬ For "Example":
                → if "n=5",
                → the "Form" will be as "Follows"

                    *****
                    ****
                    ***
                    **
                    *


    • "Note":
        → Use "Nested For" Loops 
        → to Display "Spaces" and "Stars".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;


import java.util.Scanner;



public class Ex19_Stars_Pattern {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "Variables" ▼
        int n, stars, spaces;



        // ▼ "CREATING" AN "SCANNER" OBJECT
        //      → FROM "SCANNER" CLASS
        //      → FOR "STORING THE "ENTERED NUMBERS" ▼
        Scanner scanner = new Scanner(System.in);



        // ▼ "Do{} While{}" Loop
        //      → that "Allow Validation"
        //      → of "Entered Numbers"
        //      → between "5" and "15" ▼
        do {
            // ▼ "Message" for "User" ▼
            System.out.println("Please enter a number: ");

            // ▼ "Storing" the "Entered Number" INSIDE A "STRING" ▼
            n = scanner.nextInt();

        } while (n < 5  || n > 15 || n % 2 == 0);



        // ▬▬▬ "First Stars Triangle" ▬▬
        stars = n;
        spaces = 0;


        // ▼ "For()" Loop
        //      → for the "First Stars Triangle" ▼
        for (int i = 0; i < n; i++) {

            // ▼ "For()" Loop
            //      → to "Display" the "Spaces" ▼
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }


            // ▼ "For()" Loop
            //      → to "Display" the "Stars" ▼
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            // ▼ "NEW LINE" ▼
            System.out.println();

            // ▼ "Updating" the "Variables" ▼
            stars --;
            spaces++;
        }




        // ▬▬▬ "Second Stars Triangle" ("Inverted") ▬▬
        stars = 2;
        spaces = n-2;



        // ▼ "For()" Loop
        //      → for the "Second Stars Triangle" ▼
        for (int i = 0; i < n-1; i++) {

            // ▼ "For()" Loop
            //      → to "Display" the "Spaces" ▼
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }


            // ▼ "For()" Loop
            //      → to "Display" the "Stars" ▼
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            // ▼ "NEW LINE" ▼
            System.out.println();

            // ▼ "Updating" the "Variables" ▼
            spaces--;
            stars ++;

        }

    }
}
