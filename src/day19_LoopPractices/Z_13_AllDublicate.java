package day19_LoopPractices;

import java.util.Scanner;

public class Z_13_AllDublicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();
        String result = "";

        for (int i = 0; i < word.length() ; i++) {
            char ch1 = word.charAt(i);
            int frequency = 0;

            for (int j = 0; j < word.length(); j++) {
                char ch2 = word.charAt(j);
                if (ch1 == ch2) {
                    frequency ++;
                }
            }


            if (frequency == 2 &&  !result.contains(ch1+"")){
                result += "" + ch1;
            }

        }
        System.out.println(result);


    }
}

/*

	13. Write a program that can display all the characters that appeared twice in the string.

 */