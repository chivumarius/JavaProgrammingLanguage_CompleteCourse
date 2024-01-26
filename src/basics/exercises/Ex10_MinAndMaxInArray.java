/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 10 •
      ► "MIN" & "MAX" IN "ARRAY" ◄



  Requirements:

        •  • WWrite a "Java Program"
            → that "Find"
            → the "Max" and "Min"
            → of "Array".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;



public class Ex10_MinAndMaxInArray {


    // ▬ First Run Method ▬
    public static void main(String[] args) {


        // ▼ "CREATING" A "STATIC ARRAY" OF "SIZE 10" ▼
        int[] numberArray = {30, 60, 10, 20, 50, 40};



        // ▬▬▬ (1) "FINDING" THE "MIN VALUE"  ▬▬▬
        // ▼ WE "CONSIDER" THE "FIRST ELEMENT"
        //      → TO BE THE "SMALLEST"
        //      → IN THE "ARRAY" ▼
        int min = numberArray[0];


        // ▼ "FOR()" LOOP
        //      → FOR "ARRAY ITERATION"
        //      → TO "COMPARE" THE "VALUES" OF "ELEMENTS"
        //      → WITH "MINIMUM"
        //        ("STARTING" FROM THE "SECOND ELEMENT"
        //         WITH "INDEX 1") ▼
        for(int i = 1; i < numberArray.length; i++) {

            // ▼ "COMPARE" THE "ARRAY ELEMENTS" WITH THE "MIN" ▼
            if(numberArray[i] < min) {
               // ▼ "SWITCHING" THE "SMALLEST ELEMENT" ▼
                min = numberArray[i];
            }
        }


        // ▼ "CONSOLE DISPLAY" OF "MIN VALUE" ▼
        System.out.println("The minimum array value:" + min);







        // ▬▬▬ (2) "FINDING" THE "MAX VALUE"  ▬▬▬
        // ▼ WE "CONSIDER" THE "FIRST ELEMENT"
        //      → TO BE THE "GREATEST"
        //      → IN THE "ARRAY" ▼
        int max = numberArray[0];


        // ▼ "FOR()" LOOP
        //      → FOR "ARRAY ITERATION"
        //      → TO "COMPARE" THE "VALUES" OF "ELEMENTS"
        //      → WITH "MAXIMUM"
        //        ("STARTING" FROM THE "SECOND ELEMENT"
        //         WITH "INDEX 1") ▼
        for(int i = 1; i < numberArray.length; i++) {

            // ▼ "COMPARE" THE "ARRAY ELEMENTS" WITH THE "MAX" ▼
            if(numberArray[i] > max) {
                // ▼ "SWITCHING" THE "GREATEST ELEMENT" ▼
                max = numberArray[i];
            }
        }

        // ▼ "CONSOLE DISPLAY" OF "MAX VALUE" ▼
        System.out.println("The maximum array value:" + max);
    }
}
