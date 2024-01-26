
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • JAVA "COLLECTIONS" •
           - ("GROUP" OF "OBJECTS") -
           ___________________________ 

             ► "SET" INTERFACES ◄
          ► "LINKED HASHSET" CLASS ◄




    ▬ The "LinkedHashSet" Class
        → is an "Ordered Version"
        → of "HashSet"
        → that "Maintains"
        → a "Doubly-Linked List"
        → Across "All Elements".



    ▬ When the "Iteration Order"
        → is "Needed" to be "Maintained"
        → this "Class"
        → is "Used".



    ▬ When "Iterating"
        → through a "HashSet"
        → the "Order"
        → is "Unpredictable",
        → while a "LinkedHashSet"
        → lets us "Iterate"
        → through the "Elements"
        → in the "Order"
        → in which They "Were Inserted".



    ▬ When "Cycling"
        → through "LinkedHashSet"
        → using an "Iterator",
        → the "Elements" will be "Returned"
        → in the "Order"
        → in which "They Were Inserted".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package collections.set;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSet_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (2) "LINKED HASHSET" ▬
        // ▼ "Creating" a "Set" of Type "LinkedHashSet" ▼
        Set<String> set2 = new LinkedHashSet<>();


        // ▼ "Adding Elements" to the "Set" Collection ▼
        set2.add("A");
        set2.add("B");
        set2.add("B"); // Duplicate
        set2.add("C");
        set2.add("C"); // Duplicate
        set2.add("D");
        set2.add("D"); // Duplicate
        set2.add("E");


        // ▼ Using "Iterator"
        //       → to "Iterate"
        //      → over the "Set Collection Elements" ▼
        Iterator<String> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            // ▼ Displaying All "Set" Collection ▼
            System.out.println(iterator2.next());
        }

    }
}