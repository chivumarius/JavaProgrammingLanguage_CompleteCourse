package basics;

/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 17 •
    - FIBONACCI SERIES IN RECURSIVE WAY -



  Requirements:

        • Write a "Java Program"
            → that "Find" and "Display"
            → the Sequence "Fn"
            → of "Fibonacci" Numbers,
            → using a "Recursive Function".


   ▬ Mathematical Explanation
        → of "Fibonacci Numbers"
        → are the "Numbers"
        → in the Following "Integer Sequence"

      _______________________________________________________________

        F0  F1  F2  F3  F4  F5  F6  F7  F8  F9  F10  F11  F12
        0,  1,   1, 2,  3,  5,  8,  13, 21, 34, 55,  89,  144, ……..
      _______________________________________________________________



    ▬ Example:

        F5 = F4 + F3
        F4 = F3 + F2
        F3 = F2 + F1
        F2 = F1 + F0
        F1 = F0 + F-1
        F0 = 0





    ▬ "Recursion"
        → is a "Programming Technique"
        → in where "Actions"
        → that "Need" to be "Repeated"
        → are "Described"
        → using a "Method" that "Calls Itself" ("Self-Invocation").



    ▬ "Recursion":

        Fn = Fn-1 + Fn-2
        F0 = 0
        F1 = 1

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
public class Ex17_Fibonacci_Series_in_Recursive_Way {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "Storing" & "Calling" the "Method"
        //      → with "Constructor Initialization" ▼
        long result0 = fibonacci(0);
        long result1 = fibonacci(1);
        long result2 = fibonacci(2);
        long result3 = fibonacci(3);
        long result4 = fibonacci(4);
        long result5 = fibonacci(5);;
        long result6 = fibonacci(6);;
        long result7 = fibonacci(7);;
        long result8 = fibonacci(8);;
        long result9 = fibonacci(9);;
        long result10 = fibonacci(10);;


        // Displaying the "Results" ▼
        System.out.println("F0 = " + result0);
        System.out.println("F1 = " + result1);
        System.out.println("F2 = " + result2);
        System.out.println("F3 = " + result3);
        System.out.println("F4 = " + result4);
        System.out.println("F5 = " + result5);
        System.out.println("F6 = " + result6);
        System.out.println("F7 = " + result7);
        System.out.println("F8 = " + result8);
        System.out.println("F9 = " + result9);
        System.out.println("F10 = " + result10);
    }




    // ▬ The "fibonacci()" Recursion Method ▬
    public static long fibonacci(int number){

        // ▼ "STOP" CONDITION ▼
        if (number <= 1){
            return number;    // ► "n = 0" return "0" .... if "n = 1" return "1"
        }

        // ▼ "START" CONDITION ▼
        // ▼ Fibonacci Calculation(Formula) ▼
        return fibonacci(number-1) + fibonacci(number-2);
    }
}
