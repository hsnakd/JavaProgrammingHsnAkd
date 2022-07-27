package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class FibonacciNumbers_Important {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int k = 0;
        int j = 1;
        for (int i = 0; i < num; i++) {
            int sum =  k+j;
            k = j;
            j=sum;
        }


        System.out.println(k);


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
