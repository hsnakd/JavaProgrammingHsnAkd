package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Z_5_FrequencyOfDogAndCat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        int resultCat=0;
        int resultDog=0;

        for (int i = 0; i <= sentence.length()-3; i++) {
            String str = sentence.substring(i,i+3);
            if(str.equalsIgnoreCase("Cat")){
                resultCat ++;
            }
            if(str.equalsIgnoreCase("Car")){
                resultDog ++;
            }
        }

        boolean result = resultCat == resultDog;

        System.out.println(result);



    }
}

/*



5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true




 */