package design_patterns.structural.proxy.problem2;


// ▬ This "Class" is "Parallel"
//      → to the "RealNetAccess" Class
//      → and "Implements" the "OfficeInternetAccess" Interface ▬
public class ProxyNetAccess implements OfficeInternetAccess {

    // ▬ "Property" ▬
    private int employeeRank;

    // ▼ Create the "RealNetAccess" Object ▼
    private RealNetAccess realNetAccess;



    // ▬ The "Constructor" ▬
    public ProxyNetAccess(int employeeRank) {
        this.employeeRank = employeeRank;
    }



    // ▬ The "grandInternetAccess()" Override Method ▬
    @Override
    public void grandInternetAccess() {

        // ▼ "Restrict" the "Access" ▼
        if(employeeRank >= 5) {
            // ▼ "Allowing Internet Access"
            //      → by "Creating" the "RealNetAccess" Object ▼
            realNetAccess = new RealNetAccess(employeeRank);

            // ▼ Calling the "Method" ▼
            realNetAccess.grandInternetAccess();
        } else {
            // ▼ "Denying Internet Access" ▼
            System.out.println("Internet Access Denied, Job Level is < 5");
        }
    }
}
