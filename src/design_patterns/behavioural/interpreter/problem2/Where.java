package design_patterns.behavioural.interpreter.problem2;


import java.util.List;
import java.util.function.Predicate;

// ▬ [1-2] "Implements" the "Expression" Interface ▬
public class Where implements Expression {

    private Predicate<String> filter;


    // ▬ "Constructor" ▬
    public Where(Predicate<String> filter) {
        this.filter = filter;
    }

    // ▬ The "interpret()" Override Method ▬
    @Override
    public List<String> interpret(Context context) {
        context.setFilter(filter);
        return context.search();
    }
}
