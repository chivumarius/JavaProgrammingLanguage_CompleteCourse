package design_patterns.creational.singleton.problem1;


// ♦♦♦ This "Approach" does "Not Prevent Class Cloning" ♦♦♦
// ▬ "Singleton" Class
//      → for a "Single Database Connection"
//      → which will have a "Single Object/Instance" ▬
public class SingletonDBConnection {

    // ▬▬ 1- "Private Constructor" ▬▬
    private SingletonDBConnection() {

    }



    // ▬▬ 2- "Static Field" that "Contain"
    //          → an "Only One Object/Instance" of the "Class" ▬▬
    private static SingletonDBConnection onlyOneInstance;


    // ▬▬ 3- "Static Method" for "Obtaining" the "Object/Instance" ▬▬
    public static SingletonDBConnection getOnlyOneInstance() {

        // ▼ Check If there is No "Only One Instance" Created ▼
        if (onlyOneInstance == null) {
            // ▼ Create a "Only One Instance" ▼
            onlyOneInstance = new SingletonDBConnection();
        }


        // ▼ If there is a "Only One Instance" of This "Class"
        //      → "Return It" ▼
        return onlyOneInstance;
    }


}
