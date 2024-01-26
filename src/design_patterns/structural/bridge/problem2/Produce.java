package design_patterns.structural.bridge.problem2;



// ▬ Concrete "Implementation 1" for "Bridge Pattern" ▬
public class Produce implements Workshop {

    // ▬ The "work()" Override Method ▬
    @Override
    public void work(){
        System.out.print("Produced");
    }
}
