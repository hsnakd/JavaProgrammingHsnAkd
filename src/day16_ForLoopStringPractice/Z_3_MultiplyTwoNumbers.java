package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Z_3_MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiply = 0;
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for (int i = 1; i <= num1; i++) {
            multiply += num2;
        }

        System.out.println(multiply);
    }


}


/*


3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200


 */