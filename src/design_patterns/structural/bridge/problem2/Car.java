package design_patterns.structural.bridge.problem2;

// ▬ Refine "Abstraction 1" in "Bridge Pattern" ▬
public class Car extends Vehicle {

    // ▬ The "Constructor" ▬
    public Car(Workshop assembleWorkShop, Workshop produceWorkShop) {
        super(assembleWorkShop, produceWorkShop);
    }


    // ▬ The "manufacture()" Override Method ▬
    @Override
    public void manufacture(){
        System.out.print("Car ");
        assembleWorkShop.work();
        produceWorkShop.work();
    }
}
