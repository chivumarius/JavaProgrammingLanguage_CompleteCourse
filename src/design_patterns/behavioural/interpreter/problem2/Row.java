package design_patterns.behavioural.interpreter.problem2;


// ▬ [3] "Row" Class (for "Table") ▬
public class Row {

    // ▼ "Properties" for "Columns" ▼
    private String firstName;
    private String lastName;


    // ▬ "Constructor" ▬
    public Row(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // ▬ The "toString()" Override Method ▬
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
