/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                   • "OOP" •
                  ► "CLASS" ◄
                 ► "PACKAGE" ◄



    ▬ "Package"
        → is "Used":
        → to "Group Related Classes",
        → to Avoid "Name Conflicts" and
        → to "Write" a "Better Maintainable Code".
        • It's like a "Folder"
            → in a "File Directory".



    ▬ "Packages" are "Divided" into "Two Categories":

        (I)  "Built-In" (from "Java API")
        (II) "User-Defined" ("Created" by "Users")




 (I) "Built-In" Package


    ▬ "Java API" Library
            •► https://docs.oracle.com/javase/8/docs/api/

        → is a "Library"
        → of "Pre-Written Classes"
        → (that are Free to Use),
        → "Included" in the "Java Development Environment".


        • The "Library" Contains
            → "Components" for Managing:
            → "Input",
            → "Database Programming" and Others.


        • The "Library" is Divided
            → into "Packages" and
            → "Classes",
            → that can either "Import" a "Single Class"
              (with its "Methods" and "Attributes"),
            → or a "Whole Package"
              (with "All" the "Classes" that "Belong" to the "Specified Package").

        • To "Use" a "Class" or a "Package"
            → from the "Library",
            → we Need to Use the "import" Keyword:

        ──────────────────────────────────────────
            import package.name.Class;   // ► Import a "Single Class"
            import package.name.*;       // ► Import the "Whole Package"
        ──────────────────────────────────────────



  (II) "User-Defined"

    ▬ "Java"
        → uses a "File System Directory"
        → to "Store"
        → the "User-Defined" Packages,
        → like Folders on "Personal Computer":

        ──────────────────────────────────────────
            ── root
              └── mypack
                └── MyPackageClass.java
        ──────────────────────────────────────────


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

// ▼ "User-Defined" Package ▼
package oop;


// ▼ "Built-In Java API" Package ▼
import java.util.Scanner;  // ► Import a "Scanner Class"
//import java.util.*;          // ► Import the "Whole Utile Package"



public class Packages {

    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "MESSAGE" IN THE "CONSOLE" ▼
        System.out.println("Please enter a text: ");


        // ▼ "CREATING" AN "SCANNER" OBJECT
        //      → FROM "SCANNER" CLASS
        //      → FOR "STORING THE "ENTERED NUMBERS" ▼
        Scanner scanner = new Scanner(System.in);

        // ▬▬▬ (STEP 2) ▬▬▬
        // ▼ "STORING" THE "STRING" VARIABLE ▼
        String textEntered = scanner.nextLine();


        // ▼ CONSOLE DISPLAY ▼
        System.out.println("Your text is: " + textEntered);
    }
}
