/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 15 •
      ► "REVERSE STRING" ◄



  Requirements:

        • Write a "Java Program"
            → that "Reverses"
            → an "Entered String".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;


import java.util.Scanner;



public class Ex15_ReverseString {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▬▬▬ (STEP 1) ▬▬▬
        // ▼ "MESSAGE" IN THE "CONSOLE" ▼
        System.out.println("Please enter a text: ");

        // ▼ "CREATING" AN "SCANNER" OBJECT
        //      → FROM "SCANNER" CLASS
        //      → FOR "STORING THE "ENTERED NUMBERS" ▼
        Scanner scanner = new Scanner(System.in);

        // ▼ "STORING" THE "ENTERED TEXT" INSIDE A "STRING" ▼
        String enteredText = scanner.nextLine();



        // ▬▬▬ (STEP 2) "REVERSING" THE "STRING CHARACTERS"
        //                  → BY "CONVERTING" THE "STRING" ▬▬▬
        //                   → INTO "CHARACTER ARRAY" ▼

        // ▼ "EMPTY VARIABLE" ▼
        String reversedText = "";


        // ▼ "CONVERTING" THE "STRING"
        //      → INTO "CHARACTER ARRAY" ▼
        char[] charArray = enteredText.toCharArray();


        // ▼ "REVERSE LOOP"
        //      → AND "REVERSE TEXT STORAGE"
        //      → "STRAIN" FROM "LAST INDEX"
        //      → "STOPPING" TO "FIRST INDEX" ▼
        for (int i = charArray.length - 1; i >= 0; i--) {

            // ▼ "RE-ASSIGNING" THE "VARIABLE" ▼
            reversedText = reversedText + charArray[i];   // ► reversedText += charArray[i];
        }


        // ▼ "CONSOLE DISPLAY" ▼
        System.out.println(reversedText);

    }
}
