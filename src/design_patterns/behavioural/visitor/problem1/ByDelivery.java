package design_patterns.behavioural.visitor.problem1;


// ▬ [2-2] "Concrete Visitor" ▬
public class ByDelivery implements HowTo {

    // ▼ "Properties" ▼
    private String name;
    private final String method = "By Delivery";


    // ▬ The "visit()" Override Method ▬
    @Override
    public void visit(Pizza pizza) {
        pizza.order();
    }



    // ▬ The "toString()" Override Method ▬
    @Override
    public String toString() {
        return "ByDelivery{" +
                "name ='" + name + '\'' +
                ", method = '" + method + '\'' +
                '}';
    }
}
