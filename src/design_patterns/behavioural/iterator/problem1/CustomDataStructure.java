package design_patterns.behavioural.iterator.problem1;


// ▬ "Implement" the "Container" Interface ▬
public class CustomDataStructure implements Container {

    // ▼ "Array" of "Employees"
    public String[] employees = { "Marius", "Jeanine", "Nicholas" };

    // ▬ The "getIterator()" Override Method ▬
    @Override
    public Iterator getIterator() {
        return new ElementIterator();  // → Not from "Java"
    }




    // ▬ "Inner Class"
    //      → "Implement" the "Iterator" Interface ▬
    private class ElementIterator implements Iterator {

        //▼ "Property" ▼
        int index;


        // ▬ The "hasNext()" Override Method ▬
        @Override
        public boolean hasNext() {

            // ▼ Return "True" if there is a "Next/Other Element" ▼
            if(index < employees.length){
                return true;
            }

            // ▼ Otherwise, Return "False" ▼
            return false;
        }


        // ▬ The "next()" Override Method ▬
        @Override
        public Object next() {

            // ▼ Return the "Next/Other Element" ▼
            if(this.hasNext()){
                return employees[index++];
            }

            // ▼ Otherwise, Return "Null" ▼
            return null;
        }
    }
}



