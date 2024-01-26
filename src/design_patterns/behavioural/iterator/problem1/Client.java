/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "ITERATOR" ◄
                - "PROBLEM 1" -




  Problem 1:
    • Create a "Custom Data Structure"
        → based on an "Array"
        → and "Use" the "Iterator"
        → to "Loop" through "All" the "Elements"
        → of the "Data Structure".




    • "Collections"
        → are One of the Most Used "Data Types"
        → in "Programming".


    • Nonetheless, a "Collection"
        → is just a "Container"
        → for a "Group" of "Objects".


    • Most "Collections"
        → "Store" their "Elements"
        → in Simple "Lists".


    • However, "Some" of "Them"
        → are based on:
            •► "Stacks",
            •► "Trees",
            •► "Graphs"
        → and other Complex "Data Structures".


    • The same "Collection"
        → can be "Traversed"
        → in Several "Different Ways".


    • "Adding" more
        → and more "Traversal Algorithms"
        → to the "Collection"
        → gradually "Blurs"
        → its "Primary Responsibility",
        → which is "Efficient Data Storage".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.iterator.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunIteratorPattern();
    }


    // ▬ The "RunIteratorPattern()" Method ▬
    private static void RunIteratorPattern() {
        System.out.println("\n");

        // ▼ Create a "Custom Data Structure" Object ▼
        CustomDataStructure customDataStructure = new CustomDataStructure();


        // ▼ "Looping" through "All Elements" of the "Iterator"/"Data Structure" ▼
        for( Iterator iterator = customDataStructure.getIterator();
             iterator.hasNext();
           ) {

            String employeeName = (String) iterator.next();
            System.out.println("Employee name: " + employeeName);
        }



        System.out.println("\n");
    }
}
