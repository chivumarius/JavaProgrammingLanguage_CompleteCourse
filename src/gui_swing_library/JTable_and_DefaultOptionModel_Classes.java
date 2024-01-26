
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • "GRAPHICAL USER INTERFACE" •
                  • "SWING" LIBRARY •
                  ___________________
                  
  - "J TABLE" & "DEFAULT OPTION MODEL" CLASSES/ COMPONENTS -
                ("ATOMIC CONTAINERS")





    ▬ The "JTable" Class
        → is Used to "Display Data"
        → in "Tabular Form".


    ▬ "JTable"
        → is "Composed"
        → of "Rows"
        → and "Columns".


 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package gui_swing_library;


import javax.swing.*;


public class JTable_and_DefaultOptionModel_Classes {

    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {

        // ▬ (0) "J FRAME" (TOP-LEVEL CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JFrame" ▼
        JFrame jFrame = new JFrame("GUI COURSE");

        // ▼ "Setting" the "jFrame" ▼
        jFrame.setBounds(100,100,1000,1000);
        jFrame.setVisible(true);





        // ▬ (1) "J TABLE" (ATOMIC CONTAINER) ▬
        // ▼ "Columns" for the "JTable" ▼
        String[] columns = {"ID", "First Name", "Last Name", "Age", "Salary"};

        // ▼ "Rows" for the "JTable" ▼
        Object[][] rows = {
            {1, "John", "Smith", 25, 50000},
            {2, "Jane", "Doe", 30, 60000},
            {3, "Bob", "Smith", 35, 70000},
            {4, "Alice", "Johnson", 40, 80000},
            {5, "David", "Brown", 45, 90000},
            {6, "Emily", "Davis", 50, 100000},
        };


       // ▼ Creating am "Instance"/"Object" of Type "JTable" ▼
       JTable jTable = new JTable(rows, columns);


        // ▼ "Adding" the "jTable" to the "jFrame" ▼
        jFrame.add(jTable);




        // ▬ (2) "LIST SELECTION MODEL" FOR "FUNCTIONALITY"  ▬
        // ▼  "Creating an "Instance"/"Object" of Type "ListSelectionModel" ▼
        ListSelectionModel listSelectionModel = jTable.getSelectionModel();

        // ▼ "Set Selection Model" for "Making" a "Single Selection" ▼
        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // ▼ "Add List Selection Listener" ▼
        listSelectionModel.addListSelectionListener(e -> {
            String data = null;

            // ▼ "Get Selected Rows" from the "Table" ▼
            int[] row = jTable.getSelectedRows();

            // ▼ "Get Selected Columns" from the "Table" ▼
            int[] column = jTable.getSelectedColumns();


            // ▼ Displaying the "Selected Rows" and "Selected Columns" ▼
            for (int i = 0; i < row.length; i++) {
                for (int j = 0; j < column.length; j++) {
                    data = jTable.getValueAt(row[i], column[j]) + " ";
                }

                System.out.println("Selected Element: " + data);
            }
        });



        // ▬ (3) "J SCROLL PANE" (ATOMIC CONTAINER) ▬
        // ▼ Creating an "Instance"/"Object" of Type "JScrollPane" ▼
        JScrollPane scrollPane = new JScrollPane(jTable);

        // ▼ "Adding" the "scrollPane" to the "jFrame" ▼
        jFrame.add(scrollPane);
    }
}
