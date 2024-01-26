/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

               ► "INTERPRETER" ◄
                - "PROBLEM 2" -




  Problem 2:

      • We'll build a simple "SQL Syntax analyzer",
        → which will "Interpret" and
        → Execute "SQL Queries" ("Select", "From", "Where").

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.interpreter.problem2;


import java.util.List;

public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunInterpreterPattern();
    }


    // ▬ The "RunInterpreterPattern()" Method ▬
    private static void RunInterpreterPattern() {
        System.out.println("\n");

        // ▼ Create the "Expression" Objects ▼
//        Expression query = new Select("firstName", new From("People"));
        Expression query = new Select("*", new From("People"));

        // ▼ Create the "Context" Object ▼
        Context context = new Context();

        // ▼ Store the Query ▼
        List<String> result = query.interpret(context);

        // ▼ "Display" the "Results" ▼
        System.out.println(result);


        System.out.println("\n");



        // ▼ Create the "Expression" Objects ▼
        Expression query2 = new Select(
                "firstName",
                 new From("People",
                 new Where(firstName -> firstName.toLowerCase().startsWith("j")))
        );


        // ▼ Create the "Context" Object ▼
        Context context2 = new Context();

        // ▼ Store the Query ▼
        List<String> result2 = query2.interpret(context2);

        // ▼ "Display" the "Results" ▼
        System.out.println(result2);


        System.out.println("\n");
    }
}
