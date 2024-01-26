/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "MEDIATOR" ◄
                - "PROBLEM 1" -




  Problem 1:

    • We are Going to "Create"
        → a "Chat" Application
        → where "Users"
        → can do "Group Chat".


    • Every "User"
        → will be "Identified"
        → by its "Name"
        → and they can "Send"
        → and "Receive Messages".

    • The "Message Sent"
        → by any "User"
        → should be "Received"
        → by "All" the "Other Users"
        → in the "Group".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.mediator.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunMediatorPattern();
    }


    // ▬ The "RunMediatorPattern()" Method ▬
    private static void RunMediatorPattern() {
        System.out.println("\n");

        // ▼ Create the "ChatMediator" Object of "ChatConcreteMediator" Type ▼
        ChatMediator chatMediator = new ChatConcreteMediator();


        // ▼ "Creating" the "Users" Objects ▼
        User user1 = new UserConcrete(chatMediator, "Gabriel");
        User user2 = new UserConcrete(chatMediator, "Andrei");
        User user3 = new UserConcrete(chatMediator, "Cristian");


        // ▼ "Adding" the "Users" to the "Chat Mediator" ▼
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);


        // ▼ "User 1" → "Sending" the "Message" ▼
        user1.send("Hello I am Gabriel!");


        System.out.println("\n");


        // ▼ "User 2" → "Sending" the "Message" ▼
        user2.send("Hi I am Andrei!");


        System.out.println("\n");


        // ▼ "User 1" → "Sending" the "Message" ▼
        user3.send("Hi there I am Cristian!");


        System.out.println("\n");

    }
}
