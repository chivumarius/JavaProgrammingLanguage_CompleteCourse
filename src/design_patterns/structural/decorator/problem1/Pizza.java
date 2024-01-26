package design_patterns.structural.decorator.problem1;


// ▬ "Abstract" Class ▬
public abstract class Pizza {

    // ▼ "Property initialization" ▼
    String description = "Basic Pizza";


    // ▬ "Constructor" ▬
    public Pizza(String description) {
        this.description = description;
    }

    // ▬ The "getDescription()" Method ▬
    public String getDescription() {
        return description;
    }


    // ▬ The "getCost()" Abstract Method ▬
    public abstract int getCost();
}