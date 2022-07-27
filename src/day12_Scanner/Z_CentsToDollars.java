package day12_Scanner;

import java.util.Scanner;

public class Z_CentsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents");
        int cents = input.nextInt();

        int dollars = cents/100;
        int remainderCent = cents - (dollars*100);

        System.out.println(cents + " cents equal to: " + dollars + " dollars and " + remainderCent + " cents");

        System.out.println("---------------------------------------------------------------");


        System.out.println("Enter cents");
        int cent = input.nextInt();
        input.close(); // we no longer need scanner after this line

        int dollar = cent / 100;

        cent -= dollar * 100; // or: cent = cent - (dollar * 100)

        System.out.println(dollar+" dollars and "+cent+" cents");


    }
}

/*
3. Write a program that can convert cents to dollars,
if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents


 */