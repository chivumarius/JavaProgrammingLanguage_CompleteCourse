package design_patterns.structural.adapter.problem_1;



// ▬ The "VehicleAdapter" Class ▬
//      → "Extends" the "Vehicle" Class and
//      → "Implements" the "AdapterService" Interface ▬
public abstract class VehicleAdapter extends Vehicle
        implements ServiceAdapter {


    // ▬ The "Constructor" Method ▬
    public VehicleAdapter(String brand) {
        super(brand);
    }



    // ▬ The "getSpeed()" Method ▬
    int getSpeed() {
        // ▼ "Returning"
        //      → from "Adapter Service" Interface ▼
        return speedKPH();
    }



    // ▬ The "toString()" Override Method ▬

    @Override
    public String toString()
    {
        return brand + " : " + getSpeed() + " KPH";
    }
}