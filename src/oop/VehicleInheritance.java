/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                   • "OOP" •
             ► "CLASS INHERITANCE" ◄




    ▬ "Inheritance"
        → allows us to "Share Code"
        → between "Classes"
        → and "Reuse It"
        → without "Writing" it from "Scratch",
        → thus Avoiding "Redundancy".


    ▬ In "Java"
        → it is "Possible"
        → to "Inherit Attributes" and "Methods"
        → from "One Class" to "Another".


    ▬ The "Inheritance" Concept
        → is "Grouped"
        → into "Two Categories":

        (1) "SubClass" ("Child")
               → is the "Class"
               → that "Inherits"
               → from "Another Class"


        (2) "SuperClass" ("Parent")
               → is the "Class"
               → being "Inherited"
               → from "Another Class"


    ▬ "extends" Keyword
        → is "Used" to "Inherit"
        → from a "Class".



    ▬ Also "Interfaces"
        → are "Used" to "Inherit"
        → from a "Class".




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
package oop;


// ▬ "SuperClass" ("Parent") ▬
class VehicleInheritance {

    // ▼ "State"/ "Attribute"
    protected String brand = "Ford";


    // ▬ "honk()" Method ▬
    public void honk() {
        System.out.println("Tuut, tuut!");
    }

}





// ▬ "SubClass" ("Child") of "Vehicle Inheritance" Class ▬
class Car extends VehicleInheritance {

    // ▼ "Instance Variable" ▼
    protected String model = "Mustang";


    // ▬ "MAIN()"  METHOD → IS THE "FIRST METHOD RUN"
    //      → WITH A "RETURNING DATA TYPE"
    //      → OF "VOID" ("EMPTY") ▬
    public static void main(String[] args) {

        //  ▼ "Creating" an "Object" ▼
        Car car1 = new Car();


        // ▼ "Calling" the ".honk()" Method
        //      → from the "Vehicle" Class
        //      → on the "car1" Object ▼
        car1.honk();


        // ▼ "Display"
        //      1- The "Value" of the "Brand"
        //          → from the "Vehicle" Class
        //      2- The "Value" of the "Model"
        //          → from the "Car" Class ▼
        System.out.println("Brand: " + car1.brand + "\nModel: " + car1.model);
    }
}
