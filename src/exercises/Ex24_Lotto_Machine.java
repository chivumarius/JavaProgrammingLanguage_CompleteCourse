/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 24 •
       ► "LOTTO MACHINE" ◄



    ▬ A "Lotto Game"
        → "Consists"
        → in °Laying" a "Combination"
        → of "6 Distinct Numbers"
        → between "1" and "42".



    ▬ We "Can Use"
        → a "Lotto Machine"
        → that "Generates Randomly"
        → this "Combination".


    ▬ This "Machine"
        → "Displays" a "Sorted Combination".



    (Q1) "Question 1":
            • Write a Method
                    •> "isSorted(int[] comb)"
                → that "Allows Verifying"
                → if the "comb" Array
                → is "Sorted".



    (Q2) "Question 2":
        • Write a Java "Method"
            •> "sort(int[] comb)"
            → that "Allows Sorting"
            → the "comb" Array
            → in "Ascending Order".



    (Q3) "Question 3":
            • Using the "Math.random()" Method,
                → Write a Java Method
                    •> "aCombination()"
                → that "Returns" a "Combination"
                → of "6 Distinct Random Numbers"
                → Between "1" and "42"
                → in "Form" of an "Array".


            • After "Generation",
                → the "Method" must "Verify"
                → if the "Venerated Array"
                → is "Sorted",
                → Otherwise it "Sorts It"
                → and "Returns It".




    (Q4) "Question 4":
        • A "Lotto Player"
            → can "Ask" the "Machine"
            → to "Generate" Many "Combinations"
            → by "Providing" the "Number"
            → of "Combinations"
            → to "Play".


        • When we have "Many Combinations",
            → they must be "Distinct".


	    • We must "Assure"
	        → that there are "No Two Identical Combinations"
	        → among them.


	    • Write a "Method"
	            •> "sameComb(int[] c1, int[] c2)"
	        → that "Allows Verifying"
	        → if the "Combinations" - "c1" and "c2"
	        → are "Identical"
	        → ("c1" and "c2" are "Already Sorted").




    (Q5) "Question 5":
        • We would "Like"
            → to Generate a "Certain Number"
            → of "Combinations"
            → in "One Single Operation".


	    • Write a "Method"
	            •> "generate(int n)"
	        → that Allows "Generation N Distinct Combinations"
	        → and "Returns" the "Result"
	        → in a "Form" of a "Double-Dimension Array"
	            •> "int[n][6]".


	    • To "Ensure"
	        → that the "Generated Combinations"
	        → are "Distinct",
	        → use the "Method"
	            •> "sameComb()"
	        → previously "Implemented".



    (Q6) "Question 6":
        • To Display One "Combination",
            → write a "Method"
                •> "displayOne(int[] comb)"
            → that "Allows Displaying"
            → a "Combination"
            → as "Follows":
                •> [3 17 21 33 39 41].



    (Q7) "Question 7":
        • To "Display" - "All Combinations",
            → Write a "Method"
                •> "displayAll(intE] comb)"
            → that "Allows Displaying"
            → the "Content" of the "2D array" - "comb"
            → as "Follows":
             [3 17 21 33 39 41] [2 6 13 22 34 38] [11 18 24 27 36 42]


    (Q8) "Question 8":
        • "Write" a "Method"
                •> "main()"
            → that "Allows" the "User"
            → to "Enter" the "Number"
            → of "Combinations"
            → he "Wants" to "Play"
            → and to "Display"
            → the "Combinations Generated"
            → by the "Machine".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;


import java.util.Scanner;


public class Ex24_Lotto_Machine {



    // ▬ (Q1) The "isSorted()" Method
    //          → that "Allows Verifying"
    //          → if the "comb" Array
    //          → is "Sorted" ▼
    public static boolean isSorted(int[] comb){

        // ▼ "Looping" through the "Array" for "Sorting" ▼
        for (int i = 0;i < comb.length-1; i++){

            // ▼ "Comparing" the "Array Numbers"
            //      → are "Sorted" or "Not"
            if (comb[i] > comb[i+1]){
                return false;
            }
        }

        // ▼ "Returning" "True" ▼
        return true;
    }




    // ▬ (Q2) The "sort()" Method ▬
    public static void sort(int[] comb){

        // ▼ "Sorting" the "Array" ▼
        for (int i = 0; i < comb.length-1; i++){

            // ▼ "Comparing" the  "Array Numbers"
            //      → and "Sorting" them ▼
            for (int j = i+1; j < comb.length; j++){
                if (comb[i] > comb[j]){

                    // ▼ "Temporary Variable" ▼
                    int x = comb[i];

                    // ▼ "Swapping" the "Array Numbers" ▼
                    comb[i] = comb[j];
                    comb[j] = x;
                }
            }
        }
    }




    // ▬ (Q3) The "aCombination()" Method ▬
    public static int[] aCombination(){

        // ▼ "Creating" a "Fix Size Array" ▼
        int[] comb = new int[6];

        boolean ok = true;


        // ▼ "Looping" through the "Array"
        //      → for "Generating" a "Random Number" ▼
        for (int i = 0; i < comb.length; i++){

            // ▼ "Generating" a "Random Number" ▼
            comb[i] = (int) (1 + Math.random() * 41);


            // ▼ "Looping" through the "Array" ▼
            for (int j = 0 ; j < i ; j++){

                // ▼ "Comparing" the "2 Arrays Numbers"
                if (comb[i] == comb[j]){
                    ok = false;
                    break;
                }
            }


            // ▼ "If" the "Array" is "Not Sorted" ▼
            if (!ok) {
                ok = true;
                i--;
                continue;
            } else {
                ok = true;
            }
        }


        // ▼ "Verifying" if the "Array" is "Not Sorted" ▼
        if (!isSorted(comb)){
            // ▼ "Sorting" the "Array" ▼
            sort(comb);
        }

        // ▼ "Returning" the "Array" ▼
        return comb;
    }





    // ▬ (Q4) The "sameComb()" Method ▬
    public static boolean sameComb(int[] c1, int[] c2){

        // ▼ "Looping" through the "Arrays" ▼
        for( int i = 0; i < c1.length ; i++){

            // ▼ If the "Arrays Elements" are "Not Identical" ▼
            if (c1[i] != c2[i]) return false;
        }

        // ▼ If the "Arrays Elements" are "Identical" ▼
        return true;
    }





    // ▬ (Q5) The "generate()" Method ▬
    public static int[][] generate(int n){

        // ▼ "Creating" a "Fix Size 2D Array"
        int[][] comb = new int[n][6];

        boolean ok = true;


        // ▼ "Looping" through the "Array" ▼
        for (int i = 0; i < n; i++){

            //
            comb[i] = aCombination();


            // ▼ "Looping" through the "Array" ▼
            for (int j = 0; j < i; j++){

                // ▼ "Comparing" the "2 Arrays Numbers"
                //      → and "Returns It" ▼
                if (sameComb(comb[i], comb[j])){
                    ok = false;
                    break;
                }
            }


            // ▼ "If" the "Array" is "Not Sorted" ▼
            if (!ok){
                ok =true;
                i--;
                continue;
            } else {
                ok = true;
            }
        }

        // ▼ "Returning" the "Array" ▼
        return comb;
    }




    // ▬ (Q6) The "displayOne()" Method ▬
    public static void displayOne(int[] comb){

        // ▼ "Displaying" the "Opening Bracket" ♥
        System.out.print("[");


        // ▼ "Looping" through the "Array" ▼
        for (int i = 0 ; i< comb.length; i++){

            // ▼ "Displaying" the "Array Elements" ♥
            System.out.print(comb[i] + " ");
        }


        // ▼ "Displaying" the "Closing Bracket" ♥
        System.out.println("]");
    }






    // ▬ (Q7) The "displayAll()" Method ▬
    public static void displayAll(int[][] comb){

        // ▼ "Looping" through the "Array" ▼
        for (int i = 0; i<comb.length; i++){

            // ▼ Calling the "Method" ▼
            displayOne(comb[i]);

            // ▼ "New Line"
            System.out.println();
        }
    }





    // ▬ (Q8) The "displayAll()" Method ▬

    // ▼ "Creating" a "Scanner" Object
    //      → for Getting the "User Input" ▼
    static Scanner scan = new Scanner(System.in);


    // ▬ First Run Method ▬
    public static void main(String[] args) {
        int n;

        // ▼ "Looping" through the "User Input" ▼
        do {
            // ▼ "Displaying" the "Console Message      "
            System.out.print
                    ("Enter number of combinations (1-10): ");

            // ▼ "Storing" the "User Input"
            n = scan.nextInt();
        } while (n < 1 || n > 10);

        // ▼ Calling the "Method" ▼
        displayAll(generate(n));
    }
}
