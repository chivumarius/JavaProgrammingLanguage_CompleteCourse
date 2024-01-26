package design_patterns.creational.builder.problem1;


// ▬ "Abstract" Class
//      → that "Extends" the "Ingredient" Class ▬
public abstract class Sauce extends Ingredient {

    // ▬ The "Constructor" ▬
    public Sauce(String name) {
        super(name);
    }
}

