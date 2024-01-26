package design_patterns.behavioural.chain_of_responsibility.problem2;


// ▬ "Implements" the "ChainOfResponsibility" Interface ▬
public class Dollar10 implements MoneyDistributor {

    // ▼ Create a "MoneyDistributor" Object/Instance ▼
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
        //      → is "Greater" or "Equal" to "10 Dollars" ▼
        if (currency.getAmount() >= 10) {

            // ▼ Distribute the "Currency Amount" ▼
            int number = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;

            System.out.println("Dispensing " + number + " 10$ note");

            // ▼ Distribute the Remainder ▼
            if (remainder != 0) {
                this.chain.distribute(new Currency(remainder));
            }
        }  else {
            System.out.println("No bills less then 10 dollars!");
        }
    }
}
