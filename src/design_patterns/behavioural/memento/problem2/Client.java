/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
              • "DESIGN PATTERNS" •
          • "BEHAVIOURAL DESIGN PATTERNS" •
          ________________________________

                ► "MEMENTO" ◄
                - "PROBLEM 2" -




  Problem 2:

      • We need to build a "Text Editor" App
        → that "Implement"
            •► "SAVE" and
            •► "UNDO" Features.

      • When "Saving":
        1- we want our "Current Text"
            → to be "Saved"

        2- When "Undoing":
            → "Subsequent Changes",
            → we'll have our "Saved Text"
            → "Restored".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package design_patterns.behavioural.memento.problem2;


public class Client {
    // ▬ "MAIN()" METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {
        // ▼ Call the "Method" ▼
        RunMementoPattern();
    }


    // ▬ The "RunMementoPattern()" Method ▬
    private static void RunMementoPattern() {
        System.out.println("\n");

        // ▼ Creating "Text Editor" Object (Classes "Initializations") ▼
        TextEditor textEditor = new TextEditor(new TextWindow());

        // ▼ Writing "Text" ▼
        textEditor.writeText("Hi and welcome, ");
        textEditor.writeText("I'm Marius ");
        textEditor.writeText("and I'm a Software Engineer.");

        // ▼ Saving "Text" ▼
        textEditor.save();

        // ▼ Printing "Text" ▼
        System.out.println(textEditor.print());


        System.out.println("\n");


        // ▼ Creating "Text Editor" Object (Classes "Initializations") ▼
        TextEditor textEditor2 = new TextEditor(new TextWindow());


        // ▼ Writing "Text" ▼
        textEditor2.writeText("We will study together ");
        textEditor2.writeText("the Java ");
        textEditor2.writeText("programming language.");

        // ▼ Saving "Text" ▼
        textEditor2.save();

        // ▼ Printing "Text" ▼
        System.out.println(textEditor2.print());


        System.out.println("\n");
    }
}
