package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Z_2_FrequencyOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        System.out.println("Enter a character:");
        char ch = input.next().charAt(0);
        int chNum = 0;

        for (int i = 0; i <= sentence.length()-1; i++) {

            char ch1 = sentence.charAt(i);
            if (ch1 == ch) {
                chNum++;
            }

        }
        System.out.println("Frequency : " + chNum );


    }
}



/*

2. Write a program that asks user to enter a string and a char,
the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */