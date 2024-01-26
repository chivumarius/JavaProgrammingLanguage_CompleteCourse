/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

             • NESTED "FOR" LOOP •
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

public class NestedForLoops {


    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ -
        // ▬ THE "FOR()" LOOP
        //      → "CONTROLS" A "STATEMENT"
        //      → AND "ITSELF" IS AN "STATEMENT",
        //      → WHICH "MEANS" THAT A "FOR()" LOOP
        //      → CAN "CONTAIN" ANOTHER "FOR()" LOOP ▬



        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ -
        // ▬ "NESTED  FOR() LOOP" ▬
        // ▼ THIS "CONTROL" THE "NUMBER" OF "LINES" ▼
        for(int i = 1; i <= 5; i++){

            // ▼ THIS "CONTROL" THE "NUMBER" OF "SPACES" ▼
            for(int k = 1; k <= i-1; k++){
                System.out.print(" ");
            }


            // ▼ THIS "CONTROL" THE "NUMBER" OF "STARS" ▼
            for(int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
