package design_patterns.creational.builder.problem2;


// ▬ "Extends" the "Meat" Class ▬
public class Beef extends Meat {

    // ▬ The "Constructor" ▬
    public Beef() {
        super("Beef");
    }

    // ▬ The "toString()" Override Method ▬
    @Override
    public String toString() {
        return "Beef";
    }
}
