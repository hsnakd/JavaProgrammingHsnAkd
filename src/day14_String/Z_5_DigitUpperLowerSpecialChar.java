package day14_String;

import java.util.Scanner;

public class Z_5_DigitUpperLowerSpecialChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Enter a word");
        String word = input.next();

        char ch = word.charAt(0);

        if (ch >=48 && ch <= 57){
            System.out.println("first character is digit");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("first character is lowercase letter");
        } else if (ch >= 65 && ch <= 90) {
            System.out.println("first character is uppercase letter");
        }else {
            System.out.println("first character is special character");
        }


        System.out.println("-----------------------------------------------------------");


        System.out.println("Enter a word:");
        String word2 = input.next();

        input.close();

        char firstChar = word2.charAt(0);
        String result = "";

        if(firstChar >= '0' && firstChar <= '9'){
            result = "first character is digit";
        }else if(firstChar >= 'a' && firstChar <= 'z'){
            result = "first character is lowercase letter";
        }else if(firstChar >= 'A' && firstChar<= 'Z'){
            result = "first character is uppercase letter";
        }else{
            result = "first character is special character";
        }

        System.out.println(result);





    }
}
/*


    5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is uppercase letter"
        if the word starts with lowercase letters, print "first character is lowercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table



 */