package design_patterns.structural.composite.problem2;


// ▬ "Extending" the "File" Class ▬
public class AFile extends File {

    // ▬ "Constructor" ▬
    public AFile(String fileName) {
        super(fileName);
    }



    // ▬ The "display()" Override Method ▬
    @Override
    public String display() {
        return fileName;
    }
}
