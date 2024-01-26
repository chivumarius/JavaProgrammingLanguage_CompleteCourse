
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "STRUCTURAL DESIGN PATTERNS" •
          ________________________________
                  
                ► "PROXY" ◄
              - "PROBLEM 2" -




  Problem 2:


    ▬ A "Company"
        → "Needs" to "Allows"
        → Only "Specific Employees"
        → to "Use" the "Internet".



    ▬ This "Module"
        → will "Allow All" the "Employees"
        → to "Access" the "Net".


    ♦ "UML"
    _____________________________________________________________________________________


	    Client		→	Internet
				        - employeeName: String

	    + main()		+ getInternetAccess(): void
    _____________________________________________________________________________________

    ▬ So, How to "Solve" this "Problem"?






    ▬ "Proxy"
        → is a "Structural Design Pattern"
        → that "Lets You Provide"
        → a "Substitute" or "Placeholder"
        → for "Another Object".


    ▬ A "Proxy"
        → "Controls Access"
        → to the "Original Object",
        → "Allowing" you to "Perform" Something
        → Either "Before" or "After"
        → the "Request Gets Through"
        → to the "Original Object".




    ▬ Why "Would" you "Want"
        → to "Control Access"
        → to an "Object"?

  	        1- You have a "Massive Object"
  	            → that "Consumes"
  	            → a "Vast Amount"
  	            → of "System Resources".


  	        2- You "Need It"
  	            → from "Time" to "Time",
  	            → but "Not Always".




    ▬ The "Proxy"
        → "Disguises Itself"
        → as a "Database Object". It can handle lazy initialization and result caching without the client or the real database object even knowing.






    ▬ "Proxy Structure":

        (1) The "Service Interface"
            → "Declares" the "Interface"
            → of the "Service".


            ♦ The "Proxy"
                → must "Follow"
                → this "Interface"
                → to "Be Able" to "Disguise Itself" a
                → s a "Service Object".



        (2) The "Service"
            → is a "Class"
            → that "Provides"
            → some Useful "Business Logic".



        (3) The "Proxy" Class
            → has a "Reference Field"
            → that "Points"
            → to a "Service Object".


            ♦ "After" the "Proxy Finishes"
                → Its "Processing" ( Ex.:
                    •► "Lazy Initialization",
                    •► "Logging",
                    •► "Access Control",
                    •► "Caching" etc.),

               → It "Passes" the "Request"
               → to the "Service Object".


            ♦ Usually, "Proxies"
                → "Manage" the "Full LifeCycle"
                → of their "Service Objects".



        (4) The "Client"
            → should "Work"
            → with "Both Services" and "Proxies"
            → via the "Same Interface".


            ♦ This "Way"
                → you can "Pass"
                → a "Proxy Into any Code"
                → that "Expects"
                → a "Service Object".              


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.structural.proxy.problem2;

import java.net.Proxy;

public class Client {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ "Call" the "Method" ▼
        RunProxyPattern();
    }



    // ▬ The "RunProxyPattern()" Method ▬
    public static void RunProxyPattern(){

        // ▼ (1) Creating an "RealNetAccess" Object ▼
        //     → in which "All Employees"
        //     → have "Permission"
//        //     → to "Access" the "Internet" ▼
//        RealNetAccess access = new RealNetAccess(5);
//
//        // ▼ Calling the "Method" ▼
//        access.grandInternetAccess();





        // ▼ (2) Using "Proxy" ("Parallel Class")
        //      → and "Creating" an "OfficeInternetAccess" Object
        //      → of "ProxyNetAccess" Type
        //      → in which "Only Employees"
        //      → with "Job Level Greater"
        //       → or "Equal" to "5"
        //      → have "Permission"
        //      → to "Access" the "Internet" ▼
        OfficeInternetAccess proxyAccess1 = new ProxyNetAccess(5);
        OfficeInternetAccess proxyAccess2 = new ProxyNetAccess(4);


        // ▼ Calling the "Method" ▼
        proxyAccess1.grandInternetAccess();
        proxyAccess2.grandInternetAccess();
    }
}
