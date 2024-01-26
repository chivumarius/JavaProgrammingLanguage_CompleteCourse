/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "STRUCTURAL DESIGN PATTERNS" •
          ________________________________

                ► "FACADE" ◄
               - "PROBLEM 1" -




  Problem 1:

    • Let's "Consider"
        → a "Hotel"
        → where there are "Several Restaurants":
            •► Veg Restaurants,
            •► Non-Veg Restaurants and
            ► Both Restaurants.



    • This "Hotel"
        → has a "Hotel Keeper".


    • You, as "Client"
        → want "Access" to "Different Menus"
        → of "Different Restaurants".


     • You do Not Know
        → "What Are" the "Different Menus"
        → they have.


    • You just "Have Access"
        → to Hotel Keeper
        → who "Knows" his "Hotel" well.


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.structural.facade.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunFacadePattern();
    }


    // ▬ The "RunFacadePattern()" Method ▬
    private static void RunFacadePattern() {
        System.out.println("\n");

        // ▼ Create a "Hotel Keeper" Object ▼
        HotelKeeper hotelKeeper = new HotelKeeper();


        // ▼ (1) "Requesting" the "Veg Menu" from the "Hotel Keeper" ▼
        VegMenu vegMenu = hotelKeeper.getVegMenu();
        // ▼ Print the "Veg Menu" ▼
        System.out.println(vegMenu.getMenu());


        System.out.println("\n");


        // ▼ (2) "Requesting" the "NonVeg Menu" from the "Hotel Keeper" ▼
        NonVegMenu nonVegMenu = hotelKeeper.getNonVegMenu();
        // ▼ Print the "Veg Menu" ▼
        System.out.println(nonVegMenu.getMenu());


        System.out.println("\n");


        // ▼ (3) "Requesting" the "All"/"BothVegAndNonVeg Menus" from the "Hotel Keeper" ▼
        BothVegAndNonVegMenus bothVegAndNonVegMenus = hotelKeeper.getBothVegAndNonVegMenu();
        // ▼ Print the "All Menus" ▼
        System.out.println(bothVegAndNonVegMenus.getMenu());
    }
}
