package design_patterns.structural.adapter.problem_2_second_way;

public class TriangleAdapter extends Triangle implements Shape {

    // ▬ The "Constructor" ▬
    public TriangleAdapter(double a, double b, double c) {
        super(a, b, c);
    }


    // ▬ The "draw()" Override Method ▬
    @Override
    public void draw() {
        // ▼ Adapting "drawShape()" to "draw()" Method ▼
        this.drawShape();
    }

    // ▬ The "resize()" Override Method ▬
    @Override
    public void resize() {
        System.out.println("Triangle is not able to be resized.");
    }


    // ▬ The "description()" Override Method ▬
    @Override
    public String description() {
        return "Triangle Object";
    }


    // ▬ The "isHide()" Override Method ▬
    @Override
    public boolean isHide() {
        return false;
    }
}
