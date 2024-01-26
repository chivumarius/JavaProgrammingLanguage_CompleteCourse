package design_patterns.behavioural.visitor.problem2;


// ▬ [1-2] "Concrete Element" ▬
public class Monitor implements ComputerPart {

    // ▬ The "accept()" Override Method ▬
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
