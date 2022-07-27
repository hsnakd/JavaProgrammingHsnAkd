package day13_String;

import java.util.Scanner;

public class Z_9_Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();


        // TASK_2

        int ch = word.length();
        char ch1 = word.charAt(0);
        char ch2 = word.charAt(1);
        char ch3 = word.charAt(2);
        char ch4 = word.charAt(3);
        char ch5 = word.charAt(4);


        if (ch == 5) {
            System.out.println(""+ ch5+ch4+ch3+ch2+ch1);
        } else if (ch < 5) {
            System.out.println("Too short!");
        } else if (ch > 5) {
            System.out.println("Too long!");
        }



    }
}


/*

9.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.




 */

        
