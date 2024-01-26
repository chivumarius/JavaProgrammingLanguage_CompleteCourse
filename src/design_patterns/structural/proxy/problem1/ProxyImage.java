package design_patterns.structural.proxy.problem1;


// ▬ This "Class" is "Parallel"
//      → to the "RealImage" Class
//      → and "Implements" the "Image" Interface ▬
public class ProxyImage implements Image {

    // ▼ "Using" the "Composition"
    //      → and "Creating" an "Instance"
    //      → of the "RealImage" Class ▼
    private RealImage realImage;


    // ▼ "Variable" ▼
    private String fileName;


    // ▬ The "Constructor" ▬
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }


    // ▬ The "display()" Override Method ▬
    @Override
    public void display() {

        // ▼ "Lazy Initialization" ▼
        if(realImage == null){
            // ▼ "Initialize" the "RealImage" Object ▼
            realImage = new RealImage(fileName);
        }

        // ▼ "Access" the "Object Method"  ▼
        realImage.display();
    }
}
