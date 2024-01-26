package design_patterns.behavioural.template.problem2;

// ▬ "Extends" the "ComputerTemplate" Class ▬
public class StandardComputer extends ComputerTemplate {

    // ▬ The "buildComputer()" Override Method ▬
    @Override
    public void buildMotherboard() {
        System.out.println("Standard Motherboard");
    }


    // ▬ The "buildComputer()" Override Method ▬
    @Override
    public void buildCPU() {
        System.out.println("CPU - Intel Core i7");
    }


    // ▬ The "buildComputer()" Override Method ▬
    @Override
    public void buildHDD() {
        System.out.println("HDD - 1 TB");
    }


    // ▬ The "buildComputer()" Override Method ▬
    @Override
    public void buildGraphics() {
        System.out.println("Graphics - None");
    }
}
