/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                • "OOP" •
             ► "CLASS COMPOSITION" ◄




    ▬ The "Composition"
        →  is "Used" to "Implement"/"Design"
        → a "has-a" Relationship (ex. "Car"  has-a "Engine").


    ▬ The "Inheritance"
        → is "Used" to "Implement"/"Design"
        → a "is-a" Relationship (ex. "Car"  is-a "Vehicle").

        ________________________________________
                Vehicle
         is-a     ↓         ←  "INHERITANCE"
                "Car"
         has-a    ↓        ←  "COMPOSITION"
                Engine
        ________________________________________


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package oop.composition;




public class Point {

    // ▼ Instance Variables ▼
    int x;
    int y;


    // ▬ "Constructor" ▬
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    // ▬ "Getter" Method for "x" ▬
    public int getX() {
        return x;
    }

    // ▬ "Setter" Method for "x" ▬
    public void setX(int x) {
        this.x = x;
    }



    // ▬ "Getter" Method for "y" ▬
    public int getY() {
        return y;
    }

    // ▬ "Setter" Method for "y" ▬
    public void setY(int y) {
        this.y = y;
    }



    // ▬ "toString" Method ▬
    @Override
    public String toString() {
        return "Point{ " +
                "x =" + x +
                ", y = " + y +
                '}';
    }
}
