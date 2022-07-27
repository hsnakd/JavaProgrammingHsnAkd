package ReplitSolutions_HsnAkd._3_Strings;

import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        int length1 = word1.length();
        int length2 = word2.length();

        if (length1>length2){
            System.out.println(word1);
        } else if (length1<length2){
            System.out.println(word2);
        }







    }

    }

