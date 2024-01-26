/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "STRUCTURAL DESIGN PATTERNS" •
          ________________________________

                ► "COMPOSITE" ◄
                - "PROBLEM 2" -




  Problem 2:
      ▬ We "Need"
            → to "Create" a "File System"
            → that "Consists" of:

	            1- "File":
	                → is a "Link" to a "Specific File"

	            2- "Folder":
	                → is a "File"
	                → but "It Contains"
	                → "Many Files".

 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.structural.composite.problem2;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunCompositePattern();
    }


    // ▬ The "RunCompositePattern()" Method ▬
    private static void RunCompositePattern() {
        System.out.println("\n");

        // ▼ "File" Array ▼
        File[] f = new File[20];


        // ▬▬ Setting the "File" Array ▬▬
        f[0] = new Directory("Root");
        f[1] = new Directory("My Documents");
        f[2] = new Directory("Maths");
        f[3] = new AFile("primary-numbers.txt");
        f[4] = new AFile("evens-numbers.txt");



        // ▼ "Creating" the "Link" and "Hierarchy" ▼
        ((Directory) f[0]).addFile(f[1]); // ◄ "Adding" to the "Root" ◄
        ((Directory) f[1]).addFile(f[2]);
        ((Directory) f[2]).addFile(f[3]);
        ((Directory) f[2]).addFile(f[4]);


        // ▼ "Displaying" the "Link" and "Hierarchy"
        //      → from the "Root" Folder ▼
        System.out.println(f[0].display());

    }
}
