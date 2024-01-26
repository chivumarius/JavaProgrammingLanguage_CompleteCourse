package design_patterns.structural.adapter.problem_2_second_way;



// ▬ "Adapter Child" Class ▬
public class RhombusAdapter extends Rhombus implements Shape {

    // ▬ The "Constructor" ▬
    public RhombusAdapter(double a, double b) {
        super(a, b);
    }


    // ▬ The "draw()" Override Method ▬
    @Override
    public void draw() {
        // Adapting "drawShape()" to "draw()" Method
        this.drawShape();
    }


    // ▬ The "calculatePerimeter()" Override Method ▬
    @Override
    public void resize() {
        System.out.println("Rhombus is not able to be resized.");
    }



    // ▬ The "description()" Override Method ▬
    @Override
    public String description() {
        return "Rhombus Object";
    }

    @Override
    public boolean isHide() {
        return false;
    }


    public boolean isHidden() {
        return false;
    }
}
