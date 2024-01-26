package design_patterns.creational.builder.problem1;

// ▬ "Sandwich" Class ▬
public class Sandwich {

    // ▼ "Objects" ▼
    Meat meat;
    Sauce sauce;




    // ▬ "Getter" → for "Meat" Property ▬
    public Meat getMeat() {
        return meat;
    }

    // ▬ "Setter" → for "Meat" Property ▬
    public void setMeat(Meat meat) {
        this.meat = meat;
    }



    // ▬ "Getter" → for "Sauce" Property ▬
    public Sauce getSauce() {
        return sauce;
    }

    // ▬ "Setter" → for "Sauce" Property ▬
    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }
}
