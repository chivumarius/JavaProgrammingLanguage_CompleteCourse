package design_patterns.behavioural.visitor.problem2;


// ▬ [2] "Visitor" ▬
public interface ComputerPartVisitor {

    // ▬ "Methods" ▬
    void visit(Computer computer);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
}
