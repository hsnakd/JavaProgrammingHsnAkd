package day13_String;

import java.util.Scanner;

public class Z_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();


        int ch1 = word.length();

        if (ch1 == 3){
            char ch6 = word.charAt(1);
            if (ch6 == 'a') {
                System.out.println("Cool word");
            } else {
                System.out.println("Okay word");

            }
        } else if (ch1 > 3) {
            System.out.println("Word is too long");
        } else if (ch1 < 3) {
            System.out.println("Word is too short");
        }


    }
}


/*

6. write a program that asks the user enter a three letter word.
Check if the middle character of the given word is 'a'.
In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".

     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"



 */

        
