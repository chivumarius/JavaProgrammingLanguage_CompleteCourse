
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • JAVA "COLLECTIONS" •
           - ("GROUP" OF "OBJECTS") -
           ___________________________ 

             ► "SET" INTERFACES ◄





    ▬ "Set" Interface
        → is a "Collection"
        → that "Cannot Contain" the "Duplicate Elements".


    ▬ The "Set"
        → is an "Interface"
        → "Available" in the "java.util" Package.



    ▬ The "Set" Interface
        → "Extends" the "Collection" Interface.



    ▬ The "Set" Interface
        → represents an "Unordered Set"
        → of "Elements",
        → which does "Not Allow Us"
        → to "Store" the "Duplicate Elements".


    ▬ The "Set" Interface
        → is "Used" to "Create"
        → the "Mathematical Set".


    ▬ The "Set" Interface
        → use "Collection" Interface's "Methods"
        → to "Avoid" the "Insertion"
        → of the "Duplicate Elements".


    ▬ "SortedSet" and "NavigableSet"
        → are "Two Interfaces"
        → that "Extend"
        → the "St Implementation".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package collections.set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Set_Interface {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ "Creating" a "Set" of Type "HashSet" ▼
        Set<String> set1 = new HashSet<>();

        // ▼ "Creating" a "Set" of Type "LinkedHashSet" ▼
        Set<String> set2 = new LinkedHashSet<>();

        // ▼ "Creating" a "Set" of Type "LinkedHashSet" ▼
        Set<String> set3 = new TreeSet<>();
    }
}
