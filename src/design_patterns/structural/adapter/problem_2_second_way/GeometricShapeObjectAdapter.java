package design_patterns.structural.adapter.problem_2_second_way;



// ▬ "Adapter" Class
//      → that use "Composite"
//      → and Implements the "Shape" Interface ▬
public class GeometricShapeObjectAdapter implements Shape {


    // ▼ Using "GeometricShape" Object ▼
    private GeometricShape adaptee;


    // ▬ "Constructor" ▬
    public GeometricShapeObjectAdapter(GeometricShape adapted) {
        this.adaptee = adaptee;
    }


    // ▬ The "draw()" Override Method ▬
    @Override
    public void draw() {

    }


    // ▬ The "resize()" Override Method ▬
    @Override
    public void resize() {
        System.out.println( description() + " can not be resized noe");
    }

    // ▬ The "description()" Override Method ▬
    @Override
    public String description() {

        // ▼ "Checking": If the "GeometricShape" Object is "Triangle" ▼
        if(adaptee instanceof Triangle) {
            return "Triangle Object";

         } else if (adaptee instanceof Rhombus) {
            return "Rhombus Object";
        } else {
            return "Unknown Object";
        }
    }


    // ▬ The "isHide()" Override Method ▬
    @Override
    public boolean isHide() {
        return false;
    }
}
