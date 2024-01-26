
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "INPUT" / "OUTPUT" •
                 - ("I/O") -
               _________________
               • "STREAMS DATA" •
         • "OBJECT OUTPUT STREAM" CLASS •
    - (TO "CREATE" AND "WRITE DATA" INTO A "NEW FILE") -



    ▬ The "Java.io.ObjectOutputStream" Class
        → Writes "Primitive" Data Types
        → and "Graphs" of "Objects"
        → to an "OutputStream".


    ▬ The "Objects"
        → can be "Read"
        → using an "ObjectInputStream".

   
 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package input_output;


import java.io.*;


public class ObjectOutputStream_Class_for_Serialization {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) throws FileNotFoundException {

        // ▼Creating an "Employee" Object of "Employee" Type ▼
        Employee employee1 = new Employee("Jeanine", 25000);


        try{
            // ▼ "Generating" and "Saving" the "Employee" ("Serialized Object") in to the "New Created File" ▼
            FileOutputStream fileOutputStream = new FileOutputStream("src/input_output/output-data/serialized-output-text.txt");

            // ▼ Creating an "Object" of "ObjectOutputStream" Type
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // ▼ "Writing Objects" to the "File" ▼
            objectOutputStream.writeObject(employee1);
            System.out.println("The Data was Written to the File!");

            // ▼ "Closing" the "Output Stream" ▼
            objectOutputStream.close();

            // ▼ "Closing" the "File" ▼
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}







// ▬ "Serializable Interface" (for "Local Data Saving")
//      → Must be "Implemented"
//      → for Any "Class"" or "Object"
//      → that we "Want"
//      → to "Save" on "Disk" ▬
class Employee implements Serializable {

    // ▼ "Fields" ▼
    String name;
    int salary;


    // ▬ "CONSTRUCTOR" METHOD ▬
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
