package day17_While_DoWhile;

import java.util.Scanner;

public class Z_1_DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int count = 0; // count = 1+1=2+1 = 3+1 =4

        while (a >= b) {
            a -= b;
            count++;
        }
        System.out.println(count + " with a remainder of " + a);



    }
}


/*

	1. Write a program that can divide two positive numbers
	without using / (division) and * (multiplication) operators.

 */