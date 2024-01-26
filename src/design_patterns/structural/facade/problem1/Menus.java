package design_patterns.structural.facade.problem1;


// ▬ "Abstract Class" ▬
public abstract class Menus {

    // ▼ Property ▼
    private String menu;


    // ▬ "Constructor" ▬
    public Menus(String menu) {
        this.menu = menu;
    }


    // ▬ The "getMenu()" Method ▬
    public String getMenu() {
        return menu;
    }
}
