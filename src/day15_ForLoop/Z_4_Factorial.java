package day15_ForLoop;

import java.util.Scanner;

public class Z_4_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        long factorial =1l;
        for (int i = 1; i <= number; i++) {

            factorial *= i;

        }
        System.out.println(factorial);



    }
}



/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2 * 1 = 120 )

 */