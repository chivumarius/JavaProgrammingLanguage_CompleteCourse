
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "RECURSION" •
              ► "EXAMPLE" ◄
    - "CALCULATING" THE "POWER" OF A "NUMBER" -




     ▬ In "Math":
              Start        End
        2^3 =   2  *  2  *  2
            =   2  * (2^2) = 2 * 2 * (2^1) * (2^0)  // ◄ Used in "Recursion"



     ▬ In "Recursion":
                    Start                           End
        2^3 =  2 * (2^2) = 2 * 2 * (2^1) = 2 * 2 * (2^0)




    ▬ "Iteration"
        → is a "Programming Technique"
        → in which "Actions"
        → that "Need" to be "Repeated"
        → are "Described"
        → using a "Loop".


    ▬ "Recursion"
        → is a "Programming Technique"
        → in where "Actions"
        → that "Need" to be "Repeated"
        → are "Described"
        → using a "Method" that "Calls Itself" ("Self-Invocation").



 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package recursion;


public class Recursion_Example_Calculating_Power_of_Number {


    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ "Storing" & "Calling" the "Method"
        //      → with "Constructor Initialization" ▼
        int result0 = powerCalculation(2, 0);
        int result1 = powerCalculation(2, 1);
        int result2 = powerCalculation(2, 2);
        int result3 = powerCalculation(2, 3);
        int result4 = powerCalculation(2, 4);
        int result5 = powerCalculation(2, 5);

        // Displaying the "Results" ▼
        System.out.println("2^0 = " + result0);
        System.out.println("2^1 = " + result1);
        System.out.println("2^2 = " + result2);
        System.out.println("2^3 = " + result3);
        System.out.println("2^4 = " + result4);
        System.out.println("2^5 = " + result5);
    }



    // ▬ "INTEGER EXPONENTIAL" ▬
    // ▬ The "powerCalculation()" Recursive Method ▬
    public static int powerCalculation(int number, int power) {

        // ▼ "STOP" CONDITION ▼
        if (power == 0) {
            // ▼ "BASE" ("NON-RECURSIVE") CASE
            return 1;
        }

        // ▼ "START" CONDITION ▼
        else {
            // ▼ "RECURSIVE" CASE  ▼
            return number * powerCalculation(number, power - 1);
        }
    }

}

