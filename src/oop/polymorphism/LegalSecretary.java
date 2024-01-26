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
//          → OF "SECRETARY" CLASS
//          → "INHERITED" BY "EXTENDS" KEYWORD ▬▬▬
public class LegalSecretary extends Secretary {

    // ▬ Method "Only" for "LegalSecretary" Class ▬
    public void sayLegalOath() {
        System.out.println("My Legal Oath");
    }
}
