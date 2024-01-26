package basics;

public class DataTypes_NonPrimitive_String {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {


        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (1) "STRING"
        //      → IS A "CLASS"
        //      → FROM "WHICH" WE CAN "CREATE OBJECTS":
        String s1 = "Hello";    // ► "STRING" IS "LITERAL"
        String s2 = "Hello";

        System.out.println(s1 + s2);

        System.out.println("\n______________________________\n");




        // ▬ "STRING" METHODS ▬

        // ▬ (1) "CONTAINS()" METHOD
        //          → IT "CHECKS" IF THE "STRING CONTAINS CERTAIN CHARACTERS" ▬
        System.out.println(s1.contains("a"));
        System.out.println(s1.contains("o"));

        System.out.println("\n______________________________\n");




        // ▬ (2) "INDEX OF()" METHOD
        //          → IT "RETURNS" THE "CHARACTER'S POSITION" IN THE "STRING"
        //          → "STARTING" FROM "0" FOR THE "FIRST POSITION" ▬
        System.out.println(s1.indexOf("o"));    // ► 4  (IS THE "POSITION 5")

        System.out.println("\n______________________________\n");





        // ▬ (3) "REPLACE()" METHOD
        //          → IT "REPLACES" A "CHARACTER" OF A "STRING"
        //          → WITH "ANOTHER CHARACTER" ▬
        System.out.println(s1.replace("H", "h"));    // ► 4  (IS THE "POSITION 5")
        System.out.println(s1.replace("ello", "i"));    // ► 4  (IS THE "POSITION 5")
        System.out.println(s1.replace("l", "L"));    // ► 4  (IS THE "POSITION 5")

        System.out.println("\n______________________________\n");






        // ▬ (4) "CHARA AT()" METHOD
        //          → IT "RETURNS" THE "CHARACTER" ON A CERTAIN "POSITION"/"INDEX"
        //          → IN A "STRING" ▬
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(4));

        System.out.println("\n______________________________\n");





        // ▬ (5) "TO UPPER CASE()" METHOD
        // ▬ (6) "TO LOWER CASE()" METHOD
        //          → THEY "RETURN" THE "STRING"
        //          → WITH "CAPITAL LETTERS" OR "SMALL LETTERS" ▬
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println("\n______________________________\n");





        // ▬ (7) "LENGTH()" METHOD
        //          → IT "RETURNS" THE "NUMBER" OF "CHARACTERS"
        //          → OF A "STRING"
        //          → OR THE "LENGTH" OF THE "STRING" ▬
        System.out.println(s1.length());    // ► 5

        System.out.println("\n______________________________\n");





        // ▼ (EX) "PRINTS" THE "INDIVIDUAL CHARACTERS"
        //          → OF A "STRING" ▼
        String myName = "Marius";

        for (int i = 0; i < myName.length(); i++){

            // ▼ "CONSOLE MESSAGE" ▼
            System.out.println(
                    // ▼ "GETTING" THE "INDIVIDUAL CHARACTER"
                    //      → ON E"ACH POSITION" OF THE "STRING" ▼
                    myName.charAt(i)
            );
        }

        System.out.println("\n______________________________\n");






        // ▬ (8) "SUB STRING()" METHOD
        //          → IT "RETURNS" ALL "EXISTING CHARACTERS"
        //          → IN A "GIVEN RANGE", 
        //          → BUT THE "LAST CHARACTER" 
        //          → WILL "NOT BE INCLUDED" IN THE "SUB SIRING" ▬
        String s3 = "Hello, I am Marius";

        System.out.println(s3.substring(0, 5));
        System.out.println(s3.substring(7, 18));

        System.out.println("\n______________________________\n");

    }
}
