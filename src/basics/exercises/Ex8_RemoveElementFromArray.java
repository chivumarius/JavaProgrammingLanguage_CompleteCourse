/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 8 •
      ► "REMOVE ELEMENT" FROM "ARRAY" ◄



  Requirements:

        • WWrite a "Java Program"
            → that "Remove" an "Element"
            → from "Array".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;



public class Ex8_RemoveElementFromArray {


    // ▬ First Run Method ▬
    public static void main(String[] args) {


        // ▼ "CREATING" A "STATIC ARRAY" OF "SIZE 10" ▼
        int[] numberArray = {10, 20, 30, 40, 50, 60};


        // ▼ "SELECTING" THE "3TH ELEMENT" FROM "ARRAY" ▼
        int selectedIndex = 2;


        // ▼ "SHIFTING" THE "ELEMENTS"
        //      → FROM THE "RIGHT"
        //      → TO THE "LEFT"
        //      → TO "REMOVE  ELEMENT" ▼
        for(int i = selectedIndex; i < numberArray.length - 1; i++) {
            // ▼ ARRAY "SHIFTING" ▼
            numberArray[i] = numberArray[i + 1];
        }


        // ▼ DISPLAYING "ARRAY ELEMENTS"
        //      → BY USING "FOR()" LOOP
        //      → TO "STATIC ARRAY ITERATION" ▼
        for(int i = 0; i < numberArray.length - 1; i++) {
           // ▼ "DISPLAYING" EACH "ARRAY ELEMENT" ▼
           System.out.println(numberArray[i]);
        }

    }
}
