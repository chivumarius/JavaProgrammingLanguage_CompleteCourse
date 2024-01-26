package design_patterns.structural.adapter.problem_1;

public class Bugatti extends Vehicle {

    // ▬ "Constructor" ▬
    public Bugatti() {
        super("Bugatti");
    }


    // ▬ The "getSpeedMPH()" Override Method ▬
    @Override
    int getSpeed() {
        return 240;
    }
}
