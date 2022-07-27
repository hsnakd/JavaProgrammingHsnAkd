package ReplitSolutions_HsnAkd._4_Loops;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE


        for (int i = 0; i < str.length(); i++) {
            if(i < str.length()-2) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            char ch3 = str.charAt(i+2);

                if(ch1 == ch2 && ch1 == ch3){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

/*

Print out the number of times that the string "hi" appears anywhere in the given string.
Only lowercase "hi" should be counted.

Example:

We'll say that a "triple" in a string is a char appearing three times in a row.
Print out the number of triples in the given string. The triples may overlap.

Example:

input: abcXXXabc

output: 1
Example:

input: xxxabyyyycd

output: 3
Example:

input: java

output: 0

 */