package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Scanner;

public class FindingMaxLengthWordInString {
    public static void main(String[] args) {

        System.out.println("Please enter the string for finding longest word");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String maxLength="null";
        String word[] = str.split(" ");

        maxLength = word[0];
        for( int i = 0, j=0; i < word.length; i++) {
            for( j =i+1; j < word.length; j++) {
                if(maxLength.length() < word[j].length()) {
                    maxLength = word[j];
                }
            }
        }
        System.out.println("the longest string is: " + maxLength + " and it's length is: " + maxLength.length());


    }
}

/*
Given the array words find and print the word with the largest length.
Assume that there are no 2 words with longest length

Example:

words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa
 */