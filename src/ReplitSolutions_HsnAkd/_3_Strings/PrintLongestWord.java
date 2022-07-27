package ReplitSolutions_HsnAkd._3_Strings;

import java.util.Scanner;

public class PrintLongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        int length1 = word.length()/2;

        String result1 = word.substring(0,length1);
        String result2 = result1.repeat(2);
        System.out.println(result2);







    }

    }

