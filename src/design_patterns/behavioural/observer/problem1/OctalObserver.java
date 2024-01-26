package design_patterns.behavioural.observer.problem1;


// ▬ "Extend" the "Observery" Class ▬
public class OctalObserver extends Observery {

    // ▬ "Constructor" ▬
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribeToList(this);
    }



    // ▬ The "update()" Override Method ▬
    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
