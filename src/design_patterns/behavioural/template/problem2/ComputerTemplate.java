package design_patterns.behavioural.template.problem2;


// ▬ "Template" Core ▬
public abstract class ComputerTemplate {

    // ▬♦▬ "Template Method" ▬♦▬
    // ▬ "Final Method"
    //      → that "Cannot" be "Overridden"
    //      → by S"ub-Classes" ▬
    public final void buildComputer() {
        buildMotherboard();
        buildCPU();
        buildHDD();
        buildGraphics();

        System.out.println("Computer is built!");
    }



    // ▬♦▬ Steps to Follow ▬♦▬
    // ▼ "All" the "Methods"
    //      → will be "Abstract"
    //      → because they are "Different" (Non-Common) ▼

    public abstract void buildMotherboard();
    public abstract void buildCPU();
    public abstract void buildHDD();
    public abstract void buildGraphics();

}
