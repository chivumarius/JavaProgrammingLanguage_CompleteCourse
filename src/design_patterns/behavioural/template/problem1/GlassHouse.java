package design_patterns.behavioural.template.problem1;


// ▬ "Extends" the "HouseTemplate Class" ▬
public class GlassHouse extends HouseTemplate {

    // ▬ The "buildPillars()" Override Method
    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Glass Coating");
    }


    // ▬ The "buildWalls()" Override Method
    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }
}
