package design_patterns.structural.proxy.problem1;

// ▬ "Class" that "Implements" the "Image" Interface ▬
public class RealImage implements Image {

    // ▬ "Fields" ▬
    private String fileName;


    
    // ▬ "Constructor" ▬
    public RealImage(String fileName) {
        this.fileName = fileName;
        
        // ▼ "Call" the "Method"  ▼
        loadFromDisk(fileName);
    }



    // ▬ The "display()" Override Method ▬
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }



    // ▬ The "loadFromDisk()" Method ▬
    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
