package design_patterns.behavioural.interpreter.problem1;


// ▬ [1-3] "Implements" the "Expression" Interface ▬
public class AndExpression implements Expression {

    // ▼ Creating the "Instances"/"Objects" ▼
    private Expression expr1 = null;
    private Expression expr2 = null;



    // ▬ "Constructor" ▬
    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    // ▬ The "interpret()" Override Method ▬
    @Override
    public boolean interpret(String context) {
        // ▼ "And" Operator ▼
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
