package design_patterns.creational.builder.problem1;


import javax.swing.plaf.basic.BasicEditorPaneUI;

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
}
