package design_patterns.creational.builder.problem1;


// ▬ "Abstract" Class ▬
public abstract class Ingredient {
    // ▼ "Property" ▼
    String name;


    // ▬ "Constructor" ▬
    public Ingredient(String name) {
        this.name = name;
    }


    // ▬ "Getter" → for the "Name" Property ▬
    public String getName() {
        return name;
    }
}
