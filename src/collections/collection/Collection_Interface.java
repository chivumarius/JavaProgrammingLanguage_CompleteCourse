
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • JAVA "COLLECTIONS" •
           - ("GROUP" OF "OBJECTS") -
           ___________________________ 

           ► "COLLECTION" INTERFACES ◄





    ▬ The "Collection" Interface
        → extends the "Iterable" Interface.


    ▬ The "Collection" Interface
        → is the "Root Interface"
        → of the "Java Collections Framework".


    ▬ There is "No Direct Implementation"
        → of this "Interface".
        → it is "Implemented" through its "Sub-Interfaces" like :
            • "List",
            • "Set", and
            • "Queue".


    ▬ The "ArrayList" Class
            → "Implements" the "List" Interface


    ▬ "List" Interface
        → is a "Sub-Interface"
        → of the "Collection" Interface.



    ▬ "Sub-Interfaces" of "Collection"

        [1] "List" Interface
                → is an "Ordered Collection"
                → that Allows Us
                → to "Add" and "Remove Elements"
                → like an "Array". To learn more, visit: Java List Interface.


        [2] "Set" Interface
               → allows us to "Store Elements"
               → in "Different Sets"
               → Similar to the "Set" in "Mathematics".
               → It "Cannot" have "Duplicate Elements".


        [3] "Queue" Interface
               → is Used when "We Want"
               → to "Store" & "Access Elements" in:
                    • "First In",
                    • "First Out" (FIFO) Manner.



    ▬ "Methods" of "Collection" interface:

        (1) "add()" Method
                → "Inserts" the "Specified Element"
                → to the "Collection".


        (2) "size()" Method
                → "Returns" the "Size"
                → of the "Collection".


        (3) "remove()" Method
                → "Removes" the "Specified Element"
                → from the "Collection".


        (4) "iterator()" Method
                → "Returns" an "Iterator"
                → to "Access Elements"
                → of the "Collection".


        (5) "addAll()" Method
                → "Adds All" the "Elements"
                → of a "Specified Collection"
                → to the "Collection".


        (6) "removeAll()" Method
                → "Removes All" the "Elements"
                → of the "Specified Collection"
                → from the "Collection".


        (7) "clear()" Method
                → "Removes All" the "Elements"
                → of the "Collection".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package collections.collection;


import java.util.ArrayList;
import java.util.Collection;


public class Collection_Interface {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ "COLLECTIONS" ▬
        // ▼ Creating a "Collection" of Type "ArrayList" ▼
        Collection<String> topLanguages = new ArrayList<>();

        // ▼ "Adding Elements" to the "ArrayList" Collection ▼
        topLanguages.add("Java");
        topLanguages.add("C#");
        topLanguages.add("C++");


        // ▼ Displaying the "Collection" ▼
        System.out.println(topLanguages);
    }
}
