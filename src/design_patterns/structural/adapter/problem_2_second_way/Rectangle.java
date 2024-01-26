package design_patterns.structural.adapter.problem_2_second_way;


// ▬ The "Rectangle" Class →→
//      → that "Implements" the "Shape" Interface ▬
public class Rectangle implements Shape {

    // ▬ The "draw()" Override Method ▬
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    // ▬ The "resize()" Override Method ▬
    @Override
    public void resize() {
        System.out.println("Resizing a Rectangle");
    }


    // ▬ The "description()" Override Method ▬
    @Override
    public String description() {
        return "Rectangle Object";
    }


    // ▬ The "isHide()" Override Method ▬
    @Override
    public boolean isHide() {
        return false;
    }
}
