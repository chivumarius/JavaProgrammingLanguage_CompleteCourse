
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • JAVA "COLLECTIONS" •
           - ("GROUP" OF "OBJECTS") -
           ___________________________ 

             ► "LIST" INTERFACE ◄
              ► "STACK" CLASS ◄
          - ("Last In First Out") -



    ▬ The "Stack"
        → is a "Linear Data Structure",
        → Used to "Store"
        → the "Collection" of "Objects". It is based on Last-In-First-Out (LIFO).



    ▬ The "Stack" Class
        → provides "Different Operations"
        → such as:
            • "push",
            • "pop",
            • "search", etc.



    ▬ The "Stack" Data Structure
        → has the "Two" Most "Important Operations"
            [1] "Push" &
            [2] "Pop".


    ▬ The "Push" Operation
        → "Inserts" an "Element"
        → into the "Top"
        → of the "Stack"



    ▬ The "Pop" Operation
        → "Removes" an "Element"
        → from the "Top"
        → of the "Stack".


    ▬ "Methods" of the "Stack" Class

        • The "Stack" Class
            → provides mainly "Five Methods"
            → to "Perform Operations".

        [1] "empty()" Method
                → to "Check" if the "Stack"
                → is "Empty" or "Not" (type "boolean").


        [2] "push()" Method
                → to "Insert" an "Element"
                → onto the "Top"
                → of the "Stack".


        [3] "pop()" Method
                → to "Remove" an "Element"
                → from the "Top"
                → of the "Stack".


        [4] "peek()" Method
                → to "View" the "Top Element"
                → of the "Stack".


        [5] "search()" Method
                → to "Search" an "Element"
                → in the "Stack" and
                → to "Return" the "Element Position".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package collections.list.stack;



import java.util.Stack;



public class Stack_Class {


    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ Creating an "Array" of "Strings" Type ▼
        String[] data = {"to", "be", "or", "not", "to", "be"};


        // ▼ Creating an "List" Collection of "Stack" Type ▼
//      List<String> stack = new Stack<>();
        Stack<String> stack = new Stack<>();


        // ▼ Adding "Data" to the "Stack" Collection ▼
        for (String word : data) {

            // ▼ Calling the "push()" Method
            //      → for "Adding Elements"
            //      → to the "Stack" Collection ▼
            stack.push(word);
        }




        // ▬ "STACK  BEHAVIOURS" ▬

        // ▼ "Displaying All" the "Stack" Collection ▼
        System.out.println("Stack: " + stack);

        // ▼ "Displaying" the "Size" of the "Stack" Collection ▼
        System.out.println("Size: " + stack.size());

        // "Displaying" the "Top Element" of the "Stack" Collection ▼
        System.out.println("Top Element (Peek): " + stack.peek());


        // "Displaying" the "Removed Top Element" of the "Stack" Collection ▼
        System.out.println("Removed Top Element (Pop): " + stack.pop());


        // ▼ "Removing All Elements"
        //      → from the "Top" to the "Bottom"
        //      → of the "Stack" Collection ▼
//        while (!stack.empty()) {
//
//            // "Displaying" the "Removed Top Element" of the "Stack" Collection ▼
//            System.out.println("Removed Top Element (Pop): " + stack.pop());
//        }


        // ▼ "Displaying All" the "Stack" Collection ▼
        System.out.println("Stack: " + stack);

    }
}

