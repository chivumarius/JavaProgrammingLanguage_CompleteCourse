/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                • EXERCISE 39 •
              ► "LINKED LIST" ◄
                ► "GENERIC" ◄



    ▬ Now we "Would Like"
        → to "implement" the "generic collection"
        → "MyTreeSet" Parameterized
        → with a "Parameter Type" ( "E")
        → with the "Constraint"
        → that the "Elements" of the "Collection"
        → must be "Unique" and "Ordered"
        → as a "Linked List".



    ▬ This "Class"
        → will "Contain"
        → a "Single Property Type" - "Node"
        → which "Points"
        → to the "First Cell"
        → of the "List". We ask to endow this class with the following methods:


            1. One "Builder" Default
                → and a "Parameterized Constructor"
                → by a "Parameter" of "Node" Type.


            2. "contains(..)":
                → Informs us
                → if the "Element" given in "Parameter"
                → "Exists" in the "Collection"
                → or "Not".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;



public class Ex39_Linked_List_Generic {

    // ▬▬▬▬▬  "EXERCISE 38" ▬▬▬▬▬
    // ▬ The "Node{}" Inner Class
    //      → of "Generic E" Type,
    //      → that "Extend" and "Implement"
    //      → the "Comparable" Interface
    //      → to "Order" and "Compare" the "Nodes" ▬
    public class Node<E extends Comparable<E>> implements Comparable<Node<E>>{


        // ▼ "Generic E" Type Variable ▼
        E elem;    // ► "Object" Type allows "All Data Types"

        // ▼ "Pointer" Type Variable
        //      → "Points" to the "Next Node" ▼
        Node next;




        // ▬ "First Constructor" ▬
        public Node(E e, Node n){
            elem = e;
            next = n;
        }




        // ▬ "Second Constructor" ▬
        public Node(E e){
            this(e, null);
        }




        // ▬ The "compareTo()" Override Method
        //      → for "Comparing Two Nodes" ▬
        @Override
        public int compareTo(Node<E> n) {
            return elem.compareTo(n.elem);
        }
    }





    // ▬▬▬▬▬  "EXERCISE 39" ▬▬▬▬▬
    // ▬ The "MyTreeSet{}" Inner Class
    //      → that "Extend" the "Comparable" Class ▬
    public class MyTreeSet<E extends Comparable<E>> {

        // ▼ "Creating" an "Object" of "Node" Type ▼
        Node<E> firstNode;


        // ▬ "First Constructor" ▬
        public MyTreeSet() {
            // ► pointing to the "First Node" ◄
            firstNode = null;
        }


        // ▬ "Second Constructor" ▬
        public MyTreeSet(Node<E> n) {
            firstNode = n;
        }



        // ▬ The "contains()" Method ▬
        public boolean contains(E e) {

            // ▼ If the "Linked List" is "Not Empty" ▼
            if (firstNode != null) {

                // ▼ "Creating" an "Object" of "Node" Type ▼
                Node<E> q = firstNode;


                // ▼ While the "Linked List" is "Not Empty" ▼
                while (q != null) {

                    // ▼ If the "Element" is "Found" ▼
                    if (q.elem.compareTo(e) == 0) {  // ► Ordering
                        return true;

                    } else {

                        // ▼ "Go" to the "Next Node" ▼
                        q = q.next;
                    }
                }
            }

            return false;
        }
    }


}
