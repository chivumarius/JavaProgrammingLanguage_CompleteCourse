/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • EXERCISE 28 •
         ► "METEOROLOGIST SYSTEM" ◄



    ▬ A "Meteorologist"
        → would "Like"
        → to "Make Statistics"
        → on "Temperatures' Statements"
        → during "7 Days".


    ▬ To "Do So",
        → he will "Record Temperatures"
        → at the "Times":
            •► "10 H",
            •► "14 H",
            •► "17 H" and
            •► "20 H".


    ▬ A "Statement" of "Temperatures"
        → on "7 Days"
        → will be "Stored"
        → in a "Double-Dimension Array"
        → of "Double"
        → where:
            •► "Rows"
                → "Indicate" the "Days" and
            •► "Columns"
                → "Indicate" the "Times".



    ▬ To "Facilitate Things",
        → we "Find it Suitable"
        → to "Refer":
            •► "Monday" by the "Integer" - "0",
            •► "Tuesday" by "1",
            •► "Wednesday" by "2",
            •► and "So On".


    ▬ We "Adopt" the Following "Declarations"
        → as "Static Class Variables":
    ________________________________________
        static String[] jours = {
            "monday",
            "tuesday",
            "wednesday",
            "thursday",
            "friday",
            "saturday",
            "sunday"
        }:
    ________________________________________




    (Q1) Write a "GetDay()" Method
            → that "Takes" in "Parameter"
            → a "Week Day" (Monday, Tuesday, ...)
            → and "Returns" the "Integer"
            → that "Corresponds"
            → to that "Day"
            → between "0" and "6".


        • If the "Day"
            → is "Not Equal"
            → to "Any" of the "Week Days",
            → we consider "Monday".




    (Q2) Write a "EnterTemp()" Method
            → that allows "Entering"
            → a "Statement" of "Temperatures"
            → for "7 Days"
            → from the "Keyboard".



    (Q3) Write a "AverageDayTemp()" Method
            → that "Calculates"
            → the "Average" of "Temperatures"
            → for "One Week Day"
            → "Given" in the "Parameter"
            → of the "Method" (in "Letters").



    (Q4) Write a "HottestDays()" Method
            → that Returns
            → (as an "Array" containing the "Names" of "Week Days")
            → the "Week Days"
            → having an "Average Temperature"
            → "Equals" or "Greater"
            → than the "Temperature Given"
            → in the "Parameter" of the "Method".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package exercises;


import java.util.Scanner;

public class Ex28_Meteorologist_System {

    // ▼ "String Array" ▼
    static String[] days = {
            "monday",
            "tuesday",
            "wednesday",
            "thursday",
            "friday",
            "saturday",
            "sunday"
    };


    // ▼ "2D Array" of "Double" Type ▼
    static double[][] temps = new double[7][4];



    // ▬ (Q1) The "EnterDay()" Method ▬
    public static int EnterDay(String j) {

        // ▼ "Looping" through the "Days Array" ▼
        for(int i = 0; i < days.length; i++) {

            // ▼ "Comparing" the "String" to the "Day" ▼
            if (j.toLowerCase().equals(days[i])) {
                // ▼ "Returning" the "Integer" ▼
                return i;
            }
        }

        // ▼ "Returning" "0" for "Monday" ("Default Day") ▼
        return 0;
    }




    // ▬ (Q2) The "EnterTemp()" Method ▬
    public static void EnterTemp() {

        // ▼ "Creating" the "Scanner" Object ▼
        Scanner scanner = new Scanner(System.in);


        // ▼ "Looping" through the "Days Array" ▼
        for(int i = 0; i < temps.length; i++) {
            for(int j = 0; j < temps[i].length; j++) {
                System.out.print("Temp[" + i + "] [" + j + "]: ");

                // ▼ "Storing" the "User Input" ▼
                temps[i][j] = scanner.nextDouble();
            }
        }
    }




    // ▬ (Q3) The "AverageDayTemp()" Method ▬
    public static double AverageDayTemp(String j) {

        // ▼ "Detecting" the "Day" ▼
        int n = EnterDay(j);

        // ▼ "Calculating" the "Average" ▼
        double s = 0.0;

        // ▼ "Looping" through the "Temperatures Array" ▼
        for(int i = 0; i < temps[n].length; i++) {
            s += temps[n][i];
        }

        // ▼ "Returning" the "Average" ▼
        return s / temps[n].length;
    }




    // ▬ (Q4) The "HottestDays()" Method ▬
    public static String[] HottestDays(double t) {

        // ▼ "Creating" the "String Array" ▼
        String[] jp = new String[temps.length];

        int j = 0;

        // ▼ "Looping" through the "Temperatures Array" ▼
        for(int i = 0; i < temps.length; i++) {
            if (AverageDayTemp(days[i]) >= t) {
                // ▼ "Storing" the "Day" ▼
                jp[j++] = days[i];
            }
        }

        // ▼ "Returning" the "Array" ▼
        return jp;
    }
}
