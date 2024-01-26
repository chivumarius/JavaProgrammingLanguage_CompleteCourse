package design_patterns.behavioural.mediator.problem1;

import java.util.ArrayList;
import java.util.List;


// ▬ [1-1] "Concrete Mediator" ▬
public class ChatConcreteMediator implements ChatMediator {

    // ▼ "Array List" of "Users" ▼
    private List<User> users;


    // ▬ "Constructor" ▬
    public ChatConcreteMediator() {
        this.users = new ArrayList<>();
    }



    // ▬ The "sendMessage()" Override Method ▬
    @Override
    public void sendMessage(String msg, User user) {

        // ▼ Loop ▼
        for(User sender : this.users) {

            // ▼ If the "User" is not the "Sender" ▼
            if(sender != user) {
                // ▼ Sender "Receives" the "Message" ▼
                sender.receive(msg);
            }
        }
    }


    // ▬ The "addUser()" Override Method ▬
    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
