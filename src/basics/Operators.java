package basics;

public class Operators {

    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        int x = 5;
        int y = 10;

        // ▼ "OPERATORS" ▼
        int addition  = x + y;
        int subtraction = x - y;
        int multiplication = x* y;
        float division = (float) x / y;  // ► "Casting" the "Expression" as a "Float"


        System.out.print("\n" + "• Addition : " + addition  + "\n");
        System.out.print("\n" + "• Subtraction: " + subtraction + "\n");
        System.out.print("\n" + "• Multiplication: " + multiplication + "\n");
        System.out.print("\n" + "• Division: " + division + "\n");
    }
}
