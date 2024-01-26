package design_patterns.structural.decorator.problem1;


// ▬ "Extends" the "ToppingsDecorator" Class ▬
public class Barbeque extends ToppingsDecorator {

    // ▼ "Object Declaration" ▼
    Pizza pizza;


    // ▬ "Constructor" ▬

    public Barbeque(String description, Pizza pizza) {
        super(description);
        this.pizza = pizza;
    }


    // ▬ The "getCost()" Override Method ▬
    @Override
    public int getCost() {
        // ▼ "Toppings Cost"  & "Base Cost" ▼
        return 10 + pizza.getCost();
    }


    // ▬ The "getDescription()" Override Method ▬
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Barbeque Toppings";
    }
}
