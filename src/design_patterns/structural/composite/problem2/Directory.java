package design_patterns.structural.composite.problem2;

import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


// ▬ "Extending" the "File" Class ▬
public class Directory extends File {

    // ▼ Declaring a "Set" of "Files" ▼
    Set<File> files;


    // ▬ The "Constructor" ▬
    public Directory(String fileName){
        super(fileName);
        files = new TreeSet<>();
    }


    // ▬ The "display()" Override Method ▬
    @Override
    public String display() {
        String out = this.fileName + "\n";

        int level = 0;

        Iterator<File> iterator = files.iterator();
        while (iterator.hasNext()) {
            File f = iterator.next();

            // ▼ If is a "File" ▼
            if(f instanceof AFile){
                out += f.fileName + "\n";
            }
            // ▼ It is a "Directory" ▼
            else if (f instanceof Directory) {

                // ▼ "Recursive Function Callback" ▼
                out += f.display();
            } else {
                assert false;
            }
        }

        return out;
    }



    // ▬ The "addFile()" Method ▬
    public boolean addFile(File file){

        return files.add(file);
    }



    // ▬ The "removeFile()" Method ▬
    public boolean removeFile(File file){

        return files.remove(file);
    }


    // ▬
    public String[] list(){
        // ▼ Creating a "String" Array ▼
        String[] fls = new String[files.size()];

        // ▼ Creating an "Iterator" for the "Set" ▼
        Iterator<File> iterator = files.iterator();

        int i = 0;

        // ▼ Looking through the "All Files" ▼
        while(iterator.hasNext()){
            File f = iterator.next();
            fls[i++] = f.getFileName();
        }

        return fls;
    }




    // ▬ The "listFiles()" Method ▬
    public File[] listFiles(){

        return (File[]) files.toArray();
    }
}
