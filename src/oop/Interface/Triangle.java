/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
               • "OOP" •
            ► "INTERFACES" ◄



    ▬ An "Interface"
        → is a Set of "Methods Declarations",
        → It is an "Abstract" Class
        → "Used" to "Group"
        → "Related Methods"
        → with "Empty Bodies".


    ▬ An "Interface"
        → is like a "Clas"
        → but it "Contains"
        → Only "Methods" ("Headers")
        → without a "Body".


    ▬ "Interface Methods",
           → can be "Accessed"
           → only by "Implementing" a "C"lass" (as in "Inheritance")
           → from "Another Class"
           → with "implements" Keyword (instead of "extends").

   ▬ The "Body"
        → of the "Interface Method"
        → is "Provided" by the "implement" Class.




 (I) "NOTICES":

    ▬ Like "Abstract" Classes,
        → "Interfaces" cannot be "Used"
        → to Create "Objects".


    ▬ "Interface Methods"
        → do Not Have a "Body"
        → the "Body"
        → is "Provided"
        → by the "implement" Class.


    ▬ On "Implementation" of an "Interface",
        → we must "Override All"
        → of "Its Methods".


    ▬ "Interface Methods"
        → are by Default "Abstract"
        → and "Public".


    ▬ "Interface Attributes"
        → are by Default:
            • "Public",
            • "Static" and
            • "Final".


    ▬ An "Interface"
        → cannot "Contain"
        → a "Constructor".




 (II) "Why" & "When" to "Use Interfaces":

        (1) To "Achieve Security"

                • "Hide Certain Details"
                    → and "Only Show"
                    → the "Important Details"
                    → of an "Object" ("Interface").


        (2) "Java" does "Not Support"
                → "Multiple Inheritance"
                (a "Class" can "Only Inherit" from "One SuperClass").

                • It Can Be "Achieved"
                    → with "Interfaces",
                    → because the "Class"
                    → can "Implement"
                    → "Multiple Interfaces". Note: To implement multiple interfaces, separate them with a comma (see example below).

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package oop.Interface;



// ▬ "Implementation"
//      → of "Shape" Interface "Methods" ▬
public class Triangle implements Shape {

    // ▼ "Attributes" for "Triangle Dimensions" ▼
    double height;
    double base;


    // ▼ "Attributes" for "Triangle Sides" ▼
    double a;
    double b;
    double c;


    // ▬ "Constructor" ▬
    public Triangle(double height, double base, double a, double b, double c) {
        this.height = height;
        this.base = base;
        this.a = a;
        this.b = b;
        this.c = c;
    }


    // ▬ "Calculate Area()" Method "Implementation"
    //      → of the "Shape" Interface ▬
    @Override
    public double calculateArea() {
        return height * base / 2;
    }


    // ▬ "Calculate Perimeter()" Method "Implementation"
    //      → of the "Shape" Interface ▬
    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
