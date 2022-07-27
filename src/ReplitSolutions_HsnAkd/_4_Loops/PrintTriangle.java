package ReplitSolutions_HsnAkd._4_Loops;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {

        int i;
        int j;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for ( i = 1; i <= n; i++) {
            for ( j = 1; j <=i; j++) {
            System.out.print("*");
            }
            System.out.println("");
        }


    }
}
/*

Write a program that will create a triangle of asterisks based on size n.

Example:

input: 5

output:
*
**
***
****
*****
Example:

input: 3

output:
*
**
***

 */