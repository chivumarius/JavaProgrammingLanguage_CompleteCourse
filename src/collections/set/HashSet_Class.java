
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • JAVA "COLLECTIONS" •
           - ("GROUP" OF "OBJECTS") -
           ___________________________ 

             ► "SET" INTERFACES ◄
              ► "HASHSET" CLASS ◄





    ▬ "HashSet" Class 
        → is "Used" to "Create" a "Collection" 
        → that "Uses" a "Hash Table" 
        → for "Storage". 

    
    ▬ "HashSet" Class
        → "Inherits" the "AbstractSet" Class 
        → and "Implements" 
        → "Set" Interface.


     ▬ "Set" Interface
        → is a "Collection"
        → that "Cannot Contain" the "Duplicate Elements".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package collections.set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSet_Class {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (1) "HASHSET" ▬
        // ▼ "Creating" a "Set" of Type "HashSet" ▼
        Set<String> set1 = new HashSet<>();


        // ▼ "Adding Elements" to the "Set" Collection ▼
        set1.add("Element1");
        set1.add("Element2");
        set1.add("Element2"); // Duplicate
        set1.add("Element3");
        set1.add("Element3"); // Duplicate

        // ▼ Using "Iterator"
        //      → to "Iterate"
        //      → over the "Set Collection Elements" ▼
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            // ▼ Displaying All "Set" Collection ▼
            System.out.println(iterator.next());
        }

    }
}