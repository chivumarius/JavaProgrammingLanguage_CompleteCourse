package design_patterns.behavioural.visitor.problem1;


// ▬ [2-3] "Concrete Visitor" ▬
public class OnTable implements HowTo {

    // ▼ "Properties" ▼
    private String name;
    private final String method = "On Table";



    //▬ The "visit()" Override Method ▬
    @Override
    public void visit(Pizza pizza) {
        pizza.order();
    }



    // ▬ The "toString()" Override Method ▬
    @Override
    public String toString() {
        return "OnTable{" +
                "name ='" + name + '\'' +
                ", method = '" + method + '\'' +
                '}';
    }
}
