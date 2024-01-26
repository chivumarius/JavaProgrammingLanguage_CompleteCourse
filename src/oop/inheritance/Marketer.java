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
package oop.inheritance;



// ▬▬▬ "CHILD" CLASS  ("SUB-CLASS")
//          → OF "EMPLOYEE" CLASS
//          → "INHERITED" BY "EXTENDS" KEYWORD ▬▬▬
class Marketer extends Employee {

    // ▬ Method "Only" for "Marketer" Class ▬
    public boolean insideMarket() {
        return true;
    }


    // ▬ "OVERRIDING METHOD" FROM "EMPLOYEE"  CLASS ("PARENT" CLASS) ▬
    @Override   // ◄ "ANNOTATION"
    public int getHours() {

        // ▼ "Inherited" the "getHours()" Method
        //      → from the "Employee" Class
        //      → by Using "Super" Keyword
        //      → and "Subtract"/"Add" a "Value" ▼
        return super.getHours() - 28;
//      return 20;
    }

    @Override
    public int getVacationDays() {
//      return super.getVacationDays() + 14;
        return 24;
    }


    @Override
    public double getSalary() {
        return super.getSalary() + 2500;
//      return 7500;

    }
}
