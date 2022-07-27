package day13_String;

import java.util.Scanner;

public class Z_5_ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        int ch = word.length();

        if (ch > 3){
            char ch1 = word.charAt(word.length()-1);
            char ch2 = word.charAt(word.length()-2);
            char ch3 = word.charAt(word.length()-3);
            String ch11 = String.valueOf(ch1);
            String ch21 = String.valueOf(ch2);
            String ch31 = String.valueOf(ch3);
            System.out.println(ch31+ch21+ch11);

            } else {
                System.out.println(word);
            }

        }

    }



/*
       5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself



 */

        
