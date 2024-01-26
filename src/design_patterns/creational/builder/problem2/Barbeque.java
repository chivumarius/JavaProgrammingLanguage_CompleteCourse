package design_patterns.creational.builder.problem2;


// ▬ "Extends" the "Sauce" Class ▬
public class Barbeque extends Sauce {

    // ▬ The "Constructor" ▬
    public Barbeque() {
        super("Barbeque");
    }


    // ▬ The "toString()" Override Method ▬
    @Override
    public String toString() {
        return "Barbeque";
    }
}
