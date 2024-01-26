package design_patterns.behavioural.chain_of_responsibility.problem1;


// ▬ [1-2] "Subtraction" Operation
//          → "Implements" the "ChainOfResponsibility" Interface ▬
public class SubtractNumbers implements Chain {

    // ▼ "ChainOfResponsibility" Object/Instance ▼
    private Chain nextInChain;


    // ▬ The "setNextChain()" Override Method ▬
    @Override
    public void setNextChain(Chain nextChain) {

        this.nextInChain = nextChain;
        System.out.println("Passing to the Next ChainOfResponsibility after Subtraction");
    }


    // ▬ The "calculate()" Override Method ▬
    @Override
    public void calculate(Numbers request) {

        // ▼ If the "Operation Name" is "Subtract" ▼
        if(request.getOperationName().equals("subtract")){

            // ▼ Print the "Result" ▼
            System.out.println(
                    request.getNumber1() + " - "
                    + request.getNumber2() + " = "
                    + (request.getNumber1() - request.getNumber2())
            );
        } else {
            nextInChain.calculate(request);
        }
    }
}
