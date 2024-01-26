package design_patterns.structural.proxy.problem2;


// ▬ The "Class" that "Implements" the "OfficeInternetAccess" Interface ▬
public class RealNetAccess implements OfficeInternetAccess{

    // ▼ Properties ▼
    private int employeeRank;



    // ▬ The "Constructor" ▬
    public RealNetAccess(int employeeRank) {
        this.employeeRank = employeeRank;
    }



    // ▬ The "grandInternetAccess()" Override Method ▬
    @Override
    public void grandInternetAccess() {
        System.out.println("Internet Access Granted for Employee Rank: " + employeeRank);
    }
}
