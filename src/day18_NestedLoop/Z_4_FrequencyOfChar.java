package day18_NestedLoop;

import java.util.Scanner;

public class Z_4_FrequencyOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
/*
4. Write a program that can find the frequency of the characters from a string

        Ex:
        str = "aabcccd";

        output:
        a2b1c3d1


        Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters


 */
