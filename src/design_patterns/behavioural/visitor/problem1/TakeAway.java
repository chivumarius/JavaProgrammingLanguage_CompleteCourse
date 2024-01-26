package design_patterns.behavioural.visitor.problem1;


// ▬ [2-1] "Concrete Visitor" ▬
public class TakeAway implements HowTo {

    // ▼ Properties ▼
    private String name;
    private final String method = "Take Away";


    // ▬ The "visit()" Override Method ▬
    @Override
    public void visit(Pizza pizza) {
        pizza.order();
    }



    // ▬ The "toString()" Override Method ▬
    @Override
    public String toString() {
        return "TakeAway{" +
                "name ='" + name + '\'' +
                ", method = '" + method + '\'' +
                '}';
    }
}
