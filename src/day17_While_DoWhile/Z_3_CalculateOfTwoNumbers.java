package day17_While_DoWhile;

import java.util.Scanner;

public class Z_3_CalculateOfTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0;
        int num1 = 0;
        int num2 = 0;

        while (true) {
            if (num1 < 0 || num2 < 0) {
                break;
            } else {

                System.out.println("Enter first number");
                num1 = input.nextInt();
                System.out.println("Enter second number");
                num2 = input.nextInt();
                System.out.println("Enter a operator (+, -, *, /)");
                char operator = input.next().charAt(0);

                if (operator == '+') {
                    num = num1 + num2;
                } else if (operator == '-') {
                    num = num1 - num2;
                } else if (operator == '*') {
                    num = num1 * num2;
                } else if (operator == '/') {
                    num = num1 / num2;
                }

                System.out.println("num = " + num);

            }

        }





    }
}


/*


	2. Write a program that calculates the sum of numbers entered by the user
	until user enters a negative number.

            hint: you need an infinite loop



 */