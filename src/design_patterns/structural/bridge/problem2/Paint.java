package design_patterns.structural.bridge.problem2;

// ▬ Concrete "Implementation 3" for "Bridge Pattern" ▬
public class Paint implements Workshop {

    // ▬ The "work()" Override Method ▬
    @Override
    public void work(){
        System.out.print(" is Painted");
    }
}
