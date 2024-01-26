package design_patterns.structural.facade.problem1;


// ▬ "Implementation" of "Hotel" Interface ▬
public class VegRestaurant implements Hotel {

    // ▬ The "getMenus()" Override Method ▬
    @Override
    public Menus getMenus() {
        // ▼ Create the "VegMenu" Object ▼
        VegMenu vegMenu = new VegMenu();
        return vegMenu;
    }
}
