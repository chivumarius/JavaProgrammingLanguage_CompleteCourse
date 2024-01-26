/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                • EXERCISE 20 •
    ► "MILLISECONDS" TO "DAYS", "HOURS", "MINUTES" ◄



  Requirements:

        • Write a java program 
            → that "Reads"
            → a "Positive Integer" Value "t"
            → that represents "Number"
            → of "Milliseconds".


            ▬ It "Calculates" and "Displays"
                → the "Equivalent"
                → of "Seconds".



            ▬ "Knowing" that:
                ► a "Day" is "24 Hours",
                ► an "Hour" is "60 Minutes",
                ► a "Minute" is "60 Seconds" and
                ► a "Second" is "1000 Milliseconds".


    • "Note":
        → "t" is a "Positive Integer" Value of "Long"
        → with a "Maximum" value "Formed"
        → of "10 Digits" - "9999999999"


        ▬ "Think" of "Using"
            → the Operators "%" and "/"
            → to "Obtain" the "Result".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;


import java.util.Scanner;



public class Ex20_Milliseconds_to_Days_Hours_Minutes {


    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "Variables" ▼
        long t;
        long days, hours, minutes, seconds, millis;
        final long max = 9999999999L;


        // ▼ "Creating" an "Scanner" Object
        //      → for "Getting" the "Entered Data"
        //      → from "User" ▼
        Scanner scanner = new Scanner(System.in);



        // ▼ "Do{} While{}" Loop
        //      → that "Allow Validation"
        //      → of "Entered Numbers"
        //      → between "5" and "15" ▼
        do {
            // ▼ "Message" for "User" ▼
            System.out.println("Enter Number in Milliseconds: ");

            // ▼ "Getting" & "Storing" the "Entered Value"
            t = scanner.nextLong();

        } while (t < 0 || t > max);



        // ▼ "Calculating" the "Millis" ▼
        millis = t % 1000;
        t /= 1000;     // ► t = t / 1000  →  "t" is in "Seconds"


        // ▼ "Calculating" the "Seconds" ▼
        seconds = t % 60;
        t /= 60;       // ► "t" is in "Minutes"


        // ▼ "Calculating" the "Minutes" ▼
        minutes = t % 60;
        t /= 60;       // ► "t" is in "Hours"


        // ▼ "Calculating" the "Hours" ▼
        hours = t % 24;


        // ▼ "Calculating" the "Days" ▼
        days = t / 24;



        // ▼ "Displaying" the "Results" ▼
        System.out.println("Days: "+days);
        System.out.println("Hours: "+hours);
        System.out.println("Minutes: "+minutes);
        System.out.println("Seconds: "+seconds);
        System.out.println("Millis: "+millis);
    }
}
