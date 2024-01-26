package design_patterns.creational.builder.problem1;


// ▬ "Abstract" Class
//      → that "Extends" the "Ingredient" Class ▬
public abstract class Meat extends Ingredient {

    // ▬ The "Constructor"
    public Meat(String name) {
        super(name);
    }
}
