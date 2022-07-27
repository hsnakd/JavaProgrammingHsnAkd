package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal_hsnakd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me? (Yes/No)");
        String answer = input.next();

        while (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))) {
            System.out.println("Invalid answer, please re-enter");
            System.out.println("Will you marry me? (Yes/No)");
            answer = input.next();
        }
        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("Congrats");
        } else if (answer.equalsIgnoreCase("No")) {
            System.out.println("Goodbye");
        } else {

            }



    }

}
/*
1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats"
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */