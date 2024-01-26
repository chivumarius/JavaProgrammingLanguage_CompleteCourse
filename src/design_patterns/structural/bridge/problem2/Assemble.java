package design_patterns.structural.bridge.problem2;


// ▬ Concrete "Implementation 2" for "Bridge Pattern" ▬
class Assemble implements Workshop {

    // The "work()" Override Method
    @Override
    public void work(){
        System.out.print(" And Assembled.");
    }
}