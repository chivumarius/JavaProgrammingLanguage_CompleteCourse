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

public class Engine {

    // ▼ "States" ▼
    int productionYear;
    String manufactureCompany;


    // ▬ "Constructor" ▬
    public Engine(int productionYear, String manufactureCompany){
        this.productionYear = productionYear;
        this.manufactureCompany = manufactureCompany;
    }



    // ▬ ▬
    public int setMaxRotationSpeed(){
        return 1800;
    }
}

