/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                • "OOP" •
       ► "CLASS COMPOSITION" ◄




    ▬ The "Composition"
        →  is "Used" to "Implement"/"Design"
        → a "has-a" Relationship (ex. "Car"  has-a "Engine").


    ▬ The "Inheritance"
        → is "Used" to "Implement"/"Design"
        → a "is-a" Relationship (ex. "Car"  is-a "Vehicle").

        ________________________________________
                Vehicle
         is-a     ↓         ←  "INHERITANCE"
                "Car"
         has-a    ↓        ←  "COMPOSITION"
                Engine
        ________________________________________


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package oop.composition;



public class Circle {

    // ▼ The "Circle"
    //      → consists of a "Center" (Point)
    //      → and a "Radius"
    //      → It "has-a" Point,
    //      → we Create "Composition" ▼

    // ▼ "Composition" Relationship
    //      → by Creating an "center" Object
    //      → of the "Point" Class ▼
    Point center;


    // ▼ "Instance Variable" ▼
    double radius;


    // ▬○▬ IT IS "NOT" THE "PROFESSIONAL WAY"
    //          → TO "WRITE CODE",
    //          → THE "CODE MUST" BE "SEPARATED"
    //          → INTO "CLASSES"
    //          → WITH "SPECIFIC FUNCTIONALITIES" ▬○▬
    // ▼ Declaring the "Center Point" Here ▼
//    int x;
//    int y;


    // ▬ "Constructor" ▬
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }



    // ▬○▬ IT IS "NOT" THE "PROFESSIONAL WAY"
    //          → TO "WRITE CODE",
    //          → THE "CODE MUST" BE "SEPARATED"
    //          → INTO "CLASSES"
    //          → WITH "SPECIFIC FUNCTIONALITIES" ▬○▬
    // ▬ "Constructor 2" ▬
//    public Circle(int x, int y, double radius){
//        this.x = x;
//        this.y = y;
//        this.radius = radius;
//    }

    // ▬ "calculateArea()" Method ▬
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
