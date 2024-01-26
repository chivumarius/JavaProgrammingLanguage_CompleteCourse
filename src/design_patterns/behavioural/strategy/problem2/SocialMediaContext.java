package design_patterns.behavioural.strategy.problem2;


// ▬ [2] "Context" Class ▬
//          → that "Uses" the "SocialStrategy" ▬
public class SocialMediaContext {

    // ▼ "Instance"/"Object" ▼
    SocialStrategy socialStrategy;



    // ▬ The "setSocialStrategy()" Method ▬
    public void setSocialStrategy(SocialStrategy socialStrategy){
        this.socialStrategy = socialStrategy;
    }


    // ▬ The "connectTo()" Method ▬
    public void connectTo(String friendName){
        socialStrategy.connectTo(friendName);
    }
}
