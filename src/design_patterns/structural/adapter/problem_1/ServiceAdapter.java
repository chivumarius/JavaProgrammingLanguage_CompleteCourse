package design_patterns.structural.adapter.problem_1;



// ▬ ""Service" Interface ▬
//      → in which the "speedKPH()" Method is Defined ▬
public interface ServiceAdapter {

    // ▬ The "speedKPH()" Method ▬
    int speedKPH();


    // ▬ The "toString()" Method ▬
    String toString();
}
