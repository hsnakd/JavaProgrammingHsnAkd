package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Z_4_FrequencyOfWord_ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine();
        System.out.println("Enter a word");
        String word = input.nextLine();

        int count = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        System.out.println("Count word = " + count);

    }
}



/*


4. write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create


 */