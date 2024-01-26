package design_patterns.structural.bridge.problem2;

// ▬ (2) "Abstraction" in "Bridge Pattern" ▬
public abstract class Vehicle {

    // ▼ Create "Workshop" Objects ▼
    protected Workshop assembleWorkShop;
    protected Workshop produceWorkShop;


    // ▬ The "Constructor" ▬
    public Vehicle(Workshop assembleWorkShop, Workshop produceWorkShop){
        this.assembleWorkShop = assembleWorkShop;
        this.produceWorkShop = produceWorkShop;
    }


    // ▬ The "manufacture()" Method ▬
    abstract public void manufacture();
}
