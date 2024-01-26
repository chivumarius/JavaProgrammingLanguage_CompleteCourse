/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 11 •
      ► "REVERSE ARRAY ELEMENTS" ◄



  Requirements:

        • WWrite a "Java Program"
            → that "Reverses"
            → an "Array".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;


import java.util.Arrays;



public class Ex11_ReverseArrayElements {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "CREATING" A "STATIC ARRAY" OF "SIZE 9" ▼
        int[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };


        // ▼ "FOR()" LOOP
        //      → TO "REVERSE" THE "ARRAY"
        //      → BY "SWIPING EACH ARRAY ELEMENT"
        //        ("STARTING" FROM THE "FIRST ELEMENT"
        //         WITH "INDEX 0" [i]) ▼
        for(int i = 0; i < numberArray.length / 2; i++) {

            // ▼ "STORING" EACH "INDEX" OF "1ST HALF" OF "ARRAY"
             //      → FOR "EXAMPLE": "INDEX 0" ▼
             int indexOfFirstHalfOfArray = numberArray[i];

             // ▼ THE "FIST ELEMENT" WITH "INDEX 0"
             //     → "GOES INSTEAD" OF
            //      → "LAST ELEMENT" WITH "INDEX 8" [ "(9 - 0) - 1" ] ▼
             numberArray[i] = numberArray[(numberArray.length - i) - 1];

             // ▼ THE "LAST ELEMENT"
             //     → WITH "INDEX 8" [ "(9 - 0) - 1" ]
             //     → "COMES INSTEAD" OF
             //     → "INDEX 0" ▼
             numberArray[(numberArray.length - i) - 1] = indexOfFirstHalfOfArray;
        }


        // ▼ "CONSOLE DISPLAY" OF "ARRAY" ▼
        System.out.println("Reversed array: " + Arrays.toString(numberArray));
    }
}
