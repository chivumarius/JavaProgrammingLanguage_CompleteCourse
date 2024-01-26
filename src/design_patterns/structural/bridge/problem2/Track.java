package design_patterns.structural.bridge.problem2;


// ▬ Refine "Abstraction 3" in "Bridge Pattern" ▬
public class Track extends Vehicle {

    // ▬ The "Constructor" ▬
    public Track(Workshop assembleWorkShop, Workshop produceWorkShop) {
        super(assembleWorkShop, produceWorkShop);
    }


    // ▬ The "manufacture()" Override Method ▬
    @Override
    public void manufacture(){
        System.out.print("Track ");
        assembleWorkShop.work();
        produceWorkShop.work();
    }
}
