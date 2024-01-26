package design_patterns.behavioural.interpreter.problem1;


// ▬ [1-1] "Implements" the "Expression" Interface ▬
public class TerminalExpression implements Expression {

    // ▼ "Property" ▼
    private String data;


    // ▬ "Constructor" ▬
    public TerminalExpression(String data) {
        this.data = data;
    }



    // ▬ The "interpret()" Override Method ▬
    @Override
    public boolean interpret(String context) {

        // ▼ If the "Context" ("Sentence") Contains the "Data" ▼
        if(context.contains(data)){
            return true;
        }

        // ▼ Otherwise ▼
        return false;
    }
}
