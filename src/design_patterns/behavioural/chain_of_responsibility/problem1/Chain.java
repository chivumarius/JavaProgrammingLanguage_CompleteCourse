package design_patterns.behavioural.chain_of_responsibility.problem1;


// ▬ [1] "ChainOfResponsibility" Interface ▬
public interface Chain {

    // ▬ "Methods" ▬
    void setNextChain(Chain nextChain);
    void calculate(Numbers request);
}
