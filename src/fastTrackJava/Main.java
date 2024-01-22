package fastTrackJava;
import java.util.*;

class Main {

    public static String SearchingChallenge(String[] strArr) {
        // Create a map to store key-value pairs
        Map<String, Integer> keyValues = new HashMap<>();

        // Parse the key:value pairs and sum up the values for each key
        for (String pair : strArr) {
            String[] keyValue = pair.split(":");
            String key = keyValue[0];
            int value = Integer.parseInt(keyValue[1]);

            keyValues.put(key, keyValues.getOrDefault(key, 0) + value);
        }

        // Create a TreeMap to sort the keys in alphabetical order
        Map<String, Integer> sortedKeyValues = new TreeMap<>(keyValues);

        // Build the final output string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : sortedKeyValues.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (value != 0) {
                result.append(key).append(":").append(value).append(",");
            }
        }

        // Remove the trailing comma and return the final output
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Keep this function call here
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] strArr = input.split(",");
        System.out.print(SearchingChallenge(strArr));
    }

}