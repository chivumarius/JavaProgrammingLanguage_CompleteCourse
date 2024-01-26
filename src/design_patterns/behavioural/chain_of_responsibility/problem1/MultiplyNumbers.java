package design_patterns.behavioural.chain_of_responsibility.problem1;


// ▬ [1-3] "Multiplication" Operation
//          → "Implements" the "ChainOfResponsibility" Interface ▬
public class MultiplyNumbers implements Chain {

    // ▼ "ChainOfResponsibility" Object/Instance ▼
    private Chain nextIntChain;


    // ▬ The "setNextChain()" Override Method ▬
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextIntChain = nextChain;
        System.out.println("Passing to the Next ChainOfResponsibility after Multiplication");
    }


    // ▬ The "calculate()" Override Method ▬
    @Override
    public void calculate(Numbers request) {

        // ▼ If the "Operation Name" is "Multiply" ▼
        if(request.getOperationName().equals("multiply")){

            // ▼ Print the "Result" ▼
            System.out.println(
                    request.getNumber1() + " * "
                    + request.getNumber2()  + " = "
                    + (request.getNumber1() * request.getNumber2())
            );
        } else {
            nextIntChain.calculate(request);
        }
    }
}
