package design_patterns.behavioural.template.problem1;


// ▬ "TEMPLATE" CORE ▬
public abstract class HouseTemplate {

    // ▬♦▬ "TEMPLATE METHOD" ▬♦▬
    // ▬ "Final Method"
    //      → that "Cannot" be "Overridden"
    //      → by S"ub-Classes" ▬
    public final void buildHouse() {
        // ▼ "Calling" in "Order" → "All" the "Methods" ▼
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();

        System.out.println("The house is built!");
    }



    // ▬ The "buildFoundation()" Method
    //      → has "Common Steps"
    //      → to "All" the "Houses" ▬
    private void buildFoundation() {
        System.out.println("Building Foundation with Cement, Sand and Gravel");
    }



    // ▬ The "buildPillars()" Method
    //      → may have "Different Steps"
    //      → between "Houses" ▬
    public abstract void buildPillars();



    // ▬ The "buildWalls()" Method
    //      → may have "Different Steps"
    //      → between "Houses" ▬
    public abstract void buildWalls();



    // ▬ The "buildWindows()" Method
    //      → has "Common Steps"
    //      → to "All" the "Houses" ▬
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }
}
