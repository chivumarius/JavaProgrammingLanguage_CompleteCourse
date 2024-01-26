/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                • EXERCISE 41 •
              ► "LINKED LIST" ◄
               ► "ITERATOR" ◄



    ▬ Next, we would "Like"
        → to "Implement" a "Generic" Class - "MyIterator{}"
        → which "Allows" to "Generate" an "Iterator" Object
        → for the "MyTreeSet" Collection.


    ▬ This "Class" must "Contain" - "Properties":
        - An "Object" of "MYTreeSet" Type
        - An "Object" of "Node" Type
            → to "Point" to the "Current Node"



    ▬ "Methods":
        - hasNext():
            → which "Informs" us
            → if there are "Elements"
            → to "Read" from the "Iterator"

        - next():
            → which "Returns" the "Current Element"
            → and "Moves Forward One Position".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;


import java.util.Iterator;

public class Ex41_Linked_List_Iterator {

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




        // ▬▬▬▬▬  "EXERCISE 40" ▬▬▬▬▬
        // ▬ The "add()" Method ▬
        public boolean add(E e) {
            // ▼ "Preserve" the "Uniqueness" of "List" ▼
            if(contains(e)) return false;


            // ▼ If the "First Node" is "Empty" ▼
            if (firstNode == null){

                // ▼ "Set" the "Node" as "Generic E" ▼
                firstNode = new Node<E>(e);
                return true;
            }



            // ▼ "Preserve" the "Order" of the "List" ▼
            if (firstNode.elem.compareTo(e) > 0){
                firstNode = new Node<E>(e, firstNode);
                return true;
            }


            // •••► Adding the "Element" to the "List" ◄•••
            // ▼ "Creating" an "Object" of "Node" Type ▼
            Node<E> q  = firstNode;

            // ▼ While the "Linked List" is "Not Empty" ▼
            while(q.next != null && q.next.elem.compareTo(e) < 0){
                q = q.next;
            }


            // ▼ "Set" the "Node" as "Generic E" ▼
            q.next = new Node<E>(e, q.next);
            return true;
        }




        // ▬ The "get()" Method ▬
        public E get(int index){

            // ▼ If the "First Node" is "Not Empty" ▼
            if (!(firstNode != null)){

                // ▼ "Creating" an "Object" of "Node" Type ▼
                Node<E> q = firstNode;

                // ▼ "Creating" a "Counter" Variable ▼
                int c = 0;

                // ▼ While the "Node" is "Not Empty"
                //      → and "Index" is "Not Found" ▼
                while(q != null && c < index){
                    // ▼ "Go" to the "Next Node" ▼
                    q = q.next;
                    c++;
                }

                // ▼ If the "Index" is "Found" ▼
                return q.elem;
            }

            // ▼ "Otherwise" ▼
            return null;
        }
    }





    // ▬▬▬▬▬  "EXERCISE 41" ▬▬▬▬▬
    // ▬ The "MyIterator{}" Inner Class ▬
    public class MyIterator<E extends Comparable<E>> implements Iterator<E> {

        // ▼ "Properties" ▼
        MyTreeSet<E> myTreeSet;
        Node<E>      current;


        // ▬ "Constructor" ▬
        public MyIterator(MyTreeSet<E> t){
            myTreeSet = t;
            current = myTreeSet.firstNode;
        }



        // ▬ The "hasNext()" Method
        public boolean hasNext(){
            return current != null;
        }



        // ▬ The "next()" Method
        public E next(){
            //▼ Getting the "Nest Element" ▼
            E e = current.elem;
            current = current.next;
            return e;
        }
    }
}
