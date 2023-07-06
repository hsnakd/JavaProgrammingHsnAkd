package fastTrackJava.day1;

import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class Task5FrequencyOfCharacter {

    /*
        Frequency Of Characters

        Given a String that has multiple of the same characters determine the frequency of each character. Output a concatenated String that shows the character and the frequency of it

        input:
            aaaabcccdd
        output:
            a4b1c3d2
     */

    public static void main(String[] args) {

        String str = "aaaabcccddeeeeffzzzzz";
        String result = "";

        while(!str.isEmpty()){
            int origLength = str.length(); // 10
            String currentChar = str.substring(0,1);
            str = str.replace(currentChar, "");
            result += currentChar + (origLength - str.length());
        }

        System.out.println(result);




        System.out.println("-----------------------------------------------------------");


            String input = "aaaabcccddeeeeffzzzzz";
            String output = getCharacterFrequency(input);
            System.out.println(output);

    }
        public static String getCharacterFrequency(String input) {
            Map<Character, Integer> frequencyMap = new HashMap<>();

            // Count the frequency of each character
            for (char c : input.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }

            // Build the concatenated string
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                sb.append(entry.getKey()).append(entry.getValue());
            }

            return sb.toString();
        }


}
