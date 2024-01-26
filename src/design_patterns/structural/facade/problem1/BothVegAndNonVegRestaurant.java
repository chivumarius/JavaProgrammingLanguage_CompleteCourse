package design_patterns.structural.facade.problem1;


// ▬ "Implementation" of "Hotel" Interface ▬
public class BothVegAndNonVegRestaurant implements Hotel {

    // ▬ The "getMenus()" Method ▬
    @Override
    public Menus getMenus() {
        // ▼ Create the "BothVegAndNonVegMenus" Object ▼
        BothVegAndNonVegMenus bothVegAndNonVeg = new BothVegAndNonVegMenus();

        return bothVegAndNonVeg;
    }
}
