
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "STRUCTURAL DESIGN PATTERNS" •
          ________________________________
                  
                ► "PROXY" ◄
              - "PROBLEM 1" -




  Problem 1:


    ▬ We have a big-sized image object stored on the hard disk. Every time we create the same image object, we have a lot of time and memory consumption.


    ▬ If the image is created before, we need to load it from the previous instance.



    ▬ "UML":
     ____________________________________________________________________________________

	    Client 		--→	Reallmage
				        - fileName : string

	    + main() 		+ Reallmage()
				        + display() : void
				        + loadFromDisk(): void
    ____________________________________________________________________________________



    display( image] ); 		loadFromDisk();
    display( image]); 		loadFromDisk();
    display( image 1 );	--→	loadFromDisk();	  --→  Memory Leak Time Consuming
    display( image 1 ); 	loadFromDisk();
    display( image]): 		loadFromDisk();
    display( image] ); 		loadFromDisk();




    ▬  "Proxy" Solution:

        ♦ The "Proxy Pattern" Suggests
            → that you "Create"
            → a "New Proxy" Class
            → with the "Same Interface"
            → as an "Original Service Object".


        ♦ Then
            → you "Update" your "App"
            → so that it "Passes"
            → the "Proxy Object"
            → to "All" of the "Original Object's Clients".



        ♦ We have a "Big-Sized Image Object"
            → "Stored" on the "Hard Disk".


        ♦ "Every Time"
            → we "Create" the "Same Image Object",
            → we "Have" a "Lot" of "Time"
            → and "Memory Consumption".


        ♦ If the "Image"
            → is "Created Before",
            → we "Need" to "Load It"
            → from the "Previous Instance".







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
package design_patterns.structural.proxy.problem1;



public class Client {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▼ Call the "Method" ▼
        RunProxyPattern();
    }



    // ▬ The "RunProxyPattern()" Method ▬
    public static void RunProxyPattern(){

        // ▼ Create the "Image" Object of "RealImage" Type
        //     → in which the "Image" will be "Loaded"
        //     → from "Disk" ▼
        Image image1 = new RealImage("MyPicture.jpg");



        // ▼ Access the "Display()" Method ▼
        image1.display();

        System.out.println("");



        // ▼ Create the "Image" Object of "ProxyImage" Type
        //      → in which "Image"
        //      → will "Not Be Loaded"
        //      → from the "Disk" ▼
        Image image = new ProxyImage("MyPicture.jpg");

        // ▼ Access the "Display()" Method ▼
        image1.display();
    }
}
