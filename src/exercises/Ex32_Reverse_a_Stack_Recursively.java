/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                • EXERCISE 32 •
         ► "REVERSE" A STACK RECURSIVELY" ◄




    ▬ Write a "Program"
        → to "Reverse" a "Stack"
        → using "Recursion".


    ▬ You are "Not Allowed"
        → to use "loop constructs"
        → like "while{}", "for{}"..etc,
        → and you "Can Only Use"
        → the Following "ADT Functions"
        → on "Stack" - "S":
            •► isEmpty(S)
            •► push(S)
            •► pop(S)

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;


import java.util.Stack;


public class Ex32_Reverse_a_Stack_Recursively {

    // ▼ Creating a "Stack" Object ▼
    static Stack<Character> st = new Stack<>();



    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "Adding"/ "Pushing" the "Elements"
        //      → into the "Stack" ▼
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');


        // ▼ Displaying the "Original Stack" ▼
        System.out.println("Original Stack: " + st);


        // ▼ Reversing the "Stack" ▼
        reverse();


        // ▼ Displaying the "Reversed Stack" ▼
        System.out.println("Reversed Stack: " + st);

    }




    // ▬ The "insertAtBottom()" Method
    //      → to "Insert Element"
    //      → at the "Bottom" of a "Stack" ▬
    static void insertAtBottom(char x){

        // ▼ If the "Stack" is "Empty" ▼
        if (st.isEmpty()){

            // ▼ Adding "x" to the "Stack" ▼
            st.push(x);

        } else {
            // ▼ Creating a "Temporary Variable" ▼
            char a = st.peek();

            // ▼ Removing "a" from the "Stack" ▼
            st.pop();

            // ▼ Recursion Callback ▼
            insertAtBottom(x);

            // ▼ Adding "a" to the "Stack" ▼
            st.push(a);
        }
    }




    // ▬ The "reverse()" Method
    //      → to "Reverse" the "Stack"
    public static void reverse() {

        // ▼ If the "Stack" is "Not Empty" ▼
        if (st.size() > 0) {
            // ▼ Getting "Element" from the "Top" of the "Stack" ▼
            char x = st.peek();

            // ▼ Removing "x" from the "Stack" ▼
            st.pop();


            // ▼ Recursion Callback Method ▼
            reverse();   // ◄ The "Trick" of "Reversing Stack"

            // ▼ Adding "x" to the "Bottom" of the "Stack"
            //      → by "Calling" the "Method" ▼
            insertAtBottom(x);
        }
    }

}
