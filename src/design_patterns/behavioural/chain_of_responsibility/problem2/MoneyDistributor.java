package design_patterns.behavioural.chain_of_responsibility.problem2;

// ▬ "Chain" - "Base Interface" ▬
public interface MoneyDistributor {

    // ▬ "Methods" ▬
    void setNextChain(MoneyDistributor nextChain);
    void distribute(Currency currency);
}
