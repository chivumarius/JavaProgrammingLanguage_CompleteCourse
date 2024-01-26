package design_patterns.structural.composite.problem2;



// ▬ This "Implements" the "Comparable" Interface
//      → for the "File Attributey" ▬
public class FileAttributey implements Comparable<FileAttributey>{

    // ▼ Declaring an "Attributey" Object ▼
    Attributey attributey;

    // ▼ "Property" ▼
    String value;



    // ▬ The "Constructor" ▬
    public FileAttributey(Attributey attributey, String value){
        this.attributey = attributey;
        this.value = value;
    }



    // ▬ The "compareTo()" Override Method ▬
    @Override
    public int compareTo(FileAttributey o) {
        return attributey.attributeName.compareTo(o.attributey.attributeName);
    }
}
