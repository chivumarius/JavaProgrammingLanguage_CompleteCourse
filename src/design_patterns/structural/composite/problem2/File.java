package design_patterns.structural.composite.problem2;


import org.jetbrains.annotations.NotNull;

import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



// ▬ "Implementation" of "Comparable" Java Class ▬
abstract class File implements Comparable<File> {

    // ▼ "Properties" ▼
    String fileName;

    // ▼ Create a "Set" of "FileAttributet" Objects ▼
    Set<FileAttributey> fileAttributes;



    // ▬ "Constructor" ▬
    public File(String fileName) {
        this.fileName = fileName;
        this.fileAttributes = new TreeSet<>();
    }




    // ▬ The "getFileAttributes()" Method ▬
    public Set<FileAttributey> getFileAttributes() {
        return fileAttributes;
    }




    // ▬ The "getFileAttribute()" Method ▬
    public FileAttributey getFileAttribute(Attributey attributey) {

        // ▼ If the "file Attributes" is "Not Empty" ▼
        if(!fileAttributes.isEmpty()){
            // ▼ Creating "Iterator" for the "Set" ▼
            Iterator<FileAttributey> iterator = fileAttributes.iterator();

            // ▼ Looking through the "All Attributes" ▼
            while(iterator.hasNext()){
                FileAttributey fileAttributey = iterator.next();

                if(fileAttributey.equals(attributey)){
                    return fileAttributey;
                }
            }
        }

        return null;
    }



    // ▬ The "getFileName()" Method ▬
    public String getFileName(){
        return fileName;
    }


    // ▬ The "addFileAttribute()" Method ▬
    public String addFileAttribute(FileAttributey attr){
        fileAttributes.add(attr);
        return fileName;
    }



    // ▬ The "removeFileAttribute()" Method ▬
    public String removeFileAttribute(FileAttributey attr){
        fileAttributes.remove(attr);
        return fileName;
    }




    // ▬ The "compareTo()" Override Method ▬
    @Override
    public int compareTo(File f) {
        return fileName.compareTo(f.fileName);
    }



    // ▬ The "display()" Abstract Method ▬
    public abstract String display();
}
