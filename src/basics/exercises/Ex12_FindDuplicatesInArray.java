/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 12 •
      ► FIND "DUPLICATES" IN "ARRAY" ◄



  Requirements:

        • WWrite a "Java Program"
            → that "Finds" "Duplicate Values"
            → of "Array".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;



public class Ex12_FindDuplicatesInArray {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "CREATING" A "STATIC ARRAY" WITH "DUPLICATES VALUES" ▼
        int[] numberArray = {8, 5, 5, 1, 2, 2, 6, 7, 9, 9};


        // ▼ NESTED "FOR()" LOOP"
        //      → TO "COMPARE" THE "ARRAY ELEMENTS"
        //      → FOR "FINDING" THE "DUPLICATES VALUES" ▼
        // ▼ "OUTER LOOP ITERATION" ▼
        for (int i = 0; i< numberArray.length ; i++){


            // ▼ "INNER LOOP"
            //      → TO "COMPARE"
            //      → THE "SECOND ELEMENT"
            //      → OF  THE "OUTER LOOP"
            for (int j = i+1; j< numberArray.length ; j++){

                // ▼ "IF" THE "ELEMENTS" FROM "OUTER LOOP"
                //      → ARE "EQUAL"
                //      → WITH "ELEMENTS" OF "INNER LOOP" ▼
                if (numberArray[i] == numberArray[j]){
                    System.out.println("Duplicate value: " + numberArray[j]);
                }
            }
        }

    }
}
