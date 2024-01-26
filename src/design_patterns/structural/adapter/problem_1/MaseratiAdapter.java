package design_patterns.structural.adapter.problem_1;



// ▬ The "MaseratiAdapter" Class ▬
//      → "Extends" the "VehicleAdapter" Class ▬
public class MaseratiAdapter extends VehicleAdapter {

    // ▬ The "Constructor" Method ▬
    public MaseratiAdapter() {
        super("Maserati");
    }


    // ▬ The "getSpeed()" Method ▬
    @Override
    public int speedKPH() {
        return (int)(200 * 1.6);
    }
}
