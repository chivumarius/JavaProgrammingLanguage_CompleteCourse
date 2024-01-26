package design_patterns.creational.builder.problem2;


// ▬ "Extends" the "Delivery" Class ▬
public class OnTable extends Delivery {

    // ▬ The "deliver()" Override Method ▬
    @Override
    public void deliver() {
        System.out.println("On Table");
    }



    // ▬ The "toString()" Override Method ▬
    @Override
    public String toString() {
        return "On Table";
    }
}
