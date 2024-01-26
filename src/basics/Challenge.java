package basics;/*
       ______________________
       - CODING CHALLENGE 1 -
       ______________________


    ♦ Write a "Java Program"
        → that "Allow" the "User"
        → to "Enter" his "Weight" and "Height",
        → and "Display" the "Body Mass Index" ("BMI")
        → for this "User".



    ♦ The "Formula" is:
        → BMI = kg/m2
        → where "kg" is a "Person’s Weight" in "Kilograms"
        → and "m2" is their "Height" in "Metres Squared".
*/


import java.util.Scanner;

public class Challenge {

    // ▬ First Run Method ▬
    public static void main(String[] args) {

        // ▼ "DISPLAYING" THE "1ST MESSAGE" FOR "USER" ▼
        System.out.println("Please Enter Your Weight in Kilograms: ");

        // ▼ INITIALISE "SCANNER" CLASS ▼
        Scanner scanner = new Scanner(System.in);

        // ▼ "GETTING" & "STORING" THE "WEIGHT VALUE ENTERED" BY THE "USER" ▼
        float weight = scanner.nextFloat();


        // ▼ "DISPLAYING" THE "2ND MESSAGE" FOR "USER" ▼
        System.out.println("Please Enter Your Height IN Meters: ");


        // ▼ "GETTING" & "STORING" THE "HEIGHT VALUE ENTERED" BY THE "USER" ▼
        float height = scanner.nextFloat();


        // ▼ "SOLUTION" ▼
        float bmi = weight/(height * 2);

        // ▼ CONSOLE DISPLAY ▼
        System.out.println("BMI = " + bmi );
    }
}
