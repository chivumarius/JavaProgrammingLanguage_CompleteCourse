/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 13 •
      ► "ROTATE ARRAY CLOCKWISE" ◄



  Requirements:

        • Write a "Java Program"
            → that "Rotates"
            → an "Array Clockwise".



▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;

public class Ex13_RotateArrayClockWise {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "CREATING" A "STATIC ARRAY" OF "SIZE 5" ▼
        int[] numberArray = { 10, 20, 30, 40, 50 };


        // ▼ "GETTING" THE "INDEX" OF "LAST ARRAY ELEMENT"
        //      → IN THIS EX. "INDEX: 4" ▼
        int lastElementIndex = numberArray[numberArray.length - 1];


        // ▼ "FOR()" LOOP
        //      → TO "ROTATE" THE "ARRAY"
        //      → BY "SHIFTING" THE "ELEMENTS"
        //      → "STARTING" (IN THIS EX.) FROM "INDEX: 4",
        //      → "STOPPING" TO THE "INDEX: 0"
        //      → AND "DECREASING" THE "INDEX" ▼
        for (int i = numberArray.length - 1; i > 0; i--) {

            // ▼ "ROTATING" THE "ARRAY"
            //      → BY SETTING IN THIS EX. "INDEX: 4"
            //      → AS "INDEX: 3" ▼
            numberArray[i] = numberArray[i - 1];

        }  // ► IT RESULTS IS  { 10, 10, 20, 30, 40 }


        // ▼ REASSIGN THE "INDEX: 0" ("FIRST ARRAY ELEMENT")
        //      → TO "INDEX: 4" ("LAST ARRAY ELEMENT") ▼
        numberArray[0] = lastElementIndex;


        // ▼ USING "FOR()" LOOP
        //      → DISPLAYING "ARRAY ELEMENTS" ▼
//        for (int i = 0; i < numberArray.length; i++) {
//             System.out.print(numberArray[i] + ", " );
//        }


        // ▼ USING "FOR EACH()" LOOP
        //      → DISPLAYING "ARRAY ELEMENTS" ▼
        for (int i : numberArray) {
            System.out.print(i + ", ");
        }

    }
}
