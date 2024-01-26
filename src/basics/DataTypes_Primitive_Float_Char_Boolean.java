package basics;

public class DataTypes_Primitive_Float_Char_Boolean {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // II.  "FLOATING POINT"  DATA TYPE
        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀


        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (1) "FLOAT" ("2147483647")
        //          → "4 BYTE" SIZE
        //          → STORES "FRACTIONAL NUMBERS"
        //          → WITH "7 DECIMAL DIGITS"
        //          → FROM  "-2147483648" TO  "2147483647"
        //          → WE "NEED" TO  "ADD" THE LETTER "F"  AT  THE  "EBD" OF THE "NUMBER".

        // ▼ "Float" Variable ▼
        float f = 2147483647.00f;

        // ▼ Console Display ▼
        System.out.println("Float f = " + f );







        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (2) "DOUBLE"  ("9223372036854775807")
        //          → "8 BYTE" SIZE
        //          → STORES "FRACTIONAL NUMBERS"
        //          → WITH "15 DECIMAL DIGITS"
        //          → FROM "-9223372036854775808" TO "9223372036854775807"
        //          → WE "NEED" TO  "ADD" THE LETTER "D"  AT  THE  "EBD" OF THE "NUMBER".

        // ▼ "DOUBLE" Variable ▼
        double d = 9223372036854775807.00d;

        // ▼ Console Display ▼
        System.out.println("Double d = " + d );

        System.out.println("_______________________________________");






        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // III.  "CHAR"  DATA TYPE
        //          → "2 BYTE" SIZE
        //          → STORES A "SINGLE CHARACTER / LETTER"
        //          → OR "ASCII" VALUE".
        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        // ▼ "CHAR" Variable ▼
        char c = 'A';

        // ▼ Console Display ▼
        System.out.println("Char c = " + c );

        System.out.println("_______________________________________");







        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // Iv.  "BOOLEAN"  DATA TYPE
        //          → "1 BIT" SIZE
        //          → STORES "TRUE" OR "FALSE" VALUES.
        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        // ▼ "BOOLEAN" Variable ▼
        boolean isOpen = true;


        // ▼ Console Display ▼
        System.out.println("Boolean \'isOpen\' = " + isOpen );

        System.out.println("_______________________________________");

    }
}
