package design_patterns.creational.builder.problem2;


// ▬ "Extends" the "SandwichBuilder" Class ▬
public class Hamburger extends SandwichBuilder {

    // ▬ The "buildMeat()" Override Method ▬
    @Override
    public void buildMeat() {
        sandwich.setMeat(new Beef());
    }


    // ▬ The "buildSauce()" Override Method ▬
    @Override
    public void buildSauce() {
        sandwich.setSauce(new Barbeque());
    }



    // ▬ The "buildDelivery()" Override Method ▬
    @Override
    public void buildDelivery() {
        sandwich.setDelivery(new OnTable());
    }
}
