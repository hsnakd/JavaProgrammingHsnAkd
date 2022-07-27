package day17_While_DoWhile;

import java.util.Scanner;

public class Z_2_SumOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0;
        int num1 = 0;

        while (true) {
            if (num1 < 0) {
                break;
            } else {
            System.out.println("Enter a number");
            num1 = input.nextInt();

            num += num1;
            }
        }
        System.out.println("num = " + num);

    }
}


/*


	2. Write a program that calculates the sum of numbers entered by the user
	until user enters a negative number.

            hint: you need an infinite loop



 */