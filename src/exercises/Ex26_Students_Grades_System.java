/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 26 •
       ► "STUDENTS GRADES SYSTEM" ◄




    • "Given"
        → a "2D Array" T[20][3]
        → that "Contains"
        → "Objects" of "String" Type
        → representing "Information"
        → about "20 Students" in a "Class".
    __________________________________________________
        1	    Jad 		18.5
        2	    Samir 		16.25
        3	    Riyad		12
        ...	    ...		    ...
        ...	    ...		    ...
    __________________________________________________




    • Each "Row" Concerns One Student, where
        - "First Cell"
            → "Contains" the "Student Number",

        - "Second Cell"
            → "Contains" the "Student First Name",

        - "Third Cell"
            → "Contains" the "Student Grade".



    • For "Example":
        1- The "First Student"
            → has a "Number" = "1",
            → his "First Name" is "JAD",
            → and a "Grade" = "18.5".



    1. Write a "enter()" Method
        → that allows "Filling" the "2D Array"
        → of "String" from "keyboard".

        • This "Method"
            → must "Return" the "Filled Array".



    2. Write a "ExtractNumber()" Method
        → that "Takes" in "Parameter"
        → a "2D Array" of "String":
            •> T(like the one shown here above),


        • "Extracts"
            → the "Student's Numbers",
            → and "Stores"
            → Them in an "ArrayList" of "integers"
            → "Numbers" that will be "Returned"
            → by the "Method".




    3. Write a "ExtractNames()" Method
        → that Takes in "Parameter"
         → a "2D Array" of "String"
            •> T(like the one shown here above),
         → "Extracts" the "Student's First Names"
         → and "Stores Them" in an "Array List"
         → of "FirstNames" Integers
         → that will be "Returned"
         → by the "Method".





    4. Write a "ExtractGrades()" Method
        → that "Takes" in "Parameter"
        → a "2D Array" of "String"
            •> T(like the one shown here above),
        → "Extracts" the "Student's Grades"
        → and "Stores Them"
        → in an "ArrayList" of I"ntegers Grades"
        → that will be "Returned"
        → by the "Method".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;


public class Ex26_Students_Grades_System {

    // ▬ (Q1) The "Enter()" Method ▬
    public static String[][] Enter(){

        // ▼ Crate a "Scanner" Object
        //      → for "Enter Data" ▼
        Scanner scanner = new Scanner(System.in);

        // ▼ Creating the "2D String Array"
        //      → with "20 Rows" and "3 Columns" ▼
        String[][] s = new String[20][3];


        // ▼ Looping through the "Array Rows"
        //      → and "Array Columns" ▼
        for (int i = 0; i < s.length ; i++){

            // ▼ Adding "Row Number" to the "First Column" ▼
            s[i][0] =  i + "";

            // ▼ Displaying the "User Input"▼
            System.out.print("Enter name of student nb. " +i+1);

            // ▼ "Storing" the "User Input"
            //      →  on the "Second Column" ▼
            s[i][1] = scanner.next();

            // ▼ Displaying the "User Input"▼
            System.out.print("Enter the grade of nb. "+ i+1);

            // ▼ "Storing" the "User Input"
            //      → on the "Third Column" ▼
            s[i][2] = scanner.next();
        }

        // ▼ "Returning" the "String Array"
        return s;
    }






    // ▬ (Q2) The "ExtractNumbers()" Method ▬
    public static ArrayList<Integer> ExtractNumbers(String[][] s){

        // ▼ "Creating" an "ArrayList" of "Integers" ▼
        ArrayList<Integer> numbers = new ArrayList<>();

        // ▼ "Looping" through the "Array"
        //      → to "Extract"/"Get" the "Numbers"/ "Integers" ▼
        for (int i=0; i<s.length; i++){
            // ▼ "Adding" the "Integer" to the "ArrayList" ▼
            numbers.add(Integer.parseInt(s[i][0]));
        }

        // ▼ "Returning" the "ArrayList"
        return numbers;
    }





    // ▬ (Q3) The "ExtractNames()" Method ▬
    public static ArrayList<String> ExtractNames(String[][] s){

        // ▼ "Creating" an "ArrayList" of "Strings" ▼
        ArrayList<String> names = new ArrayList<>();

        // ▼ "Looping" through the "Array"
        //      → to "Extract"/"Get" the "Names"/ "Strings" ▼
        for (int i=0; i<s.length; i++){
            // ▼ "Adding" the "String" to the "ArrayList" ▼
            names.add(s[i][1]);
        }

        // ▼ "Returning" the "ArrayList"
        return names;
    }





    // ▬ (Q4) The "ExtractGrades()" Method ▬
    public static ArrayList<Double> ExtractGrades(String[][] s){

        // ▼ "Creating" an "ArrayList" of "Doubles" ▼
        ArrayList<Double> grades = new ArrayList<>();

        // ▼ "Looping" through the "Array"
        //      → to "Extract"/"Get" the "Grades"/ "Doubles" ▼
        for (int i=0; i<s.length; i++){
            // ▼ "Adding" the "Double" to the "ArrayList" ▼
            grades.add(Double.parseDouble(s[i][2]));
        }

        // ▼ "Returning" the "ArrayList" ▼
        return grades;
    }

}
