/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "CREATIONAL DESIGN PATTERNS" •
          ________________________________

                ► "SINGLETON" ◄
                - "PROBLEM 1" -




  Problem 1:

    • We "Need"
        → to "Create" an "App"
        → that "Connects"
        → with an "Online Database".


        ♦ "Every Time"
            → we "Connect" to the "DB",
            → we "Need" to "Create"
            → the "Same Object".



 ○ "How" to "Connect" to "DB"
    → with a "Single Connection Object"
    → "Without Creating"
    → the "Same Object Every Time"?


      • The "Singleton" Design Pattern
        → "Aims" to "Keep" a "Check"
        → on "Initialization" of "Objects"
        → of a "Particular Class"
        → by "Ensuring" that "Only One Instance"
        → of the "Object Exists"
        → throughout the "Java Virtual Machine".



        • A "Singleton" Class
            → Also Provides "One Unique Global Access Point"
            → to the "Object",
            → so that "Each Subsequent Call"
            → to the "Access Point"
            → "Returns Only" that "Particular Object".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.creational.singleton.problem1;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunSingletonPattern();
    }


    // ▬ The "RunSingletonPattern()" Method ▬
    private static void RunSingletonPattern() {
        System.out.println("\n");


        // ▬▬ Connecting to the "Database" ▬▬
        // ▼ Create the "SingletonDBConnection" Object
        //      → by "Using" the "Method"
        //      → ("Not" the "Constructor" → which is "Private") ▼
        SingletonDBConnection singletonDBConnection = SingletonDBConnection.getOnlyOneInstance();

        // ▼ Access the "Object Method" ▼
        System.out.println(singletonDBConnection.toString());  // ► Display: SingletonDBConnection@1d81eb93
        // The "@1d81eb93" is the "Hash Code" and I will not be Changed.




        // ▼ If ve "Create" a "New Connection Object"
        //      → which "Actually"
        //      → will "Be" the "Same Object" ▼
        SingletonDBConnection singletonDBConnection2 = SingletonDBConnection.getOnlyOneInstance();
        System.out.println(singletonDBConnection2.toString());
        // The "@1d81eb93" is the "Same Object", it wil "Not Be Created" a "New One".


        System.out.println("\n");
    }
}
