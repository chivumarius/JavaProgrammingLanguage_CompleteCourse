package design_patterns.creational.builder.problem2;


// ▬ "Extends" the "Delivery" Class ▬
public class ByDelivery extends Delivery{

    // ▬ The "deliver()" Override Method ▬
    @Override
    public void deliver() {
        System.out.println("By Delivery");
    }


    // ▬ The "toString()" Override Method ▬
    @Override
    public String toString() {
        return "By Delivery";
    }
}
