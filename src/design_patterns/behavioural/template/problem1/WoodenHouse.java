package design_patterns.behavioural.template.problem1;

// ▬ "Extends" the "HouseTemplate Class" ▬
public class WoodenHouse extends HouseTemplate {

    // ▬ The "buildPillars()" Override Method
    @Override
    public void buildPillars() {
        System.out.println("Building Wooden Pillars");
    }



    // ▬ The "buildWalls()" Override Method
    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }
}
