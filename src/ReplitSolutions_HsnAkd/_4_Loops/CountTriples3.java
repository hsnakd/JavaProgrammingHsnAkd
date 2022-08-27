package ReplitSolutions_HsnAkd._4_Loops;

import java.util.Scanner;

public class CountTriples3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        int container =0;

        //a b c f f f f f f f f  d  h
        //0 1 2 3 4 5 6 7 8 9 10 11 12
        for ( int i =0; i < str.length()-2; i++ ) {
            count=0;
            String ch = str.substring(i,i+3);
            for (int j = 0; j < ch.length() ; j++) {
                char each = ch.charAt(j);
                for (int k = 0; k < ch.length(); k++) {
                    if ( ch.charAt(k) == each ){
                        count++;
                        if (count==9) {
                            container++;
                        }
                    }
                }
            }
        }
        System.out.println(container);
        scan.close();

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

input: cube

output: 0

 */