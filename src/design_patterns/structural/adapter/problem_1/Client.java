
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "STRUCTURAL DESIGN PATTERNS" •
          ________________________________
                  
                ► "ADAPTER" ◄
                - "PROBLEM 1" -





    Problem 1:

        ▬ We have a luxury "Car Factory"
            → that "Produces"
            → "3 Types" of "Vehicles".


        ▬ "All" of these "Cars"
            → "Display" the "Speed"
            → in "MPH" ("Miles" per "Hour").


        ▬ This "Factory"
            → "Needs" to "Display"
            → the "Speed" in "KMH" ("Kilometers" per "Hour"),
            → "Without  Changing" these "Code"
            → for the "Middle East Countries".



        ▬ We "Don't Need"
            → to "Change" in the "Code" of "Application",


        ▬ We "Need"
            → to "Communicate"
            → with "Vehicle Object"
            → and "Get" the "Speed"
            → in "MPH" or "KMH".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.structural.adapter.problem_1;



public class Client {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {


        // ▼ Create a "Vehicle" Object
        //      → by using "Polymorphism" ▼
        Vehicle vehicle1 = new Maserati();  // ► Display "Speed" in "MPH" ◄
        Vehicle vehicle2 = new MaseratiAdapter();  // ► Display "Speed" in "KMH" ◄


        // ▼ Display the "Object" ▼
        System.out.println(vehicle1); // ► "Miles Per Hour" ◄
        System.out.println(vehicle2); // ► "Kilometers Per Hour" ◄
    }
}
