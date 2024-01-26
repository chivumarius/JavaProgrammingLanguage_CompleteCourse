package design_patterns.structural.decorator.problem1;


// ▬ "Extends" the "Pizza" Class ▬
public class Margherita extends Pizza {

    // ▬ "Constructor" ▬
    public Margherita() {
        super("Margherita");
    }


    // ▬ The "getCost()" Override Method ▬
    @Override
    public int getCost() {
        return 20;
    }
}
