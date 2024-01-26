package design_patterns.structural.adapter.problem_1;

public class Maserati extends Vehicle {

    // ▬ "Constructor" ▬
    public Maserati() {
        super("Maserati");
    }


    // ▬ The "getSpeedMPH()" Override Method ▬
    @Override
    int getSpeed() {
        return 200;
    }
}
