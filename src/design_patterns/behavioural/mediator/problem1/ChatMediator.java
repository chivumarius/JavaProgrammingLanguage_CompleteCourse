package design_patterns.behavioural.mediator.problem1;


// ▬ [1] "Mediator" Interface ▬
public interface ChatMediator {

    // ▬ "Methods" ▬
    public void sendMessage(String msg, User user);
    public void addUser(User user);
}
