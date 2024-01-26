package design_patterns.behavioural.chain_of_responsibility.problem2;


// ▬ "Implements" the "ChainOfResponsibility" Interface ▬
public class Dollar20 implements MoneyDistributor {

    // ▼ Create an "MoneyDistributor" Object/Instance ▼
    private MoneyDistributor chain;


    // ▬ The "nextChain()" Override Method ▬
    @Override
    public void setNextChain(MoneyDistributor nextChain) {
        this.chain = nextChain;
    }


    // ▬ The "distribute()" Override Method ▬
    @Override
    public void distribute(Currency currency) {

        // ▼ If the "Currency Amount"
        //      → is "Greater" or "Equal" to "20 Dollars" ▼
        if (currency.getAmount() >= 20) {

            // ▼ Distribute the "Currency Amount" ▼
            int number = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;

            System.out.println("Dispensing " + number + " 20$ note");

            // ▼ Distribute the Remainder ▼
            if (remainder != 0) {
                this.chain.distribute(new Currency(remainder));
            }

        } else {
            this.chain.distribute(currency);
        }
    }
}
