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


public class Main {

    // ▬ "MAIN()"  METHOD → IS THE "FIRST METHOD RUN"
    //      → WITH A "RETURNING DATA TYPE"
    //      → OF "VOID" ("EMPTY") ▬
    public static void main(String[] args) {

        // ▼ "Creating" an "Object" of "Point" Class
        //      → with "Constructor" ▼
        Point point1 = new Point(10, 10);

        // ▼ "Creating" an "Object" of "Circle" Class
        //      → with "Constructor" ▼
        Circle circle1 = new Circle(point1, 10);


        // ▼ Calling the ".calculateArea()" Method ▼
        System.out.println(circle1.calculateArea());



        // ▬○▬ IT IS "NOT" THE "PROFESSIONAL WAY"
        //          → TO "WRITE CODE",
        //          → THE "CODE MUST" BE "SEPARATED"
        //          → INTO "CLASSES"
        //          → WITH "SPECIFIC FUNCTIONALITIES" ▬○▬
        // ▼ "Creating" an "Object" of "Circle" Class
        //      → with "Constructor 2"
        //      → in the "Circle" Class ▼
//        Circle circle2 = new Circle(10, 10, 10);

        // ▼ Calling the ".calculateArea()" Method
        //      → with "Constructor 2" ▼
//        System.out.println(circle2.calculateArea());

    }
}
