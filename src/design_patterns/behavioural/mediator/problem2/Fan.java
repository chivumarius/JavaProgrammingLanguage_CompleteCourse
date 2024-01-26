package design_patterns.behavioural.mediator.problem2;


// ▬ [3] "Fan" ▬
public class Fan {

    // ▼ "Instances"/"Objects" ▼
    private Mediator mediator;
    private boolean isOn = false;



    // ▬ "Constructor" ▬
    public Fan(Mediator mediator, boolean isOn) {
        this.mediator = mediator;
        this.isOn = isOn;
    }



    // ▬ "Getter" → for "isOn" Property ▬
    public boolean isOn() {
        return isOn;
    }


    // ▬ "Setter" → for "mediator" Property ▬
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // ▬ The "turnOn()" Method ▬
    public void turnOn() {
        mediator.start();
        isOn = true;
        System.out.println("Fan On");
    }



    // ▬ The "turnOff()" Method ▬
    public void turnOff() {
        mediator.stop();
        isOn = false;
        System.out.println("Fan Off");
    }

}
