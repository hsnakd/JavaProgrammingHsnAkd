package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Z_5_CatAndDog {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        for (int i = 0; i <= sentence.length()-3; i++) {
            String str = sentence.substring(i,i+3);
            if(str.equalsIgnoreCase("cat") && (str.equalsIgnoreCase("dog"))){

            }
        }
        System.out.println("true");



    }
}



/*



5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true




 */