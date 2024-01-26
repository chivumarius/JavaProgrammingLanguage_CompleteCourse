/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                    • EXERCISE 31 •
         ► "SUM" OF "ARRAY ELEMENTS" IN "TRIANGLE" ◄



    ▬ Given an "Array" of "Integers",
        → "Print" a "Sum Triangle" from "It"
        → such that the "First Level"
        → has A"ll Array Elements".



    ▬ From then,
        → at "each level"
        → "Number" of "Elements"
        → is "One Less" than
        → the "Previous Level"
        → and "Elements" at the "Level"
        → is "Being" the "Sum"
        → of "Consecutive Two Elements"
        → in the "Previous Level".



    ▬ Example:

    __________________________________________________

        Input :
            A = {1, 2, 3, 4, 5}
    __________________________________________________

        Output
            [48]
            [20, 28]
            [8, 12, 16]
            [3, 5, 7, 9]
            [1, 2, 3, 4, 5]   // ► "Entered" by "User"



    ▬ Write this "Exercise"
        → in a "Recursive Way"!

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;


import java.util.Arrays;

public class Ex31_Sum_of_Array_Elements_in_Triangle {

    // ▬ First Run Method ▬
    public static void main(String[] args) {
        // ▼ "Creating" an "Array" of "Integers" ▼
        int[] A = {1, 2, 3, 4, 5};

        // ▼ "Calling" the "printTriangle()" Method ▼
        printTriangle(A);
    }



    // ▬ The "printTriangle()" Method ▬
    public static void printTriangle(int[] A) {
        // ▼ "Base Case": "Elements" of "Array" are the "Same" ▼
        if (A.length < 1) {
            return;
        }



        // ▼ The "Sum" of "Consecutive Two Elements" ▼
        int[] temp = new int[A.length - 1];

        // ▼ "Looping" through the "Array" ▼
        for (int i = 0; i < A.length - 1; i++) {

            // ▼ "Adding" the "Two Consecutive Elements" ▼
            int x = A[i] + A[i + 1];
            temp[i] = x;
        }


        // ▼ Recursive Callback Method ▼
        printTriangle(temp);

        // ▼ "Displaying" the "Sum Triangle" ▼
        System.out.println(Arrays.toString(A));
    }
}
