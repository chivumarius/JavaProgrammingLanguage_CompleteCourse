package design_patterns.behavioural.strategy.problem1;


// ▬ [1] "Strategy" Interface
//          → "Defines" the "Contract"
//          → for All "Payment Strategies" ▬
public interface PaymentStrategy {

    // ▬ "Method" ▬
    void pay(int amount);
}