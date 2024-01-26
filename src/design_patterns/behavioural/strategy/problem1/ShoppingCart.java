package design_patterns.behavioural.strategy.problem1;



// ▬ [2] "Context" Class ▬
//          → that "Uses" the "PaymentStrategy" ▬
public class ShoppingCart {

    // ▼ "Instance"/"Object" ▼
    private PaymentStrategy paymentStrategy;

    // ▬ "Setter" → for the "PaymentStrategy" Object ▬
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    // ▬ The "checkout()" Method ▬
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
