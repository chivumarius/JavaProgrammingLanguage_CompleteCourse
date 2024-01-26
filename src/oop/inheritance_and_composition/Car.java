/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                    • "OOP" •
         ► "INHERITANCE" & "COMPOSITION" ◄




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
package oop.inheritance_and_composition;



// ▬○▬ "IMPLEMENTATION" OF "RELATIONSHIPS" BETWEEN "CLASSES" ▬○▬
// ▬ (1) Car "has-a"  Engine ("Composition") ▬
// ▬ (2) Car "is-a"  Vehicle ("Inheritance") ▬


// ▬ (2) Car "is-a"  Vehicle ("Inheritance") ▬
public class Car extends Vehicle {

    // ▬ (1) Car "has-a"  Engine ("Composition") ▬
    // ▼  "Creating" an "Object"
    //      → from "Engine" Class
    //      → inside "Car" Class ▼
    Engine engine;



    // ▬ (3) "LINKING"
    //          → between "Engine" and "Car" Classes
    //          → in "CONSTRUCTOR",
    //          → which "Take" the "Parameters"
    //          → of the "Vehicle" SupperClass
    //          → and the "Engine" SubClass ▬
    public Car( int modelYear, String companyName, Engine engine ){
        // ▼ "CALLING" the "SUPER-CLASS CONSTRUCTOR" ▼
        super(modelYear, companyName);

        // ▼ "CALLING" the "SUB-CLASS CONSTRUCTOR" ▼
        this.engine = engine;
    }



    // ▬ "startCar()" Method ▬
    public void startCar(){
        System.out.println("The Car Started");
    }



    // ▬ Overriding "calculatePrice()" Method ▬
    @Override
    public int calculatePrice(){
        return super.calculatePrice() + 5000;
    }
}
