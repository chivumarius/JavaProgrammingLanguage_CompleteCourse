package design_patterns.structural.adapter.problem_2_first_way;


// ▬ The "Circle" Class →→
//      → that "Implements" the "Shape" Interface ▬
public class Circle implements Shape {

    // ▬ The "draw()" Override ▬
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }


    // ▬ The "resize()" Override ▬
    @Override
    public void resize() {
        System.out.println("Resizing a Circle");
    }


    // ▬ The "description()" Override ▬
    @Override
    public String description() {
        return "Circle Object";
    }


    // ▬ The "isHide()" Override ▬
    @Override
    public boolean isHide() {
        return false;
    }
}
