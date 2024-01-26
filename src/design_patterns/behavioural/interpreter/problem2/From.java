package design_patterns.behavioural.interpreter.problem2;

import java.util.List;


// ▬ [1-1] "Implements" the "Expression" Interface ▬
public class From implements Expression {

    // ▼ "Properties" ▼
    private String table;
    private Where where;



    // ▬ "Constructor 1" ▬
    public From(String table) {
        this.table = table;
    }


    // ▬ "Constructor 2" ▬
    public From(String table, Where where) {
        this.table = table;
        this.where = where;
    }



    // ▬ The "interpret()" Override Method ▬
    @Override
    public List<String> interpret(Context context) {
        context.setTable(table);

        // ▼ If there is no "Where" Expression ▼
        if(where == null) {
            return context.search();
        }

        return where.interpret(context);
    }
}
