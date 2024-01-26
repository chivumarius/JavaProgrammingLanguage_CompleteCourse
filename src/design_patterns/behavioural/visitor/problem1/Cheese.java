package design_patterns.behavioural.visitor.problem1;


// ▬ [1-3] "Concrete Element" ▬
public class Cheese implements Pizza {
    @Override
    public String order() {
        return "Cheese Pizza";
    }
}
