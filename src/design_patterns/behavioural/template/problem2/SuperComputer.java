package design_patterns.behavioural.template.problem2;


// ▬ "Extends" the "ComputerTemplate" Class ▬
public class SuperComputer extends ComputerTemplate {

    // ▬ The "buildComputer()" Override Method ▬
    @Override
    public void buildMotherboard() {
       System.out.println("Motherboard - GIGABYTE Z790 AORUS Elite AX · ASUS ROG Maximus Z790 Hero");
    }


    // ▬ The "buildComputer()" Override Method ▬
    @Override
    public void buildCPU() {
        System.out.println("CPU - Intel Core i9-13900K");
    }


    // ▬ The "buildComputer()" Override Method ▬
    @Override
    public void buildHDD() {
        System.out.println("HDD - Seagate BarraCuda 8TB SATA3 7200RPM 256MB");
    }


    // ▬ The "buildComputer()" Override Method ▬
    @Override
    public void buildGraphics() {
        System.out.println("Graphics - NVIDIA GeForce RTX 3080");
    }
}
