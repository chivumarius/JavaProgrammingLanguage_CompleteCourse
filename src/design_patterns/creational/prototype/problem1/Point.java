package design_patterns.creational.prototype.problem1;


// ▬ "Extends" the "Shape" Class
public class Point extends Shape {

    // ▬ "Constructor" ▬
    public Point(int x, int y) {
        super(x, y);
    }


    // ▬▬ "Cloning" the "Object" ▬▬
    // ▬ The "clone()" Override Meth ▬      → for  ▬
    @Override
    public Shape clone() {
        return new Point(this.x, this.y);
    }
}
