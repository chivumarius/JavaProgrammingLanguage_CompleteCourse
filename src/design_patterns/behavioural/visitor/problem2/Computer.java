package design_patterns.behavioural.visitor.problem2;


// ▬ [1-4] "Concrete Element" ▬
public class Computer implements ComputerPart {

    ComputerPart[] parts;



    // ▬ "Constructor" ▬
    public Computer() {
        this.parts =new ComputerPart[]{
                new Keyboard(),
                new Monitor(),
                new Mouse()
        };
    }



    // ▬ The "accept()" Override Method ▬
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        // ▼ "Loop" through All "Parts" ▼
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }

        computerPartVisitor.visit(this);
    }
}
