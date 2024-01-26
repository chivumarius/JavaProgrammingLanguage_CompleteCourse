
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
               • "EXERCISE SETS" •
             ► "LOTTERY PROGRAM" ◄




    Requirements:

        • Write a "Java Program"
            → that should "Randomly Generate"
            → a "Winning Lottery Ticket".

            • "Prompt" the "Player"
                → to Enter "Lotto Numbers"
                → from "1" to "40".

            • "Depending"
                → on How Many "Numbers Match",
                → the "Player" Wins "Various Prizes".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package collections.set;


import java.util.*;


public class Ex_Sets_Lottery_Program {

    // ▼ "Constants" ▼
    public static final int NUMBERS = 6;
    public static final int MAX_NUMBERS = 40;
    public static final int PRIZE = 100;



    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ (3) Calling the "Methods"
        //          → for "Getting"
        //          → the "Winning Number" and
        //          → "Ticket Sets" ▼
        Set<Integer> winning = createWinningNumbers();
        Set<Integer> ticket  = getTicket();


        // ▼ (4-1) "Creating" a "Integer Set" of Type "TreeSet" ▼
        Set<Integer> matches = new TreeSet<>(ticket);


        // ▼ (4-2) "Keeping"
        //          → Only "Winning Numbers"
        //          → from "User's Ticket".
        //          → using "retainAll()"
        //          → to "Remove Non Common Members" ▼
        matches.retainAll(winning);


        // ▼ (5-1) "Displaying" the "Message" in the "Console" ▼
        System.out.println("Your ticket was: " +ticket);
        System.out.println("Winning Numbers: " +winning);


        // ▼ (5-2) "Checking": If "There's a "Match"" ▼
        if (matches.size() > 0){

            // ▼ "Calculating" the "Prize" ▼
            double prize = PRIZE  * Math.pow(2, matches.size());

            // ▼ "Displaying" the "Message" in the "Console" ▼
            System.out.println("Matched Numbers: " +matches);
            System.out.printf("Your prize is $%.2f\n", prize);
        }
    }



    // ▬ (1) The "createWinningNumbers()" Method
    //      → to "Generate" a "Set"
    //      → of the "Winning Lotto Numbers"  ▬
    public static Set<Integer> createWinningNumbers(){

        // ▼ "Creating" a "Integer Set" of Type "TreeSet" ▼
        Set<Integer> winning = new TreeSet<>();

        // ▼ "Generating" a "Random Number" ▼
        Random random = new Random();

        // ▼ "Adding" the "Numbers" to the "Set" ▼
        while(winning.size() < NUMBERS){
            // ▼ "Generating" a "Random Number" ▼
            int number = random.nextInt(MAX_NUMBERS) + 1;

            // ▼ "Adding" the "Number" to the "Set" ▼
            winning.add(number);
        }

        // ▼ "Returning" the "Set" ▼
        return winning;
    }




    // ▬ (2) The "getTicket()" Method
    //          → to "Read" the "Player's Lottery Ticket"
    //          → from the "User" ▬
    public static Set<Integer> getTicket(){

        // ▼ "Creating" a "Integer Set" of Type "TreeSet" ▼
        Set<Integer> ticket = new TreeSet<>();


        // ▼ "Creating" an "Scanner" Object
        //      → from "Scanner" Class
        //      → for "Storing" the "Entered Numbers" ▼
        Scanner scanner = new Scanner(System.in);

        // ▼ "Displaying" the "Message" in the "Console" ▼
        System.out.println("Enter " + NUMBERS + " Lotto numbers: ");


        // ▼ "Adding" the "6 Numbers" to the "Set" ▼
        while (ticket.size() < NUMBERS){

            // ▼ "Getting" & "Storing"
            //      → the "Entered Numbers" from the "User" ▼
            int number = scanner.nextInt();

            // ▼ "Adding" the "Number" to the "Set" ▼
            if (number <= MAX_NUMBERS)
                ticket.add(number);
        }

        // ▼ "Returning" the "Set" ▼
        return ticket;
    }
}