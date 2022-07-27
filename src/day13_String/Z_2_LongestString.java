package day13_String;

import java.util.Scanner;

public class Z_2_LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first string of text:");
        String word = input.nextLine();

        System.out.println("Enter your second string of text:");
        String word2 = input.nextLine();

        int ch1 = word.length();
        int ch2 = word2.length();
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);


        if (ch1 > ch2) {
            System.out.println(word);
        } else if (ch1 < ch2) {
            System.out.println(word2);
        } else {
            System.out.println("Same length");
        }


        System.out.println("------------------------------------------------------");


        input.nextLine();
        System.out.println("Enter your first string of text:");
        String str1 = input.nextLine();

        System.out.println("Enter your second string of text:");
        String str2 = input.nextLine();

        input.close();

        if (str1.length() > str2.length()) {
            System.out.println(str1);
        } else if (str2.length() > str1.length()) {
            System.out.println(str2);
        } else {
            System.out.println("Both have same length");
        }



    }
}


/*
        2. write a program that asks user to enter two strings, and print out the longest string



 */

        
