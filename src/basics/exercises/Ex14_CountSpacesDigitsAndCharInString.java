/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 14 •
      ► "COUNT": "SPACES", "DIGITS" AND "CHAR" IN "STRING" ◄



  Requirements:

        • Write a "Java Program"
            → that "Counts" the
                •► "Letters",
                •► "Spaces",
                •► "Numbers" and
                •► "Characters"
            → of an "Input String".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;


import java.util.Scanner;



public class Ex14_CountSpacesDigitsAndCharInString {


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



        // ▬▬▬ (STEP 2) "COUNTING" THE "STRING CHARACTERS" ▬▬▬
        // ▼ "CONVERTING" THE "STRING"
        //      → INTO "CHARACTER ARRAY" ▼
        char[] charArray = enteredText.toCharArray();


        // ▼ "VARIABLE" TO "COUNT" THE "CHARACTERS" ▼
        int spaces = 0;
        int letters = 0;
        int digits = 0;
        int otherCharacters = 0;


        // ▼ USING "FOR()" LOOP
        //      → TO "CHECK" IF THE "CHAR ARRAY"
        //      → IS "SPACE", "LETTER" OR "NUMBER" ▼
        for(int i = 0; i < enteredText.length(); i++) {

            if(Character.isDigit(charArray[i])) {
                digits++;
            } else if(Character.isAlphabetic(charArray[i])) {
                letters++;
            } else if(Character.isSpaceChar(charArray[i])) {
                spaces++;
            } else {
                otherCharacters++;
            }
        }



        // ▼ DISPLAYING THE "RESULTS" ▼
        System.out.println("Spaces: " + spaces);
        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + digits);
        System.out.println("Other characters: " + otherCharacters);





        // ▼ LOOPING THROUGH THE "CHARACTER ARRAY"
        //      → TO GET "EACH CHARACTER"
        //      → OF "ARRAY" ▼
//       for(int i = 0; i < charArray.length; i++) {
//            // ▼ "DISPLAYING" THE "CHARACTER" ▼
//            System.out.println(charArray[i]);
//        }

    }
}
