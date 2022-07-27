package ReplitSolutions_HsnAkd._3_Strings;

import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        int length1 = word1.length();
        int length2 = word2.length();

        char ch11 = word1.charAt(0);
        char ch12 = word1.charAt(1);
        char ch13 = word1.charAt(2);
        char ch21 = word2.charAt(0);
        char ch22 = word2.charAt(1);
        char ch23 = word2.charAt(2);


        if (length1 == 3 && length2 == 3) {
            System.out.println("" + ch11 + ch21 + ch12 + ch22 + ch13 + ch23);
        } else {
            System.out.println("cannot merge");
        }


    }


    }

