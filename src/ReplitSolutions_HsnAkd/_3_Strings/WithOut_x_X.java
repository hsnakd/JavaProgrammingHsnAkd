package ReplitSolutions_HsnAkd._3_Strings;

import java.util.Scanner;

public class WithOut_x_X {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length() - 1);

        String word1 = null;
        if ((ch1 == 'x' || ch1 == 'X') && (ch2 != 'x' || ch2 != 'X')) {
            word1 = word.substring(1);
            System.out.println(word1);
        } else if ((ch2 == 'x' || ch2 == 'X') && (ch1 != 'x' || ch1 != 'X')){
            String word2 = word.substring(0,word.length()-1);
            System.out.println(word2);
        } else if ((ch2 == 'x' || ch2 == 'X') && (ch1 == 'x' || ch1 == 'X')) {
            String word3 = word.substring(1,word.length()-1);
            System.out.println(word3);
        } else {
            System.out.println(word);
        }

    }

    }

/*

Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX

output: Hi
input: apple

output: apple
input: xUxL

output: UxL
input: JavaX

output: Java

 */