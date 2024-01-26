package design_patterns.behavioural.strategy.problem1;


// ▬ [1-2] "Concrete Strategy" ▬
class PayPalPayment implements PaymentStrategy {

    // ▼ "Property" ▼
    private String email;


    // ▬ "Constructor" ▬
    public PayPalPayment(String email) {
        this.email = email;
    }


    // ▬ The "pay()" Override Method ▬
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal account: " + email);
    }
}
