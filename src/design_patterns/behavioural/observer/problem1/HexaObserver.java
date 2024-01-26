package design_patterns.behavioural.observer.problem1;


// ▬ "Extend" the "Observery" Class ▬
public class HexaObserver extends Observery {

    // ▬ "Constructor" ▬
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribeToList(this);
    }



    // ▬ The "update()" Override Method ▬
    @Override
    public void update() {
        System.out.println("Hexa String: " + Integer.toHexString(subject.getState()));
    }
}
