package design_patterns.behavioural.iterator.problem1;


// ▬ "Custom Iterator" (not from Java) ▬
public interface Iterator {

    // ▬ The "hasNext()" Method
    //      → Tell Us if there is an "Other Element"
    //      → in the "Collection" ▬
    public boolean hasNext();


    // ▬ The "next()" Method
    //      → Gets the "Next Element" ▬
    Object next();
}
