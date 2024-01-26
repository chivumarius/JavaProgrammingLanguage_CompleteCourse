/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

             • "WHILE" LOOP •
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

public class WhileLoopAndDoWhileLoop {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ -
        // ▬ (1) "WHILE(){...}" LOOP
        //          → IT WILL "TEST" A  "CONDITION"
        //          → ABD "THEN" IT WILL  "DO  SOMETHING" ▬

        int i = 0;

        while (i < 5){

            // ▼ CONSOLE DISPLAY ▼
            System.out.println("*");

            // ▼ "INCREMENTAL" OR "DECREMENTAL" ▼
            i++;
        }


        System.out.println("\n __________________________\n");



        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ -
        // ▬ "SIMILAR" TO "FOR()" LOOP ▬
        for (int j = 0; j < 5; j++){
            System.out.println("*");
        }



        System.out.println("\n __________________________\n");




        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ -
        // ▬ (2) "DO{..} WHILE(){...}" LOOP
        //          → IT WILL "DO SOMETHING"
        //          → "WITHOUT TESTING" A "CONDITION" ▬

        int k = 15;

        do {
            // ▼ CONSOLE DISPLAY ▼
            System.out.println("*");

            // ▼ "INCREMENTAL" OR "DECREMENTAL" ▼
            k--;

       } while ( k > 10);

    }
}
