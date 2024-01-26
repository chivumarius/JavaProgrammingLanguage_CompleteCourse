/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 1 •
        - FACTORIAL OF NUMBER -



  Requirements:

        • Write a "Java Program"
            → that "Calculates"
            → the "Factorial" of "10".


   ▬ Mathematical Explanation:

        10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1



     ▬ "Iteration"
        → is a "Programming Technique"
        → in which "Actions"
        → that "Need" to be "Repeated"
        → are "Described"
        → using a "Loop".



    ▬ Loop Iteration Steps:

         "result"       "i"       "result"
            1      *     10   =      10
            10     *     9    =      90
            90     *     8    =      720
            720    *     7    =      5040
            ...    *     ..   =      ...


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;



public class Ex1_FactorialOfNumber {

    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "STORING" THE "RESULT" ▼
        int result = 1;

        // ▼ "LOOPING": FROM 10 TO 1 ▼
        for (int i = 10; i>=1; i--) {

            // ▼ "RE-ASSIGNING" THE "VARIABLE" ▼
            result =result * i;
        }

        // ▼ "CONSOLE DISPLAY" ▼
        System.out.print("Factorial Number is: " + result);

    }
}
