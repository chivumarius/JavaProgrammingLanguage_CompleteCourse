package design_patterns.structural.adapter.problem_1;

public abstract class Vehicle {

    // ▼ Property ▼
     protected String brand;


    // ▬ "Constructor" ▬
    public Vehicle(String brand) {
        this.brand = brand;
    }


    // ▬ The "getSpeedMPH()" Abstract Method ▬
    abstract int getSpeed();



    // ▬ The "toString()" Override Method ▬
    @Override
    public String toString() {
        return brand + " : " + getSpeed() + " MPH";
    }
}
