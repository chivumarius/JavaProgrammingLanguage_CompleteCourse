/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                   • "OOP" •
              ► "SUPER" KEYWORD ◄



    ▬ "super" Keyword
        → refers to "Super-Class" Objects ("Parent") .


    ▬ "super" Keyword
        → is "Used"
        → to Call "SuperClass Methods" and
        → to "Access" the "SuperClass Constructor".

    ▬ The "Most Common Use"
        → of the "super" Keyword
        → is to "Eliminate"
        → the "Confusion"
        → between "SuperClasses"
        → and "SubClasses",
        → that have "Methods"
        → with the "Same Name".


    ▬ A "Constructor" of a "Child-Class"
        → Always "Starts"
        → with an "Invocation"
        → of "One" of the "Constructors"
        → of the "Parent-Class".

    ▬ If the "Parent-Class"
        → has Several "Constructors"
        → then the "One" which is "Invoked"
        → is Determined by "Matching Arguments Lists".


    ▬ Example:

        ♦ We "Define" a "Second Constructor"
            → for "Movie"
            → that "Does Not Include"
            → an Argument for "length".


            ♦ It Starts Out by Invoking
                → the "Parent-Class Constructor",
                → that "Does Not Include"
                → an Argument for "length".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package oop;


public class SuperKeyword {
}




// ▬▬▬ "PARENT" CLASS  ("SUPE-CLASS") ▬▬▬
class Video {

    // ▼ "State"/ "Attribute" ▼
    String title;
    int length;
    boolean available;  // ► It is not in the Constructor


    // ▬ "Constructor" ▬
    public Video(String title, int length) {
        this.title = title;
        this.length = length;
    }
}




// ▬▬▬ "CHILD" CLASS  ("SUB-CLASS")
//          → OF "EMPLOYEE" CLASS
//          → "INHERITED" BY "EXTENDS" KEYWORD ▬▬▬
class Movie extends Video {

    // ▼ "State"/ "Attribute" ▼
    String director;
    String rating;


    // ▬ "Constructor"
    //      → with "Parent" & "Child" Classes "Parameters" ▬
    public Movie(String title, int length, String director, String rating) {

        // ▼ "Super" Keyword
        //      → with the "Attributes"
        //      → of "Parent Constructor" Class ▼
        super(title, length);

        this.director = director;
        this.rating = rating;
    }
}


