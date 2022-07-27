package day09_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {


        System.out.println("--------------------------------------------------");

        int n1 = 6;
        int n2 = 6;

        if (n1 > n2) {
            System.out.println(n1 + " is maximum number");
        } else if (n1 < n2) {
            System.out.println(n2 + " is maximum number");
        } else {
            System.out.println(n1 + " and " + n2 + " are equal.");
        }

        System.out.println("--------------------------------------------------");







    }
}
/*
3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal
        Ex:
            n1= 100, n2 = 200;
        output:
            200 is maximum number
 */
