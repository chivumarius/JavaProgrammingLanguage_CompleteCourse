
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • JAVA "COLLECTIONS" •
           - ("GROUP" OF "OBJECTS") -

               ► "ARRAY LIST" CLASS ◄





    ▬ In a "Built-in Array"
        → it "Size"
        → "Cannot" be "Modified"
        → (to "Modify It" we have to "Create" a "New One").



    ▬ In "ArrayList" Class
        → the "Elements"
        → can be "Added" and "Removed"
        → "Whenever" we "Want".



    ▬ The "ArrayList" Class
        → is a "Resizable Array",
        → which can be "Found"
        → in the "java.util" Package.



    • "Syntax":

     ____________________________________________________________________
        // ▼ "Import" the "ArrayList" Class ▼
        import java.util.ArrayList;

        // ▼ "Create" an "cars" Object from the "ArrayList" Class ▼
        ArrayList<String> cars = new ArrayList<String>();
     ____________________________________________________________________




    ▬ The "ArrayList" Class
        → "Implements" the "List" Interface.



    ▬ The "ArrayList<>" Data Type
        → can "Only Be" as a "Reference" Type, an "Object"  (ex. ArrayList<String>),
        → not an "Primitive" Type (ex. ArrayList<int>).



    ▬ The "Wrapper" Classes
        → "Wraps" / "Stores"
        → a "Primitive" Data Types
        → (int, boolean, etc..)
        → as an "Object".

     ____________________________________________________________________
        Primitive Data Type	    Wrapper Class

            byte	                Byte

            short	                Short

            int	                    Integer

            long	                Long

            float	                Float

            double	                Double

            boolean	                Boolean

            char	                Character
     ____________________________________________________________________


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package collections.list.arraylist;


import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList_Class {

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
        list.add("Java");
        list.add("C");
        list.add("C#");
        list.add("Python");


        // ▼ "Display "ArrayList" ▼
        System.out.println("\nCreating ArrayList: " + list);



        // ▼ (Step 2-2) "Adding Elements"
        //      → to a "Specified Position" ("Index")
        //      → in the "ArrayList" ▼
        list.add(2, "C++");



        // ▼ "Display "ArrayList" ▼
        System.out.println("\nAdding Elements: " + list);




        // ▼ (Step 3) "Changing Elements"
        //      → in the "ArrayList"
        //      → by using "set()" Method ▼
        list.set(3, "JavaScript");


        // ▼ "Display "ArrayList" ▼
        System.out.println("\nChanging Elements: " + list);




//        // ▼ (Step 4-1) "Removing Elements"
//        //      → from the "ArrayList"
//        //      → by using "remove()" Method ▼
//        list.remove(4);  // ► by Specifying "Element Position"
////        list.remove("Python"); // ► by Specifying "Element Value"
//
//
//        // ▼ "Display "ArrayList" ▼
//        System.out.println("\nRemoving Elements: " + list);
//
//
//
//
//
//        // ▼ (Step 4-2) "Removing First Elements"
//        //      → from the "ArrayList"  ▼
//        list.removeFirst();
//
//
//        // ▼ "Display "ArrayList" ▼
//        System.out.println("\nRemoving First Elements: " + list);
//
//
//
//
//        // ▼ (Step 4-3) "Removing Last Elements"
//        //      → from the "ArrayList"  ▼
//        list.removeLast();
//
//
//        // ▼ "Display "ArrayList" ▼
//        System.out.println("\nRemoving Last Elements: " + list);
//
//
//
//
//        // ▼ (Step 4-4) "Removing All Elements"
//        //      → from the "ArrayList"  ▼
//        list.removeAll(list);
//
//
//        // ▼ "Display "ArrayList" ▼
//        System.out.println("\nRemoving All Elements: " + list);



        System.out.println("\n____________________________________________________________________\n");


        // ▼ (Step 5) "Iteration" over "ArrayList Elements" ▼

        // ▼ (Step 5-1) Using "For()" Loop
        //      → to "Iterate"
        //      → the "ArrayList Elements" ▼
        for (int i = 0; i< list.size() ; i++){
            System.out.println(list.get(i));
        }

        System.out.println("\n____________________________________________________________________\n");



        // ▼ (Step 5-2) Using "ForEach" Loop
        //      → to "Iterate"
        //      → the "ArrayList Elements" ▼
        for (String element : list){
            System.out.println(element);
        }



        System.out.println("\n____________________________________________________________________\n");



        // ▼ (Step 5-3) Using "Iterator" Interface
        //      → and "while()" Loop
        //      → to "Iterate"
        //      → the "ArrayList Elements" ▼
        Iterator<String> iterator = list.iterator();

        // ▼ Checking if "Iterator" has "Elements"
        while (iterator.hasNext()){
            // ▼ Displaying "Iterator" Elements ▼
            System.out.println(iterator.next());
        }



        System.out.println("\n____________________________________________________________________\n");

    }

}
