package design_patterns.behavioural.visitor.problem2;


// ▬ [1-1] "Concrete Element" ▬
public class Keyboard implements ComputerPart {

    // ▬ The "accept()" Override Method ▬
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
