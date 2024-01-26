/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 9 •
      ► "INSERT ELEMENT" INTO "ARRAY" ◄



  Requirements:

        • WWrite a "Java Program"
            → that "Inserts" an "Element"
            → into "Array".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;



public class Ex9_InsertElementIntoArray {


    // ▬ First Run Method ▬
    public static void main(String[] args) {


        // ▼ "CREATING" A "STATIC ARRAY" OF "SIZE 6" ▼
        int[] numberArray = {10, 20, 30, 40, 50, 60};


        // ▼ "INSERTION" ON THE "3TH POSITION" FROM "ARRAY" ▼
        int insertionPosition = 2;


        // ▼ "SHIFTING" THE "ELEMENTS"
        //      → FROM THE "LEFT"
        //      → TO THE "RIGHT"
        //      → TO "INSERT  ELEMENT" ▼
        for(int i = numberArray.length - 1; i > insertionPosition; i--) {
            // ▼ "ARRAY SHIFTING" FOR "INSERTING ELEMENT" ▼
            numberArray[i] = numberArray[i - 1];
        }



        // ▼ "FILLING UP" THE "EMPTY SPACE" WITH "INSERTED ELEMENT" ▼
        numberArray[insertionPosition] = 70;



        // ▼ DISPLAYING "ARRAY ELEMENTS"
        //      → BY USING "FOR()" LOOP
        //      → TO "STATIC ARRAY ITERATION" ▼
//        for(int i = 0; i < numberArray.length; i++) {
//            // ▼ "DISPLAYING" EACH "ARRAY ELEMENT" ▼
//            System.out.println(numberArray[i]);
//        }


        // ▼ DISPLAYING "ARRAY ELEMENTS"
        //      → BY USING "FOREACH()" LOOP
        //      → TO "STATIC ARRAY ITERATION" ▼
        for (int i : numberArray) {
            // ▼ "DISPLAYING" EACH "ARRAY ELEMENT" ▼
            System.out.println(i);
        }
    }
}
