package design_patterns.behavioural.visitor.problem2;


// ▬ [1-3] "Concrete Element" ▬
public class Mouse implements ComputerPart {

    // ▬ The "accept()" Override Method ▬
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
