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




// ▬ "CLASS" FOR  "RUNNING" THE "PROGRAM" ▬
public class Main {

    // ▬ "MAIN()"  METHOD → IS THE "FIRST METHOD RUN"
    //      → WITH A "RETURNING DATA TYPE"
    //      → OF "VOID" ("EMPTY") ▬
    public static void main(String[] args) {

        // ▼ "Objects" Creation ▼
        Employee employee = new Employee();
        Lawyer lawyer = new Lawyer();
        Secretary secretary = new Secretary();
        LegalSecretary legalSecretary = new LegalSecretary();
        Marketer marketer = new Marketer();



        /// ▼ Displaying Data ▼
        System.out.println("Employee Vacation Days: " + employee.getVacationDays());
        System.out.println("Lawyer Position: " + lawyer.getLawyerPosition());
        System.out.println("Secretary Vacation Days: " + secretary.getVacationDays());
        System.out.println("Legal Secretary Vacation Days: " + legalSecretary.getVacationDays());

        // ▼ "MARKETER DISPLAY" ▼
        System.out.println("Marketer, Inside Market: " + marketer.insideMarket());
        System.out.println("Marketer Working Hours: " + marketer.getHours());
        System.out.println("Marketer Vacation Days : " + marketer.getVacationDays());
        System.out.println("Marketer Salary: " + marketer.getSalary());
    }
}
