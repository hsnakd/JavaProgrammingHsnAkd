package day19_LoopPractices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Z_1_CircleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        while (true){


            System.out.println("Enter the radius of the circle:");
            double radius = input.nextDouble();

            if (radius <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            } else if (radius > 0) {
                double diameter = 2 * radius;
                double area = Math.PI * Math.pow(radius,2);
                double perimeter = 2 * Math.PI * radius;

                System.out.println(diameter);
                System.out.println(area);
                System.out.println(perimeter);
            }

            System.out.println("Would you like to calculate another circle?");
            String answer = input.next();

            while( !( answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no") ) ){
                System.out.println("Invalid Entry, would you like to calculate another circle?");
                answer = input.next();
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Car Calculator APP");
                System.exit(0);
            }
        }

    }
}
 /*
 1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				 "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Car Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry


  */