package design_patterns.behavioural.command.problem1;


import java.util.ArrayList;
import java.util.List;

// ▬ "Invoker" Class
//      → is an "Object" that "Knows"
//      → how to "Execute" a "Given Command"
//      → but does "Not Know"
//      → how the "Command" has been "Implemented"
//      → either through "Objects" or "Methods" ▬
public class TextFileOperationsInvoker {

    // ▼ "List" of "TextFileOperation" Objects ▼
    private final List<TextFileOperation> operations = new ArrayList<>();



    // ▬ The "executeOperation()" Method ▬
    public String executeOperation(TextFileOperation operation) {

        // ▼ "Adding Operation" to "List" ▼
        operations.add(operation);

        // ▼ Executing the "Operation" ▼
        return operation.execute();
    }
}
