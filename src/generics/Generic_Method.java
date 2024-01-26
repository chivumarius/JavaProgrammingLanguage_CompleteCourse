
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GENERICS" •
          - "GENERIC METHOD" -



    ▬ "Generics"
        → add "Stability"
        → to our "Code"
        → by "Making" more of our "Bugs Detectable"
        → at "Compile Time".



    ▬ "Generics"
        → Enable "Types" ("Classes" and "Interfaces")
        → to be "Parameters"
        → when "Defining":
            • "Classes",
            • "Interfaces" and
            • "Methods".


    ▬ Much "Like":
        ♦ The "Formal Parameters"
            → used in "Method Declarations",

        ♦ The "Type Parameters"
            → "Provide" a "Way"
            → for Us to "Re-Use"
            → the "Same Code"
            → with "Different Inputs".


    ▬ The "Difference" is
        ♦ That the "Inputs"
            → to "Formal Parameters"
            → are "Values",

        ♦ While the "Inputs"
            → to "Type Parameters"
            → are "Types".


    ▬ "Generic Type"
        → is a "Generic Class" or "Interface"
        → that is "Parameterized"
        → over "Types".




    ▬ The most commonly used type parameter names are:

        • E - "Element" (used extensively by the Java Collections Framework)
        • K - "Key"
        • N - "Number"
        • T - "Type"
        • V - "Value"
        • S - "2nd Type"
        • U - "3rd Type"
        • V - "4th type"


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/


package generics;



public class Generic_Method {


    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ Calling "Welcome" Generic Method ▼
        welcome("Nicholas");
        welcome(20);
        welcome(true);
    }



    // ▬ The "welcome()" Method of "String" Data Type ▬
//    public static void welcome(String name) {
//        System.out.println("Welcome, " + name + "!");
//    }


    // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
    // ▬ BUT THE CODE IS REDUNDANT → THEREFORE THE "GENERIC TYPE" SHOULD BE USED! ▬
    // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

//    // ▬ Overloading the "welcome()" Method → as "Int" Data Type ▬
//    public static void welcome(int i) {
//        System.out.println("Welcome, " + i + "!");
//    }
//
//
//    // ▬ Overloading the "welcome()" Method → as "Bollean" Data Type ▬
//    public static void welcome(boolean bool) {
//        System.out.println("Welcome, " + bool + "!");
//    }





    // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
    // ▬ "USE" OF "GENERIC TYPE" FOR "METHOD" ▬
    // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

    // ▬ The "welcome()" Generic Type Method ▬
    //      → by Adding "<T>"
    //      → "T" = "Type",
    //      → "t" = "Object".
    public static <T> void welcome(T t) {
        System.out.println("Welcome, " + t + "!");
    }
}