/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                   • "BASICS" •
                 ► "VARIABLES" ◄



    ▬ Variables
        → are "Containers"
        → for "Storing Data Values".

    ▬ "Types" of "Variables":

        • "String"    →  Stores "Text",
                        → such as "Hello".

                        ○ "String Values"
                            → are "Surrounded"
                            → by "Double Quotes".

        • "int"       → Stores "Integers" ("Whole Numbers"),
                        → "Without Decimals",
                        → such as 123 or -123

        • "float"     → Stores "Floating" point numbers, with decimals, such as 19.99 or -19.99

        • "char"      → Stores "Single Characters",
                        → such as 'a' or 'B'.

                        ○ "Char Values"
                            → are "Surrounded"
                            → by 'Single Quotes'.

        • "boolean"   → Stores "Values" with "Two States"
                        → such as: "true" or "false".



    ▬ "Declaration"
        → is the "Process" of "Defining" the "Variable",
        → along with its "Type" and "Name".

        ○ Example:
            "Declaring" the "id" Variable:
            --------------------------------
               int id;
            --------------------------------



    ▬ "Initialization"
        → is all about "Assigning" a "Value":

        ○ Example:
            "Initializing" the "id" Variable:
            --------------------------------
               id = 1;
            --------------------------------



 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics;

public class Variables {

    // ▬ FIRS RUN METHOD ▬
    public static void main(String[] args) {

        // ▬ "DECLARATION" OF "VARIABLES"
        //      •► Syntax: DataType varName ▬
        int x;
        double y;


        // ▼ "EXPRESSIONS" ▼
        x = 4 + 6;      // ► Displaying an "Integer": 10
        y = 4.4 + 6.8;  // ► Displaying a "Double": 11.2


        // ▼ "REASSIGN" THE  "VALUES" ▼
        y = 4 + 6;      // ► Displaying an "Double": 10.0
//      x = 4.4 + 6.8;  //  ► Displaying a "Error": Incompatible types. Found: 'double', required: 'int'
        x = (int)(4.4 + 6.8);  //  ► Displaying an "Integer": 11

        System.out.println("Y is " + y);
        System.out.println("X is " + x);
    }
}
