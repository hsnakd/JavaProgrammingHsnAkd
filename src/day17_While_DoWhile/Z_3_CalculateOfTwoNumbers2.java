package day17_While_DoWhile;

import java.util.Scanner;

public class Z_3_CalculateOfTwoNumbers2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        System.out.println("Enter your math operator");
        char ch = scan.next().charAt(0);

        while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
            System.err.println("Invalid Operator, please re-enter:");
            ch = scan.next().charAt(0);
        }

        double result = 0;

        if (ch == '-') {
            result = num1 - num2;
        } else if (ch == '+') {
            result = num1 + num2;
        } else if (ch == '*') {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }

        System.out.println(result);
        scan.close();


    }
}


/*


	2. Write a program that calculates the sum of numbers entered by the user
	until user enters a negative number.

            hint: you need an infinite loop


???????????????????????????????

 */