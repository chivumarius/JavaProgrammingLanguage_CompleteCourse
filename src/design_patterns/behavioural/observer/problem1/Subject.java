package design_patterns.behavioural.observer.problem1;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    // ▼ Creating an "ArrayList" of "Observery" ▼
    private List<Observery> observers = new ArrayList<>();

    // ▼ Property ▼
    int state;


    // ▬ "Getter" → for the "State" Property ▬
    public int getState() {
        return state;
    }

    // ▬ "Setter" → for the "State" Property ▬
    public void setState(int state) {
        this.state = state;

        // ▼ Call the "Method" ▼
        notifyAllObservers();
    }



    // ▬ The "subscribeToList()" Method ▬
    public void subscribeToList(Observery observery) {
        observers.add(observery);
    }



    // ▬ The "notifyAllObservers()" Method ▬
    private void notifyAllObservers() {

        // ▼ For each "Observery" in the "List" ▼
        for (Observery observery : observers) {
            // ▼ Update the "Observery" ▼
            observery.update();
        }
    }
}
