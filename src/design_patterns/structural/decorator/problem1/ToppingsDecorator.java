package design_patterns.structural.decorator.problem1;

// ▬ The "Decorator" Class
//      → it "Extends" the "Pizza" Class
//      → to be "Interchangeable"
//      → with It "Toppings".
//      → "Decorator" can also be "Implemented"
//      → as an "Interface" ▬
public abstract class ToppingsDecorator extends Pizza {

    // ▬ "Constructor" ▬
    public ToppingsDecorator(String description) {
        super(description);
    }


    // ▬ The "getDescription()" Method
    public abstract String getDescription();
}
