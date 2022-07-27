package day18_NestedLoop;

import java.util.Scanner;

public class Z_3_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){

            int num = 0;

            System.out.println("Enter first number");
            int num1 = input.nextInt();

            System.out.println("Enter a operator (+, -, *, /)");
            String operator = input.next();
            while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {
                System.err.println("Invalid entry, enter a operator (+, -, *, /)");
                operator = input.next();
            }

            System.out.println("Enter second number");
            int num2 = input.nextInt();

            if (operator.equals("+")) {
                num = num1 + num2;
            } else if (operator.equals("-")) {
                num = num1 - num2;
            } else if (operator.equals("*")) {
                num = num1 * num2;
            } else if (operator.equals("/")) {
                num = num1 / num2;
            }
            System.out.println("num = " + num);


            System.out.println("Do you want to continue? (yes/no)");
            String Continue = input.next();

            while (!(Continue.equals("yes") || Continue.equals("no"))) {
                System.err.println("Invalid Entry, do you want to continue? (yes/no)");
                Continue = input.next();
            }
            if (Continue.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }
        }

    }
}

/*

3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */