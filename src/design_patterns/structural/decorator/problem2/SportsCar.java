package design_patterns.structural.decorator.problem2;


// ▬ "Concrete Decorator 1" Class  (Feature 1)
//      → that "Extends" the "CarDecorator" Class ▬
public class SportsCar extends CarDecorator {

    // ▬ "Constructor" ▬
    public SportsCar(Car car) {
        super(car);
    }



    // ▬ The "assemble()" Override Method
    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Sports Features Added!");
    }
}
