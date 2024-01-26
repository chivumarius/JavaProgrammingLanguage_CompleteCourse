
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • JAVA "COLLECTIONS" •
           - ("GROUP" OF "OBJECTS") -
           ___________________________ 

           ► "COLLECTION"  FRAMEWORK ◄
      ► "ITERABLE" & "ITERATOR" INTERFACES ◄





    ▬ A "Collection"
        → represents a "Group" of "Objects"
        → or in other words
        → a "Single Unit" of "Objects".



    ▬ The "Collection"
        → in "Java"
        → is a "Framework"
        → that "Provides" an "Architecture"
        → to "Store" and "Manipulate"
        → the "Group" of "Objects".



    ▬ "Collections"
        → can "Achieve All" the "Operations"
        → that we "Perform" on a "Data"
        → such as:
            • "Searching",
            • "Sorting",
            • "Insertion",
            • "Manipulation", and
            • "Deletion".




    ▬ "Collection Framework"
        ► provides "Interfaces"
            • "Set",
            • "List",
            • "Queue",
            • "Deque"

        ► and "Classes":
            • "ArrayList",
            • "Vector",
            • "LinkedList",
            • "PriorityQueue",
            • "HashSet",
            • "LinkedHashSet",
            • "TreeSet".






 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
      ► "ITERABLE" & "ITERATOR" INTERFACES ◄



    ▬ An "Iterator"
        → is an "Object"
        → used to "Loop"
        → through "Collections",
        → like
            • "ArrayList" and
            • "HashSet".



    ▬ It is "Called" an "Iterator"
        → because "iterating"
        → is the "Technical Term"
        → for "Looping".


    ▬ To "Use" an "Iterator",
        → we must "Import It"
        → from the "java.util" Package.



    ♦ "Definition" of "Iterator":
    ____________________________________________
         public Iterator<E> {
            // ▼ Return "true"
                    → if the "Iteration"
                    → has "More Elements" ▼
            boolean hasNext();

            // ▼ Return the "Next Element"
            //      → from the "Iteration" ▼
            E next();

            // ▼ Remove the Last Element Returned
            //      → by the "Iteration" ▼
            void remove();
        }
    ____________________________________________
        • Here, "E" is the "Element Type"





    ▬ An "Iterable" Interface
        → allows an "Object"
        → to be the "Target"
        → of enhanced "for()" Loop
        → ("for-each" Loop).

    ▬ The "Iterable" Interface
        → belongs to "java.lang" Package.


    ▬ An "Object"
        → that "Implement" an "Iterable"
        → "Allows It" to be "Iterated".



    ♦ "Definition" of "Iterable":
    _____________________________________________________
        public interface Iterable<T>{

          // ▼ Create the "iterator()" Method
          //      → that Return an "Iterator"
          //      → over Elements
          //      → of Type "T" ▼
          Iterator<T> iterator();

          Spliterator<T> spliterator();

          void forEach(Consumer<? super T> action);
        }
    _____________________________________________________

        • Here, "T" is the "Type" of "Element Returned" by the "Iterator".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package collections.collection;


import java.util.ArrayList;
import java.util.Iterator;



public class IterableAndIterator {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ (Step 1) "Creating" an "list" Object
        //      → from the "ArrayList" Class
        //      → by using "<>" Operator
        //      → (fom "Java 7" Version) ▼
        ArrayList<String> list = new ArrayList<>();


        // ▼ (Step 2-1) "Adding Elements"
        //      → to "ArrayList" T
        //      → by using "add()" Method ▼
        list.add("C");
        list.add("C++");
        list.add("C#");





        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ▬ (1) Using "Iterator" Interface and
        //      → "while()" Loop
        //      → to "Iterate"
        //      → the "ArrayList" Collection ▬
        Iterator<String> iterator = list.iterator();

        // ▼ "while()" Loop
        //      → for "Checking"
        //      → if "Iterator" has "Elements" ▼
        while (iterator.hasNext()){
            // ▼ "Storing" the "Iterator Elements" in "obj"  Object▼
            String obj = iterator.next();

            // ▼ Displaying "All Iterator Elements" ▼
            System.out.println(obj);
        }


        System.out.println("\n____________________________________________________________________\n");




        // ▬ (2) Using "For Each" Loop
        //      → to "Iterate"
        //      → the "ArrayList" Collection ▬
        for (String element : list){
            System.out.println(element);
        }

        System.out.println("\n____________________________________________________________________\n");




        // ▬ (3) Using "For()" Loop
        //      → to "Iterate"
        //      → the "ArrayList" Collection ▬
        for (int i = 0; i< list.size() ; i++){
            System.out.println(list.get(i));
        }

        System.out.println("\n____________________________________________________________________\n");

    }
}
