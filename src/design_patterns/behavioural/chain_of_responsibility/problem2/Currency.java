package design_patterns.behavioural.chain_of_responsibility.problem2;

public class Currency {

    // ▼ "Property" ▼
    private int amount;


    // "Constructor"
    public Currency(int amount) {
        this.amount = amount;
    }


    // ▬ "Getter" → for the "Amount" Property ▬
    public int getAmount() {
        return amount;
    }
}
