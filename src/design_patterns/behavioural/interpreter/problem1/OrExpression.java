package design_patterns.behavioural.interpreter.problem1;


// ▬ [1-2] "Implements" the "Expression" Interface ▬
public class OrExpression implements Expression{

    // ▼ "Validating" the "Expressions" ▼
    private Expression expr1 = null;
    private Expression expr2 = null;


    // ▬ "Constructor" ▬
    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }



    // ▬ The "interpret()" Override Method ▬
    @Override
    public boolean interpret(String context) {

        // ▼ "Or" Operator ▼
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
