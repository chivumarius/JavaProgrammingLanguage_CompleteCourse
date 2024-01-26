package design_patterns.structural.bridge.problem2;

// ▬ Refine "Abstraction 2" in "Bridge Pattern" ▬
public class Bike extends Vehicle {

    // ▬ The "Constructor" ▬
    public Bike(Workshop assembleWorkShop, Workshop produceWorkShop) {
        super(assembleWorkShop, produceWorkShop);
    }


    // ▬ The "manufacture()" Override Method ▬
    @Override
    public void manufacture(){
        System.out.print("Bike ");
        assembleWorkShop.work();
        produceWorkShop.work();
    }
}
