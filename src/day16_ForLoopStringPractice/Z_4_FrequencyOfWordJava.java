package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Z_4_FrequencyOfWordJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        int result=0;
        for (int i = 0; i <= sentence.length()-4; i++) {
            String str = sentence.substring(i,i+4);
            if(str.equalsIgnoreCase("Java")){
                result ++;
            }
        }

        System.out.println(result);


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