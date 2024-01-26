/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                    • EXERCISE 29 •
         ► "TRANSFORM" FROM "ITERATIVE" TO "RECURSIION" ◄



    ▬ Write the Following "Iterative Method"
        → as a "Recursive Method":

    ___________________________________________________________
        public static void poster(){
            int a, b;

            for(a = 0; a < 4; a++){
                for(b = 0; b < 10; b++){
                    System.out.print((a + 10 * b) + "");
                }
            }
        }
    ___________________________________________________________


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;




public class Ex29_Iterative_to_Recursion_Transformation {

    // ▬ First Run Method ▬
    public static void main(String[] args) {
        // ▼ Calling the "Method" ▼
        Display(0, 0);
    }




    // ▬ The "Display()" Recursive Method ▬
    public static void Display(int a, int b){

        // ▼ "Replacing" the "For Loop" with "Recursion"
        //      → and Checking the "Condition" ▼
        if(a < 4){

            // ▼ Inner "Condition" ▼
            if(b < 10){

                // ▼ Console Display ▼
                System.out.println((a + 10 * b) + "");

                // ▼ Callback Method ("Calling itself")
                //      → in which "a" Remains the "Same"
                //      → and "b" is "Increased" by "1" ▼
                Display(a, b + 1);  // ► Incrementing "b" (b++)

            } else {
                // ▼ Callback Method
                //      → in which "a" is "Incremented"
                //      → and  "b" Remains the "Same" ▼
                Display(a + 1, b); // ► Incrementing "a" (a++)
            }
        }
    }


}
