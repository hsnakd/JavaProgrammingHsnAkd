package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithString_MergeThem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }

    public static String mergeStrings(String one, String two) {
        String result = "";


        if (one.length() >= two.length()) {
            for (int i = 0; i < two.length(); i++) {
                result += one.charAt(i);
                result += two.charAt(i);
            }
            for (int i = two.length(); i < one.length(); i++) {
                result += one.charAt(i);
            }

        }
        if (one.length() < two.length()) {
            for (int i = 0; i < one.length(); i++) {
                result += one.charAt(i);
                result += two.charAt(i);
            }
            for (int i = one.length(); i < two.length(); i++) {
                result += two.charAt(i);
            }
        }




        return result;
    }

}

/*
Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one.
Please note one and two can be of different lengths.

Examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */