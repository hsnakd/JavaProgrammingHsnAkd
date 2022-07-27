package day15_ForLoop;

import java.util.Scanner;

public class Z_6_SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "A1B2C3D4";

        int digits = 0; //1234

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str (0 ~ last index)

            int ch = str.charAt(i); // ch:each character that we have in str

            if(ch >= 48 && ch <= 57){ //if the character is between '0' to '9' then it's digit
                digits += ch-48;
            }

        }

        System.out.println("digits = " + digits);


    }

}


/*

    6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...


 */