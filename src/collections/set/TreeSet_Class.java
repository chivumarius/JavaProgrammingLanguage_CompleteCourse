
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • JAVA "COLLECTIONS" •
           - ("GROUP" OF "OBJECTS") -
           ___________________________ 

             ► "SET" INTERFACES ◄
             ► "TREE SET" CLASS ◄




    ▬ "TreeSet" Class
        → "Implements" the "Set" Interface
        → that "Uses" a "Tee"
        → for "Storage".



    ▬ "TreeSet" Class
        → Inherits "AbstractSet" Class and
        → "Implements" the "NavigableSet" Interface.



    ▬ The "Objects"
        → of the "TreeSet" Class
        → are "Stored"
        → in "Ascending Order".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package collections.set;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSet_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (3) "TREE SET" ▬
        // ▼ "Creating" a "Set" of Type "TreeSet" ▼
        Set<String> set3 = new TreeSet<>();


        // ▼ "Adding Elements" to the "Set" Collection ▼
        set3.add("B");
        set3.add("D");
        set3.add("B"); // Duplicate
        set3.add("A");
        set3.add("C");
        set3.add("E");
        set3.add("D"); // Duplicate
        set3.add("C"); // Duplicate


        // ▼ Using "Iterator"
        //       → to "Iterate"
        //      → over the "Set Collection Elements" ▼
        Iterator<String> iterator3 = set3.iterator();
        while (iterator3.hasNext()) {
            // ▼ Displaying All "Set" Collection ▼
            System.out.println(iterator3.next());
        }

    }
}