package ReplitSolutions_HsnAkd._4_Loops;

import java.util.Scanner;

public class PrintLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        String letters ="";

        for (char i = start; i <= end; i++) {
            letters += i;

        }System.out.print(letters);




    }
}


/*

Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Example:

input:
A
Z_5_UniqueChar

output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Example:

input:
a
f

output: abcdef
Example:

input:
a
d

output: abcd
Example:

input:
B
O

output: BCDEFGHIJKLMNO


 */