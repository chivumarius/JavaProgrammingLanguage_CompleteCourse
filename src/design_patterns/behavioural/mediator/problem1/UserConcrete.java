package design_patterns.behavioural.mediator.problem1;


// ▬ [2-1] "Concrete" ▬
public class UserConcrete extends User {

    // ▬ "Constructor" ▬
    public UserConcrete(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }


    // ▬ The "send()" Override Method ▬
    @Override
    public void send(String msg) {
        System.out.println(this.name + " Sent Message: " + msg);
        chatMediator.sendMessage(msg, this);
    }


    // ▬ The "receive()" Override Method ▬
    @Override
    public void receive(String msg) {
        System.out.println(this.name + " Received Message: " + msg);
    }
}
