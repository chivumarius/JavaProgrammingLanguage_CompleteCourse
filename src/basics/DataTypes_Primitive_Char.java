package basics;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class DataTypes_Primitive_Char {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {



        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // "CHARACTERS"  DATA TYPE

        // ▼ "CHAR" Variables ▼
        char c = 'm';


        // ▼ Console Display ▼
        System.out.println("Char = " + c );

        System.out.println("______________________________________");




        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ▬ (A) "ASCII"  CHARACTERS ▬
        char ascii65 = 65;
        char ascii66 = 66;
        char ascii67 = 67;


        // ▼ Console Display ▼
        System.out.println(ascii65 );
        System.out.println(ascii66 );
        System.out.println(ascii67 );

        System.out.println("______________________________________");








        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ▬ (B) "UNICODE"  CHARACTERS ▬
        char unicode = '\u03A9';


        // ▼ Console Display ▼
        System.out.println(unicode );

        System.out.println("______________________________________");





        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ▬ (C) "ESCAPE"  CHARACTERS ▬

        // (C1) "TAB"
        //          → TO "INSERT SPACE"
        //          → IN "FRONT" OF A "STRING":
        char tab = '\t';
        System.out.println("1 " + tab + "Tab");



        // (C-2) "BACKSPACE"
        //          → TO "REMOVE" THE "CHARACTER"
        //          → FROM "IN FRONT" OF A "STRING":
        char backspace  = '\b';
        System.out.println("2." + backspace + "Backspace");



        // (C-3) "NEW LINE"
        //          → TO "PLACE" A "STRING"
        //          → ON A "NEW LINE":
        char newLine = '\n';
        System.out.println("3. " + newLine + "New Line");



        // (C-4) "CARRIAGE RETURN"
        //          → IT "REMOVES ALL" THE "CHARACTERS"
        //          → IN "FRONT" OF "IT"
        //          → FROM A "LINE":
        char carriageReturn = '\r';
        System.out.println("4. " + "\n another string" + carriageReturn + "Carriage Return");



        // (C-5) "FORM FEED"
        //          → IT ADDS THE "UP ARROW":
        char formFeed = '\f';
        System.out.println("5. " + formFeed + "Form Feed");



        // (C-6) "SINGLE QUOTE"
        //          → IT "ADDS" THE "SINGLE QUOTE":
        char singleQuote = '\'';
        System.out.println("6. " + singleQuote + "Single Quote" + singleQuote);



        // (C-7) "DOUBLE QUOTE"
        //          → IT "ADDS" THE "DOUBLE QUOTE":
        char doubleQuote = '\"';
        System.out.println("7. " + doubleQuote + "Double Quote" + doubleQuote);



        // (C-8) "BACKSLASH"
        //          → IT "ADDS" A "BACKSLASH":
        char backslash = '\\';
        System.out.println("8. " + backslash + "BackSlash" + backslash);

        System.out.println("______________________________________");









        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ▬ "CHARACTERS"  METHODS ▬

        // ▼ CREATING AN "OBJECT" OF "CHARACTER()" CLASS
        Character k = 'M';


        // (1) "IS LETTER()" METHOD
        //      → RETURNS THE "BOOLEAN VALUE"
        //      → OF "TRUE" OR "FALSE":
        System.out.println("Is Letter: " + isLetter(k));





        // (2) "IS DIGIT()" METHOD
        //      → RETURNS THE "BOOLEAN VALUE"
        //      → OF "TRUE" OR "FALSE":
        System.out.println("Is Digit: " + isDigit(k));

        System.out.println("______________________________________");





        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (EX) "GET"  THE  "USER  ENTERED CHARACTER"
        //        → AND "PRINT" THE "ASCII VALUE"
        //        → OF THE "CHARACTER":

        // ▼ "CREATING" AN "SCANNER" OBJECT
        //      → FROM "SCANNER" CLASS
        //      → FOR "STORING THE "ENTERED NUMBERS" ▼
        Scanner scanner = new Scanner(System.in);


        // ▼ "MESSAGE" IN THE "CONSOLE" ▼
        System.out.println("Please enter a character : ");


        // ▼ "STORING" THE "CHARACTER" ▼
//        char ch = scanner.next().charAt(0);

        // ▼ "STORING" THE "ASCII  VALUE" OF THE "CHARACTER" ▼
        int ch = scanner.next().charAt(0);


        // ▼ DISPLAYING THE "ASCII  VALUE" OF THE "CHARACTER" ▼
        System.out.println("The ASCII Value : " + ch);



        System.out.println("______________________________________");

    }
}
