package design_patterns.behavioural.mediator.problem1;


// ▬ [2] "Abstract" Class ▬
public abstract class User {

    // ▼ "Objects" ▼
    ChatMediator chatMediator;
    String name;


    // ▬ "Constructor" ▬
    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }


    // ▬ The "send()" Abstract Method ▬
    public abstract void send(String msg);


    // ▬ The "receive()" Abstract Method ▬
    public abstract void receive(String msg);
}
