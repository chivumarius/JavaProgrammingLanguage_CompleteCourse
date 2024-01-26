
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "STRUCTURAL DESIGN PATTERNS" •
          ________________________________
                  
                ► "ADAPTER" ◄
               - "PROBLEM 2" -
               




    Problem 2:

        ▬ Suppose we have a "Project" of "Drawing",
            → in which we are "Required"
            → to "Develop Different Kinds" of "Geometric Shapes"
            → that will be "Used" in the "Drawing"
            → via a Common "Interface"
            → called "Shape".


        ▬ As we "Progress",
            → we come to "Know"
            → that there are Some "Extra Geometric Shapes"
            → that are "Already Developed"
            → either by some "Other Team"
            → within our "Organization",
            → or, we have a "Third-Party API",
            → which is "Available" to "Us".


        ▬ Below are the "Classes"
            → "Ready" to "Use":


            Client       --→      	Shape
            + main()		        draw()
			                        resize()
			                        description(): String
			                        isHide(): boolean
			                            ↑
	                     _______________|__
	                     |                |
	                  Rectangle 	   Circle



 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.structural.adapter.problem_2_first_way;


public class Client {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunAdapterPattern();
    }



    // ▬
    public static void RunAdapterPattern()
    {
        // ▼ 1. Create a "Shape" Object of "Circle" ▼
        Shape shape1 = new Circle();

        // ▼ "Access" the "Object Methods" ▼
        shape1.draw();




        // ▼ 2. Create a "GeometricShape" Object of "Rhombus" ▼
        GeometricShape geometricShape1 = new Rhombus(10, 20);

        // ▼ "Access" the "Object Methods" ▼
        geometricShape1.drawShape();



        // ▼ 3. Create a "Shape" Object
        //          → of "Geometric Shape Object Adapter" Type
        //          → in which we Create a "Triangle" ▼
        Shape shape2 = new GeometricShapeObjectAdapter(new Triangle(1, 2, 3));

        // ▼ "Access" the "Object Methods" ▼
        shape2.draw();

    }
}
