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


import oop.inheritance_and_composition.Car;
import oop.inheritance_and_composition.Engine;

// ▬ "CLASS" FOR  "RUNNING" THE "PROGRAM" ▬
public class Main {

    // ▬ "MAIN()"  METHOD → IS THE "FIRST METHOD RUN"
    //      → WITH A "RETURNING DATA TYPE"
    //      → OF "VOID" ("EMPTY") ▬
    public static void main(String[] args) {

        // ▼ "Creating" an "Object"
        //      → using "Composition" ("is-a" Relationship)
        //      → and "Polymorphism" ("has-a" Relationship)
        //      → with "Constructor" ▼
        Shape shape1 = new Circle(10, 10, 5);
        Shape shape2 = new Rectangle(20, 10);
        Shape shape3 = new Triangle(20, 10, 5, 10, 5);


        // ▼ Displaying "Circle" ▼
        System.out.println("\nThe Area of Circle: "+ shape1.calculateArea());
        System.out.println("The Perimeter of Circle: "+ shape1.calculatePerimeter());

        // ▼ Displaying "Rectangle" ▼
        System.out.println("\nThe Area of Rectangle: "+ shape2.calculateArea());
        System.out.println("The Perimeter of Rectangle: "+ shape2.calculatePerimeter());

        // ▼ Displaying "Triangle" ▼
        System.out.println("\nThe Area of Triangle: "+ shape3.calculateArea());
        System.out.println("The Perimeter of Triangle: "+ shape3.calculatePerimeter());
    }
}
