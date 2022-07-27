package day19_LoopPractices;

import java.util.Scanner;

public class Z_6_HighestFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();
        String result = "";
        int highestFrequency = 0;


        for (int i = 0; i < word.length() ; i++) {
            char ch1 = word.charAt(i);
            int frequency = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch2 = word.charAt(j);
                if (ch1 == ch2) {
                    frequency ++;
                }
            }


            if (highestFrequency <= frequency) {
                highestFrequency = frequency;

                result += "" + ch1;

            }

        }
        System.out.println("Highest Frequency = " + result + " : " + highestFrequency);



    }
}
/*
	6.  Write a program that can find the character that has the highest frequency from a string


 */



