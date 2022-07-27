package ReplitSolutions_HsnAkd._4_Loops;

import java.util.Scanner;

public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();
        System.out.println("Enter a separator");
        String separator = scan.next();
        System.out.println("Enter a number");
        int count = scan.nextInt();

        System.out.print(word);

        for (int i = 1; i < count; i++) {

            System.out.print(separator);

            System.out.print(word);

        }

        System.out.println("");
        System.out.println("--------------------------------------");




        int i = 1;
        System.out.print(word);
        do {
            System.out.print(separator);
            System.out.print(word);
            i++;
        } while (i<count);



    }
}


/*

Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

Example:

input:
Word
X
3

output: WordXWordXWord
Example:

input:
This
And
2

output: ThisAndThis
Example:

input:
This
And
1

output: This


 */