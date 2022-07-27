package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";
        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

        char tenthChar = word.charAt(4);

        System.out.println("tenthChar = " + tenthChar);
        
        System.out.println("----------------------------------------");
        
        
        String sentence = "Batch 25 is the best batch.";
        int totalCh = sentence.length();
        System.out.println("totalCh = " + totalCh);

        char lastCh = sentence.charAt(totalCh-1); // char lastCh = sentence.charAt(sentence.length()-1);
        System.out.println("lastCh = " + lastCh);

        System.out.println("----------------------------------------");

        String str = "Java is the best";
        str = str.toLowerCase();
        System.out.println("result = " + str);

        String result2 = str.toUpperCase();
        System.out.println("result2 = " + result2);

        System.out.println("----------------------------------------");







    }
}
