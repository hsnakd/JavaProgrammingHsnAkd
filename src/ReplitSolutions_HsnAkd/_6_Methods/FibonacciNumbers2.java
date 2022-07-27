package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class FibonacciNumbers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE



        int num1 = 0;
        int num2 = 1;
        int sum = 0;


        String series = "" + num1 + " " + num2 + " ";

        boolean check = true;
        for(   ; check ;  ){
            if(num > 2){
                for (int i = 2; i<=num ; i++){
                    sum = num1 + num2;
                    series += sum + " ";
                    num1 = num2;
                    num2 = sum;
                }
            }else if (num ==1) {
                num2 = 0;
            }else if (num ==2) {
                num2 = 1;
            }
            check = false;
        }



        System.out.println(num2);




    }
}
/*
Complete a method fib() that will compute Fibonacci numbers

In the Fibonacci series, the next number is the sum of previous two numbers. For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc... The first two numbers of the Fibonacci series are 0 and 1. (Counting starts with an index 0, so the 0th number is 0, 1st number is 1, etc)

You are given a number num, print n-th Fibonacci Number.

Examples:

Input  : 2
Output : 1
(Explanation : because number 2 in the sequence of 0, 1, 1 --> 1)
Input  : 8
Output : 21
(Explanation : because number 8 in the sequence of
  0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)
 */
