package design_patterns.creational.prototype.problem2;


// ▬ "Implements" the "Color" Interface ▬
public class RedColor implements Color {

    // ▼ "Initialized Property" ▼
    private String colorName = "Red";




    // ▬ The "getColorName()" Getter Meth ▬
    public String getColorName() {
        return colorName;
    }


    // ▬ The "setColorName()" Setter Meth ▬
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }



    // ▬ The "applyColor()" Override Meth ▬
    @Override
    public void applyColor() {
        System.out.println("Applying " + colorName + " color");
    }


    // ▬♦▬ Cloning the "Object"
    //          → Inside the "Object Itself" ▬♦▬
    // ▬ The "clone()" Override Meth ▬
    @Override
    public Color clone() {
        // ▼ "Creating" a "Color" Object of "RedColor" Type ▼
        RedColor newColor = new RedColor();
        newColor.setColorName("RED");
        newColor.applyColor();

        return newColor;
    }
}
