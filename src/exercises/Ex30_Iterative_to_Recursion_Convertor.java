/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                    • EXERCISE 30 •
         ► "CONVERT" FROM "ITERATIVE" TO "RECURSIION" ◄



    ▬ We "Define" a "Function"
        → by:
    ___________________________________________________________
        	• f (0) = 1
	        • f (x) = f (x 1) * 5 + if x > 0
    ___________________________________________________________



    ▬ Write a "Method"
        → that "Calculates"
        → the "Value" of the "Function" - "f"
        → for a "Value" of "x"
        → "Passed" as a "Parameter".


    ▬ If the "Parameter x"
        → is "Negative"
        → the "Function Returns" is "0";


    ▬ Write the "Method"
        → in a "Recursive Way".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;




public class Ex30_Iterative_to_Recursion_Convertor {

    // ▬ The "f()" Recursive Method ▬
    public static int f(int x){

        // ▼ "Checking" if "x" is "Not Divisible" ▼
        if (x < -1) return 0;

        if (x == 0) return 1;

        // ▼ Callback Method ▼
        return f(x-1) * 5 + x;
    }
}
