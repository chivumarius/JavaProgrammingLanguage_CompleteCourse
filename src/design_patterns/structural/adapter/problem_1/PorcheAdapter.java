package design_patterns.structural.adapter.problem_1;



// ▬ The "PorcheAdapter" Class ▬
//      → "Extends" the "VehicleAdapter" Class ▬
public class PorcheAdapter extends VehicleAdapter {

    // ▬ The "Constructor" Method ▬
    public PorcheAdapter() {
        super("Porche");
    }


    // ▬ The "getSpeed()" Method ▬
    @Override
    public int speedKPH() {

        return (int)((int) 220 * 1.6);
    }
}
