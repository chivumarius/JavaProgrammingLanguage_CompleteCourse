package design_patterns.structural.facade.problem1;


// "Extends" the "Menus" Class
public class BothVegAndNonVegMenus extends Menus {

    // ▬ "Constructor" ▬
    public BothVegAndNonVegMenus() {
        super("Crispy Baked Falafel" + "\n" + "Grilled Chicken Escalope");
    }
}
