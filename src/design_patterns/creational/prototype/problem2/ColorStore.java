package design_patterns.creational.prototype.problem2;


import java.util.HashMap;
import java.util.Map;

// ▬♦▬ Creating Duplicates of Colors abd Store Them ▬♦▬
public class ColorStore {

    // ▼ "Creating" a "Map" Object of "HashMap" Type
    //      → for Storing the "Colors" ▼
    Map<String, Color> colorMap = new HashMap<>();



    // ▬ The "duplicateColors()" Method ▬
    public void duplicateColors(Color color) {
        // ▬♦▬ "Cloning" the "Color" ▬♦▬
        RedColor newColor = (RedColor) color.clone();


        // ▼ Adding the "Duplicates Colors" to the "Map" ▼
        colorMap.put("Red", newColor);
    }
}
