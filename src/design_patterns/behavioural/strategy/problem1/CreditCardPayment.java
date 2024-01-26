package design_patterns.behavioural.strategy.problem1;


// ▬ [1-1] "Concrete Strategy" ▬
//              → "Implements" the "PaymentStrategy"
//              → for "Different Payment Methods" ▬
class CreditCardPayment implements PaymentStrategy {

    // ▼ Property ▼
    private String creditCardNumber;


    // ▬ "Constructor" ▬
    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


    // ▬ The "pay()" Override Method ▬
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card Number: " + creditCardNumber);
    }
}
