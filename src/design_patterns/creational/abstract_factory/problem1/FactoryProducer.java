package design_patterns.creational.abstract_factory.problem1;



// ▬ (3) "Factory Producer"
//          → wil  "Determine"
//          → which "Factory"
//          → to "Use" ▬
public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded) {

       // ▼ Check if "Rounded" is "True" ▼
       if (rounded) {
           return new RoundedShapeFactory();
       } else {
           return new ShapeFactory();
       }
    }
}
