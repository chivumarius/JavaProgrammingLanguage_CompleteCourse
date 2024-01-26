package design_patterns.structural.facade.problem1;


// ▬ "Implementation" of "Hotel" Interface ▬
public class NonVegRestaurant implements Hotel {

    // ▬ The "getMenus()" Override Method ▬
    @Override
    public Menus getMenus() {

        // ▼ Create the "NonVegMenu" Object ▼
        NonVegMenu nonVeg = new NonVegMenu();

        return nonVeg;
    }
}
