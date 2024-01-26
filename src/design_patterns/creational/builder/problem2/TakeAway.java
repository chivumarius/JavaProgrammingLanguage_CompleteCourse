package design_patterns.creational.builder.problem2;


// ▬ "Extends" the "Delivery" Class ▬
public class TakeAway extends Delivery{

    // ▬ The "deliver()" Override Method ▬
    @Override
    public void deliver() {
        System.out.println("Take Away");
    }


    // ▬ The "toString()" Override Method ▬
    @Override
    public String toString() {
        return "Take Away";
    }
}
