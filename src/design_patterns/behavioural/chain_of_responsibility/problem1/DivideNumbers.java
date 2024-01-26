package design_patterns.behavioural.chain_of_responsibility.problem1;


// ▬ [1-4] "Division" Operation
//          → "Implements" the "ChainOfResponsibility" Interface ▬
public class DivideNumbers implements Chain {

    // ▼ "ChainOfResponsibility" Object/Instance ▼
    private Chain nextInChain;


    // ▬ The "setNextChain()" Override Method ▬
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
        System.out.println("Ending the ChainOfResponsibility after Division");
    }


    // ▬ The "calculate()" Override Method ▬
    @Override
    public void calculate(Numbers request) {

        // ▼ If the "Operation Name" is "Divide" ▼
        if(request.getOperationName().equals("divide")){
            System.out.println(
                    request.getNumber1() + " / "
                    + request.getNumber2()  + " = "
                    + (request.getNumber1() / request.getNumber2())
            );
        } else {
            System.out.println("There is no Next Operation!");
        }
    }
}
