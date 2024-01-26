package design_patterns.behavioural.strategy.problem2;


// ▬ [1] "Strategy" Interface
//          → "Defines" the "Contract"
//          → for All "Social Media Strategies" ▬
public interface SocialStrategy {

    // ▬ "Method" ▬
    void connectTo(String friendName);
}
