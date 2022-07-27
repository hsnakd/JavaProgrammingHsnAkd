package day19_LoopPractices;

import java.util.Scanner;

public class Z_14_IndexOfFirstUniqueChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");

        String word = input.next();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch1 = word.charAt(i);
            int frequency = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch2 = word.charAt(j);

                if (ch1 == ch2) {
                    frequency++;
                }
            }


            if(frequency != 1){
                continue;
            }

            result += ch1;

        }


        System.out.println(word.indexOf(result));



    }
}

/*

	14. Write a program that can return the index number of the first unique character.


 */