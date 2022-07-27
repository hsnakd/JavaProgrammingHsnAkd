package practice;

import java.util.Scanner;

public class Z_FindMidNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = input.nextInt();
        System.out.println("Enter second number:");
        int number2 = input.nextInt();
        System.out.println("Enter third number:");
        int number3 = input.nextInt();



        boolean isNumber1Median = (number1 < number2 && number1 > number3) || (number1 > number2 && number1 < number3),
                isNumber2Median = (number2 < number1 && number2 > number3) || (number2 > number1 && number2 < number3),
                isNumber3Median = (number3 < number1 && number3 > number2) || (number3 > number1 && number3 < number2),
                isEqual         = (number1 == number2 || number1 == number2 || number2 == number3 || (number1 == number2) && (number2== number3));
        if (isNumber1Median) {
            System.out.println("Medium value is: " + number1);
        }
        if (isNumber2Median) {
            System.out.println("Medium value is: " + number2);
        }
        if (isNumber3Median) {
            System.out.println("Medium value is: " + number3);
        }



    }
}

/*

Write a program that will return mid number out of three numbers. No need to do any calculations.

Create an object of Scanner class.

Declare int 3 variables: num1, num2, num3.

Example:

Enter first number:
14
Enter second number:
52
Enter third number:
25

Medium value is: 25
Enter first number:
140
Enter second number:
34
Enter third number:
1

Medium value is: 34

 */