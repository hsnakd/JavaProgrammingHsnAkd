package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        plus();
    }

    public static void plus(){

        //your code here
        Scanner input = new Scanner(System.in);

        System.out.println("enter first number:");
        int first = input.nextInt();
        System.out.println("enter second number:");
        int second = input.nextInt();

        int sum = first + second;
        System.out.println("result: " + sum);

    }
}

/*
Implement the plus method. The return is void and has no arguments.

The method should ask the user to input two numbers, then it will add them and print the result.

Hint: Create a scanner within plus method.

Example:

enter first number:
1

enter second number:
2

result: 3
 */