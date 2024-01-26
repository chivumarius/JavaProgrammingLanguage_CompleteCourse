package design_patterns.structural.bridge.problem1;

// ▬ This "Implements" the "Color" Interface ▬
public class RedColor implements Color{

    // ▬ The "applyColor()" Override Method ▬
    @Override
    public void applyColor() {
        System.out.println("RedColor");
    }
}
