package design_patterns.creational.builder.problem1;



// ▬ "Builder" ("Abstract" Class)
//      → allows us to "Combine"
//      → the "Meat" and the "Sauce"
//      → to "Produce" the "Sandwich" ▬
public abstract class SandwichBuilder {

    // ▼ Creating an "Instance"/"Object
    //      → from" "Sandwich" ▼
    Sandwich sandwich;




    // ▬ The "createSandwich()" Method ▬
    public void createSandwich() {
        // ▼ Creating the "Sandwich" ▼
        sandwich = new Sandwich();

        // ▼ Calling the "Methods" ▼
        buildMeat();
        buildSauce();

        System.out.println(
                "Sandwich Created! "
                + sandwich.getSauce()
                + " + "
                + sandwich.getMeat()
        );
    }



    // ▬ The "buildMeat()" Abstract Method ▬
    public abstract void buildMeat();


    // ▬ The "buildSauce()" Abstract Method ▬
    public abstract void buildSauce();
}
