package design_patterns.behavioural.mediator.problem2;


// ▬ [1] "Mediator" ▬
public class Mediator {

    // ▼ Instances/Objects ▼
    private Button button;
    private Fan fan;
    private PowerSupply powerSupply;



    // ▬ "Constructor" ▬
    public Mediator(Button button, Fan fan, PowerSupply powerSupply) {
        this.button = button;
        this.fan = fan;
        this.powerSupply = powerSupply;
    }


    // ▬ "Empty Constructor" ▬
    public Mediator() {
    }



    // ▬ The "pressButton()" Method ▬
    public void pressButton() {
        if(fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }


    // ▬ "Setter" → for "button" Property ▬
    public void setButton(Button button) {
        this.button = button;
        this.button.setMediator(this);
    }


    // ▬ "Setter" → for "fan" Property ▬
    public void setFan(Fan fan) {
        this.fan = fan;
        this.fan.setMediator(this);
    }


    // ▬ "Setter" → for "powerSupply" Property ▬
    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }



    // ▬ The "start()" Method ▬
    public void start() {
        powerSupply.turnOn();
    }



    // ▬ The "stop()" Method ▬
    public void stop() {
        powerSupply.turnOff();
    }
}
