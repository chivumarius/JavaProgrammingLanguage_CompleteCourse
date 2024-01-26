package design_patterns.behavioural.visitor.problem2;


// ▬ [1] "Element" ("Product") Interface ▬
public interface ComputerPart {

    // ▬ "Method" ▬
    void accept(ComputerPartVisitor computerPartVisitor);
}
