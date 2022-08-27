package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }

    public static boolean isAnagram(String word1, String word2) {

        boolean result = false;
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        System.out.println(word1);
        System.out.println(word2);

        char [] list1 = new char [word1.length()];
        char [] list2 = new char [word2.length()];

        if (word1.length() != word2.length()) {
            result = false;
        } else if (word1.length() == word2.length()) {

        for (int i = 0; i < word1.length(); i++) {
            list1[i] += word1.charAt(i);
        }
        for (int i = 0; i < word2.length(); i++) {
            list2[i] += word2.charAt(i);
        }
            System.out.println(Arrays.toString(list1));
            System.out.println(Arrays.toString(list2));

        Arrays.sort(list1);
        Arrays.sort(list2);
            System.out.println(Arrays.toString(list1));
            System.out.println(Arrays.toString(list2));
        if(Arrays.equals(list1, list2)){
            result = true;
        }else{
            result = false;
        }

        }


        return result;
    }

}

/*
Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.

The isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive
Examples:

isAnagram("listen", "Silent") ==> true
isAnagram("earth", "heart") ==> true
isAnagram("star", "rats") ==> true
isAnagram("hi", "bye") ==> false
isAnagram("cube", "cava") ==> false
 */