package design_patterns.behavioural.strategy.problem2;


// ▬ [1-2] "Concrete Strategy" ▬
//              → "Implements" the "SocialStrategy"
//              → for "Different Social Media Platforms" ▬
public class Twitter implements SocialStrategy{

    // ▬ The "connectTo()" Override Method ▬
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connected to " + friendName + " using Twitter");
    }
}
