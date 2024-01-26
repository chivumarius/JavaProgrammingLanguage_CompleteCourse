package design_patterns.creational.builder.problem2;

// ▬ "Sandwich" Class ▬
public class Sandwich {

    // ▬♦▬ "Creating" the "Connections" with "Other Classes" ▬♦▬
    // ▼ "Objects" ▼
    Meat meat;          // ► "Connection" → between "Sandwich" and "Meat" ◄
    Sauce sauce;        // ► "Connection" → between "Sandwich" and "Sauce ◄
    Delivery delivery;  // ► "Connection" → between "Sandwich" and "Delivery" ◄




    // ▬ "Getter" → for "Delivery" Property ▬
    public Delivery getDelivery() {
        return delivery;
    }

    // ▬ "Setter" → for "Delivery" Property ▬
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }




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
