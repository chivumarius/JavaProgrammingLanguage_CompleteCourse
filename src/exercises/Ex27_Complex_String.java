/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            • EXERCISE 27 •
         ► "COMPLEX STRING" ◄



    ▬ The Following Method
        → allows "Drawing Randomly"
        → a Character between 'A' and 'E', i.e.
        → a "Character" among the "First 5 Capital Letters"
        → of the "Alphabet".


	public static char aeSort() {
		return (char) (65 + Math.random() * 5);
	}



    ▬ We would like to Write a Program
        → that "Draws Randomly"
        → a "Sequence" of "50 Letters"
        → through this "Method"
        → and "Displays"
        → a "Description" of "This Sequence"
        → where each "Letter"
        → is "Followed"
        → by the "Number" of "Occurrences"
        → of this "Letter"
        → in the "Sequence". If there is only one occurrence, only the letter is displayed.


    ▬ For "Example",
        → for the "Sequence": AABAAACC,
        → the "Description": A2BA3C2
        → will be "Displayed".



    ▬ Note :
        This Program does not Require
            → the "Use" of "Arrays".

    ▬ At the "End" of the "Program"
        → you must "Display" the "Initial Sequence"
        → and its "Description".




▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;




public class Ex27_Complex_String {

    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "Creating" a "Empty String" ▼
        String str1 = "";
        String str2 = "";
        int count = 1;


        // ▼ "Drawing" a "Sequence" of "50 Letters" ▼
        for(int i = 0; i < 50; i++){
            str1 = str1 + aeSort();
            str2 = str2 + aeSort();
        }



        // ▼ "Looping" through the "String" ▼
        for(int i = 0; i < str1.length() - 1; i++){

            // ▼ Checking if the Characters are the Same ▼
            if(str1.charAt(i) == str1.charAt(i + 1)){
                count++;

            } else {

                // ▼ If there are "Repeated Characters" ▼
                if(count != 1) {
                    str2 += str1.charAt(i) + "" + count;
                    count = 1;
                } else {
                    // ▼ If there are "No Repeated Characters" ▼
                    str2 += str1.charAt(i);
                }
            }


            // ▼ Adding the "Last Character" ▼
            str2 += str1.charAt(str1.length() - 1);


            // ▼ Displaying the "Sequence" ▼
            System.out.println(str1);
            System.out.println(str2 + "\n");
        }
    }




    // ▬ The "aeSort()" <ethod ▬
    private static char aeSort() {

        // ▼ "Generating" a "Random Number" ▼
        return (char) (65 + Math.random() * 5);
    }

}
