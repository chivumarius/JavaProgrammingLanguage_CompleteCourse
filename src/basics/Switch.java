package basics;

public class Switch {


    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ "VARIABLE" ▼
        int i = 10;


        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ -
        // ▬ "SWITCH(){CASE 1, CASE N, DEFAULT }" ▬
        switch (i){
            case 1:
                System.out.println("Code 1");
                break;
            case 5:
                System.out.println("Code 5");
                break;
            default:
                System.out.println("Code 7");
        }



        System.out.println("\n" + "Similar to: " + "\n");



        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ -
        // ▬ "SIMILAR" TO  "CONDITIONAL STATEMENTS" ▬
        int j = 10;
        if(j < 5) {
            // ▼ "EXECUTE" THIS "CODE 1" ▼
            System.out.println("Code 1");

            // ▬ (3) "ELSE{ ... }" ▬
        } else if (j == 5){
            // ▼ "EXECUTE" THIS "CODE 3" ▼
            System.out.println("Code 5");
        }  else {
            // ▼ "EXECUTE" THIS "CODE 3" ▼
            System.out.println("Code 7");
        }
    }
}
