package design_patterns.behavioural.interpreter.problem2;


import java.util.List;


// ▬ [1] "Interface" ▬
public interface Expression {
    // ▬ "Method" ▬
    List<String> interpret(Context context);
}
