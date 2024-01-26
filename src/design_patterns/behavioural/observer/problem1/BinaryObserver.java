package design_patterns.behavioural.observer.problem1;


// ▬ "Extend" the "Observery" Class ▬
public class BinaryObserver extends Observery {

    // ▬ "Constructor" ▬
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribeToList(this);
    }



    // ▬ The "update()" Override Method ▬
    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
