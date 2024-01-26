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



// ▬ "CLASS" FOR  "RUNNING" THE "PROGRAM" ▬
public class Main {


        // ▬ "MAIN()"  METHOD → IS THE "FIRST METHOD RUN"
        //      → WITH A "RETURNING DATA TYPE"
        //      → OF "VOID" ("EMPTY") ▬
        public static void main(String[] args) {

                // ▼ Creating a New Upcasting Object
                //      → in which a "Child Object"
                //      → is "Typecast"
                //      → to a "Parent Class Object" ▼
                Employee employee1 = new Lawyer();
                Employee employee2 = new Secretary();
                Employee employee3 = new Marketer();
                Employee employee4 = new LegalSecretary();


                // ▬ "OBJECTS BEHAVIOUR" ▬
                // ▼ The "employee1" Behaviour
                //      → is as "Lawyer" ▼
                System.out.println("Lawyer Salary: " + employee1.getSalary());


                // ▼ The "employee3" Behaviour
                //      → is as "Marketer" ▼
                System.out.println("Marketer Salary: " + employee3.getSalary());


                // ▼ The "Compiler"
                //      → does not "Allow" in "Polymorphism"
                //      → to "Call" a "Specific Method"
                //      → from a "Child Class",
                //      → because "employee3"
                //      → can ne Anything
                //      → "Lawyer", "Secretary", "Marketer"▼
//                employee3.insideMarket();


                // ▼ To "Access"
                //      → a "Specific Method" in "Polymorphism"
                //      → from a "Child Class",
                //      → we Mast "Cast" th "Object"
                //      → as a "Child Class" ▼
                System.out.println("Marketer, Inside Market: " + ((Marketer) employee3).insideMarket());  // ► "True"

        }
}
