/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

               ► "INTERPRETER" ◄
                - "PROBLEM 1" -




  Problem 1:

    • We "Need" to "Create"
        → a "Text Analyzer"
        → to Answer some "Sentence-Related Questions";



○ For "Example":

    • ""Jack"" loves "swimming" and "Jack" is "male".
 	    •► is "Jack" a "Male"?
	    •► "True"


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.interpreter.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunInterpreterPattern();
    }


    // ▬ The "RunInterpreterPattern()" Method ▬
    private static void RunInterpreterPattern() {
        System.out.println("\n");

        // ▼ Create the "Expression" Objects
        //      → and "Storing" the "Methods Calls" ▼
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        // ▼ "Display" the "Results" ▼
        System.out.println("John is a male? " + isMale.interpret("John"));
        System.out.println("Sara is a married women? " + isMarriedWoman.interpret("Married Sara"));


        System.out.println("\n");
    }



    // ▬ The "getMaleExpression()" Method ▬
    public static Expression getMaleExpression() {
        // ▬♦▬ Rule 1: "Jack" and "John" are "Male". ▬♦▬
        // ▼ Create the "Expression" Objects as "TerminalExpression" Types ▼
        Expression jack = new TerminalExpression("Jack");
        Expression john = new TerminalExpression("John");

        //
        return new OrExpression(jack, john);
    }



    // ▬ The "getMarriedWomanExpression()" Method ▬
    public static Expression getMarriedWomanExpression() {
        // ▬♦▬ Rule 2: "Sara" are "Married Woman". ▬♦▬
        // ▼ Create the "Expression" Objects as "TerminalExpression" Types ▼
        Expression sara = new TerminalExpression("Sara");
        Expression married = new TerminalExpression("Married");

        // ▼ "And Expression" ▼
        return new AndExpression(sara, married);
    }
}
