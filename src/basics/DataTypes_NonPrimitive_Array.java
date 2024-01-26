package basics;

/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • "NON-PRIMITIVE" DATA TYPE •
                -  "ARRAYS" -



  (1) "Arrays"
        → are "Used" to "Store Multiple Values"
        → in a "Single Variable",
        → instead of "Declaring Separate Variable"
        → for "Each Value".


    • "Array"
        → is an "Object"
        → that Contains a "Fixed Number" of "Values"/"Elements"
        → of "Same Data Type".


    • The "Elements" of "Array"
        → are "Indexed",
        → which "Allows" us to "Access Them "
        → by "Numbers" (Called "Indices").



    ♦ There are "Two Types" of "Arrays":

        [1] "Primitive" Arrays
                → of: "int", "float", "char", "boolean", "byte", "short".

        [2] "Non-Primitive" / "Object" Arrays
                → of: "String", "Object", "Class", etc.





    • "Syntax"
    ____________________________________________________________________
                                          INDEX
                                      0       1       2      n
                                      ↓       ↓       ↓      ↓
        dataType[] variableName = { value1, value2, value3, ... };
     ____________________________________________________________________






    (2)) "Multidimensional Arrays"
        → is an "Array" of "Arrays".
        → in which "Ech Element"
        → is an "Array Itself".



    • "Syntax"
    ____________________________________________________________________
                                          INDEX
                                      0       1       2      n
                                      ↓       ↓       ↓      ↓
        dataType[][] variableName = {
            { value1, value2, value3, ... },
            { value1, value2, value3, ... },
            { value1, value2, value3, ... }
        }
     ____________________________________________________________________


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
public class DataTypes_NonPrimitive_Array {


    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {


        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (1) "ARRAYS"

        // ▼ "DECLARING" A "ARRAY" OF "SIZE 1" ▼
        int[] anArray = new int[1];


        // ▼ "ACCESSING" & "INITIALIZATION" OF "ARRAY" ▼
        anArray[0] = 10;


        // ▼ "CONSOLE DISPLAY" ▼
        System.out.println(anArray[0]);


        System.out.println("\n______________________________\n");






        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ▬ USING "FOR()" LOOP FOR  "ARRAY ITERATION" ▬
        int[] arrayIteration = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < arrayIteration.length; i++) {
            System.out.println(arrayIteration[i]);
        }

        System.out.println("\n______________________________\n");



        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ▬ USING "FOR()" LOOP FOR "ARRAY CUSTOM ITERATION" ▬
        int[] arrayCustomIterationc = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 4; i < arrayCustomIterationc.length-1; i++) {
            System.out.println(arrayIteration[i]);
        }

        System.out.println("\n______________________________\n");






        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ▬ USING "FOREACH()" LOOP  FOR "ARRAY ITERATION" ▬
        int[] arrayForEach = {10, 20, 30, 40, 50};

        for(int item : arrayForEach) {
            System.out.println(item);
        }

        System.out.println("\n______________________________\n");






        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (2) "MULTIDIMENSIONAL ARRAYS"

        // ▼ "ARRAY DECLARATION" ▼
        int[][] multiDimensionalArray = new int[3][5];


        // ▼ "ACCESSING" & "INITIALIZATION" OF "1ST SUB-ARRAY" ▼
        multiDimensionalArray[0][0] = 2;
        multiDimensionalArray[0][1] = 4;
        multiDimensionalArray[0][2] = 6;
        multiDimensionalArray[0][3] = 8;
        multiDimensionalArray[0][4] = 10;


        // ▼ "ACCESSING" & "INITIALIZATION" OF "2nd SUB-ARRAY" ▼
        multiDimensionalArray[1][0] = 3;
        multiDimensionalArray[1][1] = 6;
        multiDimensionalArray[1][2] = 9;
        multiDimensionalArray[1][3] = 12;
        multiDimensionalArray[1][4] = 15;



        // ▼ "ACCESSING" & "INITIALIZATION" OF "3TH SUB-ARRAY" ▼
        multiDimensionalArray[2][0] = 5;
        multiDimensionalArray[2][1] = 10;
        multiDimensionalArray[2][2] = 15;
        multiDimensionalArray[2][3] = 20;
        multiDimensionalArray[2][4] = 25;


        // ▼ "CONSOLE DISPLAY" ▼
        System.out.println(multiDimensionalArray[0][0]);
        System.out.println(multiDimensionalArray[1][0]);
        System.out.println(multiDimensionalArray[2][0]);


        System.out.println("\n______________________________\n");








        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ▬ USING "FOR()" LOOP FOR  "MULTIDIMENSIONAL ARRAY ITERATION" (2D) ▬
        int[][] multiDimensionArrayIteration = {{2, 4, 6}, {3, 6, 9}, {5, 10, 15}};

        // ▼ "LOOPING" THROUGH "OUTER ARRAY" ▼
        for(int i = 0; i < multiDimensionArrayIteration.length; i++) {

            // ▼ "LOOPING" THROUGH "INNER ARRAY" ▼
            for(int j = 0; j < multiDimensionArrayIteration.length; j++) {
//                System.out.println(multiDimensionArrayIteration[i][j]);
                System.out.print(multiDimensionArrayIteration[i][j] + " ");
            }
        }

        System.out.println("\n______________________________\n");

    }
}
