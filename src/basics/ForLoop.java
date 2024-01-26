
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

             • "FOR" LOOP •
            ► "ITERATION" ◄



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

package basics;

public class ForLoop {


    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ -
        // ▬ "GETTING" THE "SQUARE"
        //      → FOR THE "FIRST 5 INTEGERS"
        //      → "WITHOUT USING" THE "LOOP" ▬
//        System.out.println("1 squared = " + (1 * 1));
//        System.out.println("2 squared = " + (2 * 2));
//        System.out.println("3 squared = " + (3 * 3));
//        System.out.println("4 squared = " + (4 * 4));
//        System.out.println("5 squared = " + (5 * 5));



        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ -
        // ▬ "USING" THE "FOR()" LOOP
        //      → TO AVOID "REDUNDANT CODE" ▬
        /*  SYNTAX:
                FOR( <INITIALIZATION>; <CONTINUATION TEST>, <UPDATE> ) {
                        ..CODE THAT MUST BE REPEATED
                }
        */

        for(int i = 1; i <= 5; i++){
            System.out.println(i + " squared = " + (i * i));
        }
    }
}
