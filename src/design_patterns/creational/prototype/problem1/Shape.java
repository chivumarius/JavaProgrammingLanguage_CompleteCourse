package design_patterns.creational.prototype.problem1;

// ▬▬ "Prototype" Pattern ▬▬
// ▬ "Abstract" Class ▬
public abstract class Shape {

    // ▼ "Properties" ▼
    int x;
    int y;
    int translationX;
    int translationY;



    // ▬ "Constructor" ▬
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.translationX = 3 + x;
        this.translationY = 2 + y;
    }



    // ▬ "Getter" → for "x" Translation ▬
    public int getTranslationX() {
        return translationX;
    }


    // ▬ "Getter" → for "y" Translation ▬
    public int getTranslationY() {
        return translationY;
    }



    // ▬ The "clone()" Method ▬
    public abstract Shape clone();
}
