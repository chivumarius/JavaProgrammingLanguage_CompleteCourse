/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                             • EXERCISE 37 •
                               ► "SETS" ◄
         ► "FINDING" THE "INTERSECTION" ("COMMON ELEMENTS") BETWEEN "TWO SETS" ◄



    ▬ Create "2 Sets"
        → and "Find" the "Intersection"
        → between "Them"
        → by "Creating"
        → a "Intersection()" Method.

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;


import java.util.HashSet;
import java.util.Set;


public class Ex37_Sets_Finding_the_Intersection_between_Two_Sets {

    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▬▬▬ "FIRST SET" ▬▬▬
        // ▼ "Creating" an "Integer Set" Object of "HashSet" Type
        Set<Integer> set1 = new HashSet<>();

        // ▼ Adding "Elements" to the "Set" Object ▼
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);


        // ▼ "Displaying" the "Set" Object ▼
        System.out.println("Set 1: " + set1);




        // ▬▬▬ "SECOND SET" ▬▬▬
        // ▼ "Creating" an "Integer Set" Object of "HashSet" Type
        Set<Integer> set2 = new HashSet<>();

        // ▼ Adding "Elements" to the "Set" Object ▼
        set2.add(5);
        set2.add(7);
        set2.add(9);
        set2.add(11);


        // ▼ "Displaying" the "Set" Object ▼
        System.out.println("Set 2: " + set2);




        // ▬▬▬ "INTERSECTION" OF "TWO SETS" ▬▬▬
        // ▼ Calling the "Method" ▼
        Intersection(set1, set2);
    }




    // ▬▬▬ "INTERSECTION" OF "TWO SETS" ▬▬▬
    // ▬ The "Intersection()" Method ▬
    public static void Intersection(Set<Integer> set1, Set<Integer> set2) {

        // ▼ "Calculating" the "Intersection" of "Two Sets" ▼
        // ▼ The "retainAll()" Method
        //      → will "Keep All Elements"
        //      → that are "Present" in "Both Sets" ▼
        set2.retainAll(set1); // Removes all the "Elements" that are not "Present" in "Both Sets"


        // ▼ "Displaying" the "Intersection" of "Two Sets" ▼
        System.out.println("Intersection: " + set2);
    }

}
