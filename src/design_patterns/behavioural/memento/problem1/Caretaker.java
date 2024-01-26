package design_patterns.behavioural.memento.problem1;

import java.util.ArrayList;
import java.util.List;


// ▬ [3] "Caretaker" Class ▬
public class Caretaker {

    // ▼ "Array List" of "Mementos" ▼
    private List<Memento> mementoList = new ArrayList<>();


    // ▬ The "add()" Method
    //      → for Adding "Mementos"
    //      → to the "List" ▬
    public void add(Memento state) {
        mementoList.add(state);
    }


    // ▬ The "get()" Method
    //      → for Retrieving "Mementos"
    //      → from the "List" ▬
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
