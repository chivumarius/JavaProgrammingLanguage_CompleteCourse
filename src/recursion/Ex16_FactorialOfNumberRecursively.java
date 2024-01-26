package basics;

/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 16 •
    - FACTORIAL OF NUMBER RECURSIVELY -



  Requirements:

        • Write a "Java Program"
            → that "Calculates"
            → the "Factorial" of "5"
            → using a "Recursive Function".


   ▬ Mathematical Explanation:

        10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
        5!  = 5 * 4 * 3 * 2 * 1
        0!  = 1



     ▬ The "Factorial" of a "Negative Number"
        → does "Not Exist".



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


    ▬ "Recursion"
        → is a "Programming Technique"
        → in where "Actions"
        → that "Need" to be "Repeated"
        → are "Described"
        → using a "Method" that "Calls Itself" ("Self-Invocation").


    ▬ "Recursion":

        n! = n * (n-1)

                Start                                    End
        5! =      5  *  (5-1) * (4-1) * (3-1) * (2-1) * (1-1)

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
public class Ex16_FactorialOfNumberRecursively {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "Storing" & "Calling" the "Method"
        //      → with "Constructor Initialization" ▼
        long result0 = factorialNumber(0);
        long result1 = factorialNumber(1);
        long result2 = factorialNumber(2);
        long result3 = factorialNumber(3);
        long result4 = factorialNumber(4);
        long result5 = factorialNumber(5);


        // Displaying the "Results" ▼
        System.out.println("0! = " + result0);
        System.out.println("1! = " + result1);
        System.out.println("2! = " + result2);
        System.out.println("3! = " + result3);
        System.out.println("4! = " + result4);
        System.out.println("5! = " + result5);
    }


    // ▬ The "factorialNumber()" Recursion Method ▬
    public static long factorialNumber(int number){

        // ▼ "STOP" CONDITION ▼
        if(number == 0){
            return 1;
        }

        // ▼ "START" CONDITION ▼
        else {

            // ▼ "RECURSIVE" CASE  ▼
            // ▼ Factorial Calculations ▼
            return   number * factorialNumber(number - 1);
        }

    }
}
