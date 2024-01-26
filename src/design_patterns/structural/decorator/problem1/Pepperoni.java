package design_patterns.structural.decorator.problem1;


// ▬ "Extends" the "Pizza" Class ▬
public class Pepperoni extends Pizza {

    // ▬ "Constructor" ▬
    public Pepperoni() {
        super("Pepperoni");
    }



    // ▬ The "getCost()" Override Method ▬
    @Override
    public int getCost() {
        return 30;
    }
}
