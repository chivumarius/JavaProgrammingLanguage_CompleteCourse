/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 4 •
        ► "STRING" TO "INT" ◄
                 &
    ► "INT" TO "STRING" CONVERSION ◄



  Requirements:

        • Write a "Java Program"
            → that "Convert"
            → a "String" to "Integer"
            → and vice versa (an "Integer" to "String").


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package basics.exercises;


public class Ex4_StringToIntAndIntToStringConversion {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "STRING VARIABLES" ▼
        String s1 = "12";
        String s2 = "8";


        // ▼ DISPLAYING "CONCATENATED STRINGS" ▼
        System.out.println(s1 + s2);    // ► 128




        // (1) CONVERTING "STRINGS" INTO "INTEGERS"
        //      → BY USING "PARSE INT()" METHOD
        //      → OF "INTEGER" CLASS:
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        // ▼ DISPLAYING "INTEGER" ▼
        System.out.println(i1 + i2);    // ► 20






        // (2) CONVERTING "INTEGERS" INTO "STRINGS"
        //      → BY USING "VALUE OF()" METHOD
        //      → OF "STRING" CLASS:
        String str1= String.valueOf(i1);
        String str2 = String.valueOf(i2);

        // ▼ DISPLAYING "INTEGER" ▼
        System.out.println(str1 + str2);    // ► 20

    }
}
