/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                      • "OOP" •
                  ► "POLYMORPHISM" ◄



    ▬ "Polymorphism"
        → means "many forms",
        → and it Occurs
        → when we have "Many Classes"
        → that are "Related" to "Each Other"
        → by "Inheritance".


    ▬  "Inheritance"
        → lets us "Inherit Attributes" & "Methods"
        → from "Another Class".


    ▬ "Polymorphism"
        → "Uses" Those "Methods"
        → to "Perform" Different "Tasks". This allows us to perform a single action in different ways.



    ▬ "Polymorphism"
        → is "Made Possible"
        → by the "Fact"
        → that the "Type"
        → of the "Reference Variable"
        → does not "Exactly Match"
        → the "Type" of the "Object"
        → to which "It Refers".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package oop.polymorphism;



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
