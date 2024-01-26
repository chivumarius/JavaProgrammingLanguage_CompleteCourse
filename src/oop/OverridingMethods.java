/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                   • "OOP" •
              ► "SUPER" KEYWORD ◄
            ► "METHODS OVERRIDING" ◄




    ▬ Method Overriding
        → is the Process of
        → "Declaring" a "Method"
        → in "Sub" Class
        → which is "Already Present" in "Parent" Class.



    ▬ "Overriding"
        → is "Done" so that a "Child" Class
        → can "Give" Its "Own Implementation"
        → to a "Method"
        → which is "Already Provided"
        → by the "Parent" Class.


        ♦ In this "CASE"
            → the "Method" in "Parent" Class
            → is Called "OVERRIDEN METHOD"
            → and the "Method" in "Child" Class
            → is Called "OVERRIDING METHOD".



    ▬ "Method Overriding"
        → is an "Example" of "Runtime Polymorphism".


        ♦ When a "Parent" Class
            → Reference "Points"
            → to the "Child" Class "Object"
            → then the "Call"
            → to the "Overridden Method"
            → is "Determined" at "Runtime",
            → because During "Method Call"
            → which Method ("Parent" Class or "Child" Class)
            → is to be "Executed"
            → is "Determined"
            → by the "Type" of "Object".


        ♦ This "Process"
            → in which "Call"
            → to the "Overridden Method"
            → is "Resolved" at "Runtime"
            → is Known as "Dynamic Method Dispatch".




 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package oop;


public class OverridingMethods {
}



// ▬▬▬ "PARENT" CLASS  ("SUPE-CLASS") ▬▬▬
 class Employee {

    public int getHours() {
        return 48;
    }


    public double getSalary() {
        return 5000;
    }


    public int getVacationDays() {
        return 10;
    }
}






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






// ▬ "CLASS" FOR  "RUNNING" THE "PROGRAM" ▬
class Main {

    // ▬ "MAIN()"  METHOD → IS THE "FIRST METHOD RUN"
    //      → WITH A "RETURNING DATA TYPE"
    //      → OF "VOID" ("EMPTY") ▬
    public static void main(String[] args) {

        // ▼ "Objects" Creation ▼
        Employee employee1 = new Employee();
        Marketer marketer1 = new Marketer();


        /// ▼ Displaying Data ▼
        System.out.println("Employee Vacation Days: " + employee1.getVacationDays());
        System.out.println("Inside Market: " + marketer1.insideMarket());
        System.out.println("Marketer Working Hours: " + marketer1.getHours());
        System.out.println("Marketer Vacation Days : " + marketer1.getVacationDays());
        System.out.println("Marketer Salary: " + marketer1.getSalary());
    }
}