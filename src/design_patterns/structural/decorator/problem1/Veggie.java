package design_patterns.structural.decorator.problem1;


// ▬ "Extends" the "Pizza" Class ▬
public class Veggie extends Pizza {

    // ▬ "Constructor" ▬
    public Veggie() {
        super("Veggie");
    }


    //
    @Override
    public int getCost() {
        return 10;
    }
}
