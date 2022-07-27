package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven_hsnakd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true){
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("EVEN NUMBER");
            } else if (number % 2 != 0) {
                System.out.println("ODD NUMBER");
            }

            System.out.println("Would you like to enter another number");
            String answer = input.next();

            while( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ){
                System.out.println("Invalid entry please re-enter");
                answer = input.next();
            }
                if (answer.equalsIgnoreCase("no")) {
                    break;
                }



        }



    }

}
/*
2. Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enters invalid answer, repeat the previous steps

 */