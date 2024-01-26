
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • JAVA "COLLECTIONS" •
           - ("GROUP" OF "OBJECTS") -
           ___________________________ 

             ► "QUEUE" INTERFACE ◄
          - ("First In First Out") -




    ▬ The "Queue" Interface
        → is "Present" in "java.util" Package and
        → "Extends" the "Collection" Interface
        → is used to "Hold" the "Elements"
        → about to be "Processed"
        → in "FIFO Order" ("First In First Out").



    ▬ The "Queue" Interface
        → is an "Ordered List" of "Objects"
        → with Its Use "Limited" to:

            •> "Inserting Elements"
                    → at the "End"
                    → of the "List" and

            •> "Deleting Elements"
                    → from the "Start"
                    → of the "List".


    ▬ The "Queue" Interface
        → "Follows" the "FIFO Principle" ("First-In-First-Out").

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package collections.queue.linkedlist;


import java.util.LinkedList;
import java.util.Queue;



public class Queue_Interface_LinkedList_Class {


    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ Creating an "Array" of "Strings" Type ▼
        String[] data = {"to", "be", "or", "not", "to", "be"};


        // ▼ Creating a "Queue" Collection of "LinkedList" Type ▼
        Queue<String> queue = new LinkedList<>();


        // ▼ Adding "Data" to the "Queue" Collection ▼
        for (String word : data) {

            // ▼ Calling the "add()" Method
            //      → for "Adding Elements"
            //      → to the "Queue" Collection ▼
            queue.add(word);
        }




        // ▬ "QUEUE  BEHAVIOURS" ▬

        // ▼ "Displaying All" the "Queue" Collection ▼
        System.out.println("Queue: " + queue);

        // ▼ "Displaying" the "Size" of the "Queue" Collection ▼
        System.out.println("Size: " + queue.size());

        // "Displaying" the "First Element" of the "Queue" Collection ▼
        System.out.println("First Element (Peek): " + queue.peek());


        // "Displaying" the "Removed First Element" of the "Queue" Collection ▼
        System.out.println("Removed First Element (Poll): " + queue.poll());


        // ▼ "Removing All Elements"
        //      → from the "Top" to the "Bottom"
        //      → of the "Stack" Collection ▼
//        while (!queue.isEmpty()) {
//
//            // "Displaying" the "Removed First Element" of the "Queue" Collection ▼
//            System.out.println("Removed First Element (Poll): " + queue.poll());
//        }


        // ▼ "Displaying All" the "Queue" Collection ▼
        System.out.println("Queue: " + queue);

    }
}

