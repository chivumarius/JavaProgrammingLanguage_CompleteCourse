package design_patterns.behavioural.interpreter.problem2;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// ▬ [2] "Context" Class ▬
public class Context {

    // ▼ Creating a "Map" Instance/Object of "HashMap" Type ▼
    private static Map<String, List<Row>> tables = new HashMap<>();


    // ▼ Properties ▼
    private String table;
    private String column;



    // ▼ Static Block ▼
    static {
        // ▼ Creating a "List" Instance/Object of "ArrayList" Type ▼
        List<Row> list = new ArrayList<>();

        // ▼ Adding a "Rows" to the "List" ▼
        list.add(new Row("Marius", "Chivu"));
        list.add(new Row("Jeanine", "Alexandra"));
        list.add(new Row("Nicholas", "Gabriel"));
        list.add(new Row("Ella", "Daniela"));


        // ▼ Adding the "List" to the "Map" ▼
        tables.put("People", list);
    }



    private int columnIndex = -1;


    private static final Predicate<String> matchAnyString = string -> string.length() > 0;
    private  static final Function<String, Stream<? extends String>> matchAllColumns = Stream::of;


    private Predicate<String> whereFilter = matchAnyString;
    private Function<String, Stream<? extends String>> columnMapper = matchAllColumns;




    // ▬ The "setColumn()" Method ▬
    public void setColumn(String column) {
        this.column = column;

        // ▼ Call the "Method" ▼
        setColumnMapper();
    }



    // ▬ The "setTable()" Method ▬
    void setTable(String table) {
        this.table = table;
    }


    // ▬ The "setFilter()" Method ▬
    void setFilter(Predicate<String> filter){
        whereFilter = filter;
    }


    // ▬ The "clear()" Method ▬
    void clear(){
        column = "";
        columnMapper = matchAllColumns;
        whereFilter = matchAnyString;
    }



    // ▬ The "search()" Method ▬
    List<String> search() {
        List<String> result = tables
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(table))
                .flatMap(entry -> entry.getValue().stream())
                .map(Row::toString)
                .flatMap(columnMapper)
                .filter(whereFilter)
                .collect(Collectors.toList());

        clear();
        return result;
    }




    // ▬ The "setColumnMapper()" Method ▬
    private void setColumnMapper() {

        // ▼ Switch Statement ▼
        switch (column) {
            case "*":
                columnIndex = -1;
                break;

            case "firstName":
                columnIndex = 0;
                break;

            case "lastName":
                columnIndex = 1;
                break;
        }


        if(columnIndex != -1){
            columnMapper = string -> Stream.of(string.split(" ")[columnIndex]);
        }
    }
}
