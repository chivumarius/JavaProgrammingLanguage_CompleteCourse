/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
               • EXERCISE 23 •
        ► "lLIST" & "STRING" HANDLING ◄





  ▬ An "Identifier"
        → ("Name" of:
                        • "Class",
                        • "Interface",
                        • "Method",
                        • "Exception",
                        • "Variable", ...
           )
        → is "Submitted"
        → to a "Set" of "Constraints".

    ▬ The "Identifier" must:
        - "Begin" with a "Letter",

        - "Contain" exclusively the "Characters":
            •► 0...9,
            •► A...Z,
            •► a...z,

        - Not Be a Java "Reserved Wor"

        - Not Be Already "Declared"
            → in the "Same Block".




    ▬ An "Inventory" of "Symbols" (identifiers)
        → used in a "Method"
        → "Gave" as a "Result"
        → an "ArrayList" of "String" Declared.


    ▬ The Java "Reserved Words"
        → are "Stored" in an "ArrayList"
        → "javaWords".


    ▬ The "Allowed Characters"
        → are "Stored"
        → in an "ArrayList"
        → "legalCharacters".


    ▬ Thus, the "Three Lists"
        → are "Available"
        → for "Every Method"
        → we will "Write".


    (Q1) "Question 1":
            • "Write" a "Method":
                    •> "beginsWithLetter(String s)"

                → that "Allows Verifying"
                → If a W"ord Begins"
                → with a "Letter".




    (Q2) "Question 2":
            • "Write" a "Method"
                    •> "containsLegalCharacters(String s)"
                → that "Allows Verifying"
                → if the "Identifier"
                → Contains Only the a"Alowed Characters".

	            • In "Order"  to "Verify",
	                → use the "List"
	                    •> "legalCharacters".




    (Q3) "Question 3":
            • "Write" a "Method"
                    •> "notReservedWord(String s)"
                → that "Allows Verifying"
	            → if the "Identifier"
	            → is not a "Java Reserved Word".


	        • In  "Order" to "Verify",
	            → use the "List"
	            → "javaWords".




    (Q4) "Question 4":
            • "Write" a "Method"
                    •> "occurrence(ArrayList<String> 1st, String s)"
		        → that returns the number of occurrences
		        → of the String s in the list of String 1st




    (Q5) "Question 5":

            • Write a "Method"
                    •> "existsOnce(String s)"
                → that "Allows Verifying"
                → if an "Identifier"
                → Exists Only "Once"
                → in the "List" of "Declared Words".

	        • In  "Order" to "Verify",
	            → use the "List Declared"
	            → and the "Method"
	                •> o"ccurrence()"
	            → previously Written.




    (Q6) "Question 6":
            • "Write" a "Method"
                    •> badIdentifiers0
                → that "Allows Verifying"
                → that the "Words Stored"
                → in the "List Declared Conform"
                → to the "Java Identifier Rules".

	        • This "Method"
	            → will "Return" a "List"
	            → of "Bad Identifiers"
	            → that Do "Not Conform"
	            → to the "Rules".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;


import java.lang.reflect.Array;
import java.util.ArrayList;



public class Ex23_List_and_String_Handling {

    // ▼ Creating "Three ArrayList" of "String" Type ▼
    static ArrayList<String> declared = new ArrayList<String>();
    static ArrayList<String> javaWords = new ArrayList<String>();
    static ArrayList<Character> legalCharacters = new ArrayList<Character>();



    // ▬ First Run Method ▬
    public static void main(String[] args) {
    }



    // ▬ (Q1) The "beginsWithLetter()" Method ▬
    public static boolean beginsWithLetter(String s){

        // ▼ Using the "isLetter()" Method
        //      → for the "First Character" ▼
        return Character.isLetter(s.charAt(0));
    }




    // ▬ (Q2) The "containsLegalCharacters()" Method ▬
    public static boolean containsLegalCharacters(String s) {

        // ▼ Looping through the "String" to "Verify" the "Characters" ▼
        for (int i = 0; i < s.length(); i++) {

            // ▼ Verifying if there is "No Legal Character"
            //      → by using the "contains()" Method ▼
            if (!legalCharacters.contains(s.charAt(i))) {
                return false;
            }

        }

        // ▼ "Returning" "True" ▼
        return true;
    }




    // ▬ (Q3) The "notReservedWord()" Method ▬
    public static boolean notReservedWord(String s){

        // ▼ If the "String" is not a "Java Reserved Word"
        //      → return "True" ▼
        return !javaWords.contains(s);
    }



    // ▬ (Q4) The "occurrence()" Method ▬
    public static int occurrence(ArrayList<String> lst, String s){

        // ▼ "Counting" the "Occurrence" ▼
        int counter = 0;


        // ▼ Looping through the "List" tO "Verify" the "String" ▼
        for (int i = 0; i < lst.size(); i++) {

            // ▼ Verifying the "String"
            if (s.equals(lst.get(i))) {
                // ▼ "Incrementing" the "Counter" ▼
                counter++;
            }
        }

        // ▼ "Returning" the "Counter" ▼
        return counter;
    }




    // ▬ (Q5) The "existsOnce()" Method ▬
    public static boolean existsOnce(String s){

        // ▼ Using the "occurrence()" Method
        //      → to "Verify" if the "String" exists "Once" ▼
        return occurrence(declared, s) == 1;
    }





    // ▬ (Q6) The "badIdentifiers()" Method ▬
    public static ArrayList<String> badIdentifiers(){

        // ▼ Creating a "ArrayList" of "String" Type ▼
        ArrayList<String> badIdentifiers = new ArrayList<>();

        // ▼ Looping through the "List Declared"
        //      → to "Verify" the "Bad Identifiers" ▼
        for (int i = 0; i<declared.size() ; i++){

            // ▼ Getting the "String" at "Index" "i" ▼
            String s = declared.get(i);

            // ▼ Verifying if the "String"
            //      → "Does Not Begins" with a "Letter" and
            //      → "Does Not Contain" the "Legal Characters"
            //      → "Does Not Be" a "Java Reserved Word" and
            //      → "Does Not Be" "Already Declared"
            if (    !beginsWithLetter(s)
                    || !containsLegalCharacters(s)
                    || !notReservedWord(s)
                    || !existsOnce(s))

                // ▼ "Adding" the "Bad Identifiers"
                //      → to the "List of Bad Identifiers" ▼
                badIdentifiers.add(s);
        }

        // ▼ "Returning" the "List" of "Bad Identifiers" ▼
        return badIdentifiers;

    }
}
