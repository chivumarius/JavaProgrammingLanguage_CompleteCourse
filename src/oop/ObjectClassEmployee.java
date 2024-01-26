/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                   • "OOP" •
               ► "OBJECT CLASS" ◄



    ▬ The "Object" Class
        → is the "Parent" Class
        → of "All" the "Classes" in "Java",
        → by default.

        ♦ In "other words",
            → It is the "Topmost Class"
            → of "Java".




    ▬ The "Object" Class
        → is "Useful"
        → if we "Want" to "Refer"
        → Any "Object" whose "Type"
        → we "Don't Know".



    ▬ "Notice That":

        ♦ "Parent" Class "Reference Variable"
            → can "Refer"
            → the "Child Class Object",
            → "Know" as "Upcasting".


    ▬ tHE "==" Comparison
        → Compare the "Reference" of the "Object"
        → "Know" as "Down Casting"
        → not the "Value".
 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package oop;



// ▬▬▬ "PARENT" CLASS  ("SUPE-CLASS") ▬▬▬
public class ObjectClassEmployee {

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

//class Lawyer2 extends Object {  //  ▬  CAN ALSO "EXTEND" "OBJECT" CLASS ▬
class Lawyer2 extends ObjectClassEmployee {

    // ▼ "Instance Variable" ▼
    String nameLawyer;


    // ▬ "DIFFERENT TYPES" OF "OBJECT SHAPES"
    //      → CAN BE MADE IT
    //      → HAVING "2 CONSTRUCTORS" ▬

    // ▬ "Empty Constructor" ▬
    public Lawyer2() {
    }

    // ▬ "Full States Constructor" ▬
    public Lawyer2(String nameLawyer) {
        this.nameLawyer = nameLawyer;
    }



    // ▬ Method "Only" for "Lawyer" Class ▬
    public char getLawyerPosition() {
        return 'M';  // ► "Master"
    }
}






// ▬ "CLASS" FOR  "RUNNING" THE "PROGRAM" ▬
class Main2 {

    // ▬ "MAIN()"  METHOD → IS THE "FIRST METHOD RUN"
    //      → WITH A "RETURNING DATA TYPE"
    //      → OF "VOID" ("EMPTY") ▬
    public static void main(String[] args) {

        // ▼ "Objects" Creation ▼
        Lawyer2 lawyer2 = new Lawyer2();

        // ▼ Separated "Objects" with the "Same Content" ▼
        Lawyer2 lawyer3 = new Lawyer2("Jeanine");
        Lawyer2 lawyer4 = new Lawyer2("Jeanine");
        Lawyer2 lawyer5 = lawyer4;



        // ▼ "MARKETER DISPLAY" ▼

        // ▬ WE AR "DEALING"
        //      → WITH THE "OBJECT REFERENCE"
        //      → NOT WITH THE "OBJECT CONTENT" ▬

        // ▼ "Comparing" the "Reference" of the "Object" ▼
        System.out.println("Object Reference Comparison: ");  // ◄ "TRUE"
        System.out.println(lawyer4 == lawyer5);  // ◄ "TRUE"
        System.out.println(lawyer3 == lawyer4);  // ◄ "FALSE"


        // ▼ "Comparing"  of the "Object States" ▼
        System.out.println("\nComparing of the Object States: ");  // ◄ "TRUE"
        System.out.println(lawyer4.equals(lawyer5));    // ◄ "TRUE"
        System.out.println(lawyer3.equals(lawyer4));    // ◄ "FALSE"
    }
}