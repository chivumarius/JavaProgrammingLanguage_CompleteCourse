package design_patterns.behavioural.visitor.problem2;


// ▬ [2-1] "Concrete Visitor" ▬
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    // ▬ The "visit()" Override Method → for "Computer" ▬
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }


    // ▬ The "visit()" Override Method → for "Keyboard" ▬
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }


    // ▬ The "visit()" Override Method → for "Monitor" ▬
    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }


    // ▬ The "visit()" Override Method → for "Mouse" ▬
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }
}
