package design_patterns.structural.adapter.problem_1;

public class Porche extends Vehicle {

    // ▬ "Constructor" ▬
    public Porche() {
        super("Porche");
    }


    // ▬ The "getSpeedMPH()" Override Method ▬
    @Override
    int getSpeed() {
        return 220;
    }
}
