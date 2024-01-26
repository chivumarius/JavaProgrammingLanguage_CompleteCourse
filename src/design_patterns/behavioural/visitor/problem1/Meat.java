package design_patterns.behavioural.visitor.problem1;


// ▬ [1-2] "Concrete Element" ▬
public class Meat implements Pizza {
    @Override
    public String order() {
        return "Meat Pizza";
    }
}
