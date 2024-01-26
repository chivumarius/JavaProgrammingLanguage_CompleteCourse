package design_patterns.structural.decorator.problem2;


// ▬ "Component" Class
//      → that "Implements" the "Car" Interface ▬
public class BasicCar implements Car {

    // ▬ The "assemble()" Override Method
    @Override
    public void assemble() {
        System.out.print("Basic Car");
    }

}
