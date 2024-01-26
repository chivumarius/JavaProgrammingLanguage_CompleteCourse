package design_patterns.behavioural.interpreter.problem2;

import java.util.List;


// ▬ [1-3] "Implements" the "Expression" Interface ▬
public class Select implements Expression {
    // ▼ "Properties" ▼
    private String column;
    private From from;


    // ▬ "Constructor" ▬
    public Select(String column, From from) {
        this.column = column;
        this.from = from;
    }



    // ▬ The "interpret()" Override Method ▬
    @Override
    public List<String> interpret(Context context) {
        context.setColumn(column);
        return from.interpret(context);
    }
}
