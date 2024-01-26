/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                   • "OOP" •
           ► "STATIC & NON-STATIC VARIABLES" ◄



    ▬ Type of Variables in Java:

        (1) "Local" ("Non-Static") Variables
        (2) "Instance" ("Non-Static") Variables
        (3) "Static" Variables


    (1) "Local" ("Non-Static") Variables
           → are "Declared" in a "Method"
           → and Cannot Be "Accessed Outside" of "It".


    (2) "Instance" ("Non-Static") Variables
           → are "Declared" in the "Class".
           → are "Specific" to the "Object",
           → are "Defined Without"
           → the "STATIC" Keyword
           → and "Outside" a "Method Declaration".





    (3) "Static" Variables
           → are "Initialized Only Once",
           → at the "Beginning" of "Program Execution".

           • Should Be "Initialized First",
                → Before Any "Instance Variables"
                → are "Initialized".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package oop;



public class StaticAndNonStaticVariables {
    // ► See "StudentPrivate.java" ◄◄

    // ▼ "INSTANCE" VARIABLE
    //      → "Declared" in the "Class" ▼
    int registrationNumber = 150;



    // ▬ First Run Method ▬
    public static void main(String[] args) {


        // ▼ "Creating" an "Object"
        //      → with an "Empty Constructor" (by "Default") ▼
        StudentPrivate studentPrivate1 = new StudentPrivate();
        StudentPrivate studentPrivate2 = new StudentPrivate();
        StudentPrivate studentPrivate3 = new StudentPrivate();




        // ▼ "Accessing" & "Getting" (by "Calling")
        //      → the "Object Private Static State" ("Attributes")
        //      → through "Getter"  ▼
//        studentPrivate1.getId();



        // ▼ "Console Display" ▼
        System.out.println(studentPrivate1.getId());



        // ▼ Cannot Access a "Local" Variable
        //      → Outside of Its Method ▼
//        localVariable = 10;
    }


   public static void localVariablesMethod(){
       // ▼ Creating "Local" Variable ▼
       int localVariable;
   }
}
