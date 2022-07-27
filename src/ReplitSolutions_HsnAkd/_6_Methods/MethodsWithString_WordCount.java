package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithString_WordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

    public static int wordCount(String words) {
        int result = 1;


        for (int i = 0; i < words.length(); i++) {

            if (words.charAt(i) == ' ') {
                result++;
            }

        }



        return result;
    }

}

/*
wordCount accepts String and returns how many words are in the given String

Example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1

Hint: look at spaces
 */