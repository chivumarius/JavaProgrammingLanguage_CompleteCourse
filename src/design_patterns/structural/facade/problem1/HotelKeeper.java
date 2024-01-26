package design_patterns.structural.facade.problem1;


// ▬ The "Facade" Class ▬
public class HotelKeeper {

    // ▬ The "getVegMenu()" Method ▬
    public VegMenu getVegMenu() {
        // ▼ Create the "VegMenu" Object ▼
        VegRestaurant vegRestaurant = new VegRestaurant();

        // ▼ "Getting" All "Vegetarian Menus"
        //      → from the "Vegetarian Restaurant" ▼
        VegMenu vegMenu = (VegMenu) vegRestaurant.getMenus();

        return vegMenu;
    }




    // ▬ The "getNonVegMenu()" Method ▬
    public NonVegMenu getNonVegMenu() {
        // ▼ Create the "NonVegMenu" Object ▼
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();

        // ▼ "Getting" All "Non Vegetarian Menus"
        //      → from the "Non Vegetarian Restaurant" ▼
        NonVegMenu nonVegMenu = (NonVegMenu) nonVegRestaurant.getMenus();

        return nonVegMenu;
    }



    // ▬ The "getBothVegAndNonVegMenu()" Method ▬
    public BothVegAndNonVegMenus getBothVegAndNonVegMenu() {
        // ▼ Create the "BothVegAndNonVegMenus" Object ▼
        BothVegAndNonVegRestaurant bothVegAndNonVegRestaurant = new BothVegAndNonVegRestaurant();

        // ▼ "Getting" All "Both Vegetarian and Non Vegetarian Menus"
        //      → from the "Both Vegetarian and Non Vegetarian Restaurant" ▼
        BothVegAndNonVegMenus bothVegAndNonVegMenu = (BothVegAndNonVegMenus) bothVegAndNonVegRestaurant.getMenus();

        return bothVegAndNonVegMenu;
    }
}
