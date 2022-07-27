package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Scanner;

public class FindingMaxLengthInStringArray {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }

        //TODO.write your code below


        String maxLength = "";

        maxLength=words[0];

        for( int i = 0, j=0; i < words.length; i++) {
            for( j =i+1; j < words.length; j++) {
                if(maxLength.length() < words[j].length()) {
                    maxLength = words[j];
                }
            }
        }
        System.out.println(maxLength);


    }
}

/*
Given the array words find and print the word with the largest length.
Assume that there are no 2 words with longest length

Example:

words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa
 */