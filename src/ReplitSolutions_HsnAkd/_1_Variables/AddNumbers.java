package ReplitSolutions_HsnAkd._1_Variables;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter 3 numbers:");
        int first = scan.nextInt();

        int second = scan.nextInt();

        int third = scan.nextInt();

        int sum = first + second + third;

        System.out.println( "Sum of numbers: " + sum);


    }
}

/*
In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

Declare integer variables num1, num2, num3, sum.

Create a Scanner object named scan.

Flow:

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"
 */