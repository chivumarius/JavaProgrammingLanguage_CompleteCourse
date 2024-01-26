
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
               • "GENERICS" •
        - "GENERIC TYPE" WITH "JOKER" -




    ▬ The "Question Mark" (?)
        → is known as the "Wildcard" in Generic Programming.



    ▬ "Wildcard" ("?" = "Anything")
        → represents an "Unknown Data Type"
        → the "data Type" can be "Anything".

            • Ex:  List<?>



    ▬  The "Wildcard" ("?")
        → can be "Used" in a "Vriety" of "Situations"
        → such as the "Type" of a:
            • "Parameter",
            • "Field", or
            • "Local Variable";

         → sometimes as a
            • "Return Type".


    ▬ Unlike "Arrays",
        → Different "Instantiations" of a "Generic Type"
        → are "Not Compatible" with "Each Other",
        → Not Even "Explicitly".


     ▬ This "Incompatibility"
        → may be "Softened"
        → by the "Wildcard"
        → if "?" is "Used"
        → as an "Actual Type Parameter".



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


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class Generic_Type_with_Wildcard {


    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ "Creating" an "Object" List of "ArrayList" Type ▼
        List<Integer> numbers = new ArrayList<>();

        // ▼ We Can Have "Wildcard" ("?") ▼
//        List<? extends String[]> numbers = new ArrayList<>();
//        List<? extends Comparable<String>> numbers = new ArrayList<>();
//        List<? extends Map<>> numbers = new ArrayList<>();
//        List<? extends Comparable<? super Long>> numbers = new ArrayList<>();



       // ▼ "Adding" an "Element" to the "List" ▼
       numbers.add(10);
       numbers.add(20);
       numbers.add(30);

       // ▼ "Printing" the "Elements" of the "List" ▼
       printElements(numbers);
    }




    // ▬ The "printElements()" Method
    //      → with "Wildcard" ("? extends") ▬
    public static void printElements(List<? extends Number> elements){
//    public static void printElements(List<? super Integer> elements){

        // ▼ "For Each" Loop to Print "All Elements" ▼
        for(Number element : elements){
            System.out.println(element);
        }
    }
}

