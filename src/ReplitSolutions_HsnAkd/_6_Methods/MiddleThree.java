package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        if ((word.length() %2 == 0) || (word.length() < 4)) {
            System.out.println("invalid");
        } else{
            for (int i = word.length()/2-1; i < word.length()/2+2; i++) {
                System.out.print(word.charAt(i));
            }
        }

    }
}

/*
Given a String variable word print the middle three characters
if the word is an odd number of characters and has more than 5 characters.
If the word does not meet the requirements print invalid.

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */