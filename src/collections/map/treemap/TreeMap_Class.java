
/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
             • JAVA "COLLECTIONS" •
           - ("GROUP" OF "OBJECTS") -
           ___________________________ 

             ► "MAP" INTERFACE ◄
             ► "TREE MAP" CLASS ◄



    ▬ A "Map"
        → contains "Values"
        → on the "Basis"
        → of "Key" and "Value" Pair.


    ▬ Each "Key" and "Value" Pair
        → is known as an "Entry".



    ▬ A "Map"
        → contains "Unique Keys".



    ▬ A "Map"
        → is "useful"
        → if we have to:
            • "Search",
            • "Update" or
            • "Delete" Elements
        → on the "Basis" of a "Ley".



    ▬ "Map" Features:

        • "Map" Contain "Unique Keys"
        • "Map" Allows "Duplicate Values"
        • "Map" is useful to: "Search", "Update" or "Delete" Elements.
        • "Map" is the "Root Interface" of "Collection".
        • "Map" Interface is Extended by "SortedMap" Interface
            → and "Implemented" by:
                - "HashMap"
                - "LinkedHashMap".

        • "HashMap" & "LinkedHashMap" Classes
            → are "Concrete Classes" of "Map" Interface
            → and Allows "Null Keys" & "Values"  .

        • "TreeMap"
            → doesn't Allow "Null Keys" & "Values".

        • "Map" Interface
            → cannot be "Traversed",
            → fir "Traversing" needs to "Convert"
            → into the Set Collection
            → using the
                • "keySet()" Method or
                • "entrySet()" Method.


    ▬ Syntax:
        • "Object" Creation:
    _______________________________________________________________________
        Map<KeyDataType, ValueDataTy[e> objectName = new HashMap<>();
    _______________________________________________________________________



    ▬ Method

        1. "clear()"
            → It is used to "Remove All"
            → of the "Mappings"
            → from this "Map".


        2. "isEmpty()"
            → It is used to Return
                • "true"
                    → if this "Map"
                    → Contains No "Key-Value" Mappings.

        3. "clone()"
            → It is used to Return a shallow copy of this HashMap instance: the keys and values themselves are not cloned.

        4. "entrySet()"
            → It is used to return a collection view of the mappings contained in this map.

        5. "keySet()"
            → It is used to return a set view of the keys contained in this map.

        6. "put(Object key, Object value)"
            → It is used to insert an entry in the map.

        7. "putAll(Map map)"
            → It is used to insert the specified map in the map.

        8. "putIfAbsent(K key, V value)"
            → It inserts the specified value with the specified key in the map only if it is not already specified.

        9. "remove(Object key)"
            → It is used to delete an entry for the specified key.

        10. "remove(Object key, Object value)"
            → It removes the specified values with the associated specified keys from the map.

        11. "compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)"
            → It is used to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).

        12. "computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)"
            → It is used to compute its value using the given mapping function, if the specified key is not already associated with a value (or is mapped to null), and enters it into this map unless null.

        13. "computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)"
            → It is used to compute a new mapping given the key and its current mapped value if the value for the specified key is present and non-null.

        14. "containsValue(Object value)"
            → This method returns true if some value equal to the value exists within the map, else return false.

        15. "containsKey(Object key)"
            → This method returns true if some key equal to the key exists within the map, else return false.

        16. "equals(Object o)"
            → It is used to compare the specified Object with the Map.

        17. "forEach(BiConsumer<? super K,? super V> action)"
            → It performs the given action for each entry in the map until all entries have been processed or the action throws an exception.

        18. "get(Object key)"
            → This method returns the object that contains the value associated with the key.

        19. "getOrDefault(Object key, V defaultValue)"
            → It returns the value to which the specified key is mapped, or defaultValue if the map contains no mapping for the key.

        20. "isEmpty()"
            → This method returns true if the map is empty; returns false if it contains at least one key.

        21. "merge(K key, V value, BiFunction<? super V? super V,? extends V> remappingFunction)"
            → If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.

        22. "replace(K key, V value)	It replaces the specified value for a specified key."

        23. "replace(K key, V oldValue, V newValue)"
            → It replaces the old value with the new value for a specified key.

        24. "replaceAll(BiFunction<? super K,? super V,? extends V> function)"
            → It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.

        25. "values()"
            → It "returns"
            → a "Collection View"
            → of the "Values"
            → "Contained" in the "Map".

        26. "size()"
            → This Method "Returns"
            → the "Number" of "Entries"
            → in the "Map".



    ▬ "TreeMap" Class
        → is a "RedColor-Black Tree"
        → Based "Implementation".


     ▬ "TreeMap" Class
        → provides an "Efficient Means"
        → of "Storing Key-Value" Pairs in sorted order.



    ▬ "Important Points" About "TreeMap" Class

        •> Contains "Values"
            → based on the "Key".

        •> Implements the "NavigableMap" Interface
            → and Extends "AbstractMap" Class.

        •> Contains only "Unique Elements".

        •> "Cannot" have a Null Key
            → but "Can" have "Multiple Null Values".

        •> Is "Non Synchronized".

        •> Maintains "Ascending Order".





 ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package collections.map.treemap;


import java.util.*;


public class TreeMap_Class {


    // ▬ "MAIN()"  METHOD → THE "FIRST METHOD RUN" ▬
    public static void main(String[] args) {


        // ▼ Creating a "Map" Collection Object of "TreeMap" Type ▼
        Map<String,Integer> phoneNumbers = new TreeMap<>();


        // ▼ Adding "Data" to the "Map" Collection ▼
        phoneNumbers.put("Marius", 871654);
        phoneNumbers.put("Jeanine", 153456);
        phoneNumbers.put("Nicholas", 654321);
        phoneNumbers.put("Ella", 987654);
        phoneNumbers.put("Stefan", 886543);
        phoneNumbers.put("Antonio", 777888);
        phoneNumbers.put("Paul", 555444);




        // ▬ "MAP  BEHAVIOURS" ▬

        // ▼ Getting "All" the "Key-Values" in the "Map" Collection ▼
        System.out.println("Map: " + phoneNumbers);

        // ▼ Getting the "Size" of the "Map" Collection ▼
        System.out.println("Size: " + phoneNumbers.size());

        // ▼ Getting the "Value" of a "Key" in the "Map" Collection ▼
        System.out.println("Marius Phone Number (get): " + phoneNumbers.get("Marius"));


        // ▼ Checking if a "Key" exists in the "Map" Collection ▼
        System.out.println("Checking 'Radu' Key (containsKey): " + phoneNumbers.containsKey("Radu"));


        // ▼ Checking if the "Map" Collection is "Empty" ▼
        System.out.println("Is Phone Number Empty (isEmpty): " + phoneNumbers.isEmpty());


        // ▼ REturning "All" the "Keys" in the "Map" Collection ▼
        System.out.println("All Keys (keySet): " + phoneNumbers.keySet());

        // ▼ Returning "All" the "Values" in the "Map" Collection ▼
        System.out.println("All Values (values): " + phoneNumbers.values());


        System.out.println("\n______________________________________________\n");


        // ▬ "MAP ITERATION" ▬
        // ▼ "Maps"
        //      → "Do Not Have Iterators"!! ▼

        // ♦ "keySet()":
        //      → return a "Set"
        //      → of "All Keys" in the "Map".

        // ♦ "values()":
        //      → return a "Collection"
        //      → of "Al Values"
        //      → in the "Map".


        // ▬ "SET ITERATION" OVER "MAP KEYS"
        //      → FOR GETTING THE "KEYS"
        //      → BY USING "SET" COLLECTION ▬

        // ▼ Creating an "Object" from "Set" Collection
        //      → of "All Keys" in the "Map" Type ▼
//        Set<String> nameSet = phoneNumbers.keySet();
//
//        // ▼ Iterating over the "Set" Collection ▼
//        for (String str : nameSet){
//            System.out.println("Name: " + str);
//        }



        // ▬ "SET ITERATION" OVER "MAP VALUES"
        //      → FOR GETTING THE "VALUES"
        //      → BAY USING "COLLECTION" ▬

        // ▼ Creating an "Object" from "Collection" Collection
        //      → of "All Values" in the "Map" Type ▼
//        Collection<Integer> phoneCollection = phoneNumbers.values();
//
//        // ▼ Iterating over the "Collection" Collection ▼
//        for (Integer i : phoneCollection){
//            System.out.println("Number: " + i);
//        }



        // ▬ "MAP ITERATION" ▬
        // ▼ "For Each" Loop ▼
        for (String name: phoneNumbers.keySet()){

            // ▼ "Getting All" the "Values" of the "Keys" in the "Map" Collection ▼
            Integer number = phoneNumbers.get(name);

            // ▼ Printing the "Key-Value" ▼
            System.out.println(name + " : " + number);
        }

        System.out.println("\n______________________________________________\n");
    }
}

