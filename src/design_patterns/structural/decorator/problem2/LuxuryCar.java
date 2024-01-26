package design_patterns.structural.decorator.problem2;


// ▬ "Concrete Decorator 2" Class  (Feature 1)
//      → that "Extends" the "CarDecorator" Class ▬
public class LuxuryCar extends CarDecorator {

    // ▬ "Constructor" ▬
    public LuxuryCar(Car c) {
        super(c);
    }


    // ▬ The "assemble()" Override Method
    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Luxury Features Added!");
    }
}
