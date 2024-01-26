package design_patterns.behavioural.chain_of_responsibility.problem1;

// ▬ [2] "Numbers" Class ▬
public class Numbers {

    // ▼ Properties ▼
    private int number1;
    private int number2;
    private String operationName;


    //  ▬ "Constructor" ▬
    public Numbers(int number1, int number2, String operationName) {
        this.number1 = number1;
        this.number2 = number2;
        this.operationName = operationName;
    }


    // ▬ "Getter" → for the "Number1" Property ▬
    public int getNumber1() {
        return number1;
    }


    // ▬ "Getter" → for the "Number2" Property ▬
    public int getNumber2() {
        return number2;
    }


    // ▬ "Getter" → for the "OperationName" Property ▬
    public String getOperationName() {
        return operationName;
    }
}
