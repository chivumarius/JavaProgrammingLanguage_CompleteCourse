package design_patterns.structural.adapter.problem_1;


// ▬ The "BugattiAdapter" Class ▬
//      → "Extends" the "VehicleAdapter" Class ▬
public class BugattiAdapter extends VehicleAdapter {

    // ▬ The "Constructor" Method ▬
    public BugattiAdapter() {
        super("Bugatti");
    }



    // ▬ The "getSpeed()" Method ▬
    @Override
    public int speedKPH() {
        return (int)((int) 240 * 1.6);
    }
}
