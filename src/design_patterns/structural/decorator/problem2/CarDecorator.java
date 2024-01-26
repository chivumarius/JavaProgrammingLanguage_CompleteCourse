package design_patterns.structural.decorator.problem2;


// ▬ "Decorator" Class
//      → that "Implements" the "Car" Interface ▬
public class CarDecorator implements Car {

    // ▼ "Object Declaration" ▼
    protected Car car;


    // ▬ "Constructor" ▬
    public CarDecorator(Car car){
        this.car = car;
    }



    // ▬ The "assemble()" Override Method
    @Override
    public void assemble() {
        this.car.assemble();
    }
}

