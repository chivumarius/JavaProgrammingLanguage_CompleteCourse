package basics;

public class ConditionalStatementsIfElse {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ "VARIABLE" ▼
        int i = 5;


        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ -
        // ▬ "CONDITIONAL STATEMENTS" ▬

        // ▬ (1) "IF(CONDITION){ ... }" ▬
        if(i < 5) {
            // ▼ "EXECUTE" THIS "CODE 1" ▼
            System.out.println("Code 1");
        }


        // ▬ (2) "ELSE IF(CONDITION){ ... }" ▬
        else if (i > 5) {
            // ▼ "EXECUTE" THIS "CODE 2" ▼
            System.out.println("Code 2");
        }


        // ▬ (3) "ELSE IF(CONDITION){ ... }" ▬
//        else if (i == 5) {
//            // ▼ "EXECUTE" THIS "CODE 3" ▼
//            System.out.println("Code 3");
//        }


        // ▬ (3) "ELSE{ ... }" ▬
        else {
            // ▼ "EXECUTE" THIS "CODE 3" ▼
            System.out.println("Code 4");
        }
    }

}
