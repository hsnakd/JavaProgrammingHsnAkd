package a_Tasks.Collections;

import java.util.*;

public class CollectionConversion {
    public static void main(String[] args) {
        // Array to ArrayList
        String[] array = {"apple", "banana", "orange"};
        List<String> arrayListFromArr = Arrays.asList(array);

        // ArrayList to Array
        String[] arrayFromList = arrayListFromArr.toArray(new String[0]);

        // ArrayList to List
        List<String> listFromArrayList = new ArrayList<>(arrayListFromArr);

        // List to ArrayList
        ArrayList<String> arrayListFromList = new ArrayList<>(listFromArrayList);

        // List to Set
        Set<String> setFromList = new HashSet<>(listFromArrayList);

        // Set to List
        List<String> listFromSet = new ArrayList<>(setFromList);

        // Set to Map
        Map<Integer, String> mapFromSet = new HashMap<>();
        int i = 0;
        for (String element : setFromList) {
            mapFromSet.put(i++, element);
        }

        // Map to Set
        Set<Map.Entry<Integer, String>> entrySetFromMap = mapFromSet.entrySet();
        Set<String> setFromMap = new HashSet<>();
        for (Map.Entry<Integer, String> entry : entrySetFromMap) {
            setFromMap.add(entry.getValue());
        }

        // Map to List
        List<String> listFromMap = new ArrayList<>(mapFromSet.values());

        // List to Map (Assuming list elements are unique and represent key-value pairs alternatively)
        Map<String, String> mapFromList = new HashMap<>();
        for (int j = 0; j < listFromMap.size(); j += 2) {
            mapFromList.put(listFromMap.get(j), listFromMap.get(j + 1));
        }
    }
}
