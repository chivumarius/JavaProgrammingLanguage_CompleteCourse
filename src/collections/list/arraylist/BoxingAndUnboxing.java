
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • JAVA "COLLECTIONS" •
           - ("GROUP" OF "OBJECTS") -

               ► "WRAPPER" CLASSES ◄
             ► "BOXING" & "UNBOXING" ◄







    ▬ "Boxing"
        → is an "Automatic Conversion"
        → from "Primitive" Data Type
        → to a "Wrapped Object"
        → of "Appropriated" Data Type.



    ▬ "Unboxing"
        → is an "Automatic Conversion"
        → from a "Wrapped Object"
        → to its Corresponding
        → "Primitive" Data Type.




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



public class BoxingAndUnboxing {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {


        // ▼ "Creating" an "ArrayList"
        //      → of "Integer" Type ("Wrapper" Class) ▼
        ArrayList<Integer> list = new ArrayList<>();



        // ▼ "Creating" Objects "y" & "z"
        //      → from the "Integer" Wrapper Class ▼
        Integer y = new Integer(20);    // Integer y = 20;
        Integer z =  y.intValue();  // ► Having the "Same Value" as "y"


        // ▼ "Adding" an "Element" to the "ArrayList" ▼
        list.add(y);
        list.add(z);

        // ▼ "Boxing"
        //      → will "Convert Automatically"
        //      → an "int"
        //      → to an "Integer" Object ▼
        list.add(75);


        // ▼ "Display ▼
        System.out.println("\nBoxing Value in ArrayList: " + list);




        // ▼ "Unboxing"
        //      → will "Convert Automatically"
        //      → an "Integer" Object
        //      → to an "int" Primitive Data Type ▼
        int x = list.get(0);


        // ▼ "Display ▼
        System.out.println("\nUnboxing Value in ArrayList: " + x);

    }

}
