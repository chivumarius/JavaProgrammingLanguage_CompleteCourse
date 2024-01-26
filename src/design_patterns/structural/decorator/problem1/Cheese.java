package design_patterns.structural.decorator.problem1;


// ▬ "Extends" the "ToppingsDecorator" Class ▬
public class Cheese extends ToppingsDecorator {

    // ▼ "Object Declaration" ▼
    Pizza pizza;



    // ▬ "Constructor" ▬
    public Cheese(String description, Pizza pizza) {
        super("Cheese Toppings");
        this.pizza = pizza;
    }



    // ▬ The "getDescription()" Override Method ▬
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese Toppings";
    }


    // ▬ The "getCost()" Override Method ▬
    @Override
    public int getCost() {
        // ▼ "Toppings Cost" ▼
        return 5 + pizza.getCost();
    }
}
