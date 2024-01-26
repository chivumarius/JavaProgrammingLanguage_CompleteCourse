package design_patterns.behavioural.visitor.problem1;


// ▬ [1-1] "Concrete Element" ▬
public class Veggie implements Pizza {

    // ▬ The "order()" Override Method ▬
    @Override
    public String order() {
        return "Veggie Pizza";
    }
}
