package design_patterns.behavioural.mediator.problem2;


// ▬ [2] "Button" ▬
public class Button {

    // ▼ Instances/Objects ▼
    private Mediator mediator;


    // ▬ "Constructor" ▬
    public Button(Mediator mediator) {
        this.mediator = mediator;
    }


    // ▬ "Setter" → for "mediator" Property ▬
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }


    // ▬ The "pressButton()" Method ▬
    public void pressButton() {
        mediator.pressButton();
    }
}
