package basics;

public class DataTypes_Primitive_Integer_Byte_Short_Int_Long {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // I. "INTEGERS DATA TYPE"
        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀


        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (1) "BYTE" ("-128" - "127")
        //          → "1 BYTE" SIZE
        //          → STORES "WHOLE NUMBERS"
        //          → FROM "-128" TO "127"

        // ▼ "BYTE" Variable ▼
        byte b = 127;

        // ▼ Console Display ▼
        System.out.println("Byte b = " + b );

        System.out.println("_______________________________________");






        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (2) "SHORT"  ("-32768" TO "32767")
        //          → "2 BYTE" SIZE
        //          → STORES "WHOLE NUMBERS"
        //          → FROM "-32768" TO "32767"


        // ▼ "SHORT" Variables ▼
        short s = 32767;

        // ▼ Console Display ▼
        System.out.println("Short s = " + s );

        System.out.println("_______________________________________");







        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (3) "INT"  ("-2147483648" TO  "2147483647")
        //          → "4 BYTE" SIZE
        //          → STORES "WHOLE NUMBERS"
        //          → FROM  "-2147483648" TO  "2147483647"

        // ▼ "INT" Variable ▼
        int i = 2147483647;

        // ▼ Console Display ▼
        System.out.println("Int i = " + i );


        System.out.println("_______________________________________");







        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (4) "LONG" ("-9223372036854775808" TO "9223372036854775807")
        //          → "8 BYTE" SIZE
        //          → STORES "WHOLE NUMBERS"
        //          → FROM "-9223372036854775808" TO "9223372036854775807"
        //          → WE "NEED" TO  "ADD" THE LETTER "L"  AT  THE  "EBD" OF THE "NUMBER".

        // ▼ "LONG" Variables ▼
        long l = 9223372036854775807L;

        // ▼ Console Display ▼
        System.out.println("Long l = " + l );

        System.out.println("_______________________________________");

    }
}
