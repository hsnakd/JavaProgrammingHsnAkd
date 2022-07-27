package ReplitSolutions_HsnAkd._3_Strings;

import java.util.Scanner;

public class HasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        int length1 = word.length();

        if (length1 >= 4){


        char ch1 = word.charAt(0);
        char ch2 = word.charAt(1);
        char ch3 = word.charAt(2);
        char ch4 = word.charAt(3);
        char ch5 = word.charAt(4);

        String w1 =  "" +  ch1 + ch2 + ch3 + ch4;
        String w2 =  "" +  ch2 + ch3 + ch4 + ch5;

        if (w1.contains("java") || w2.contains("java")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        } else {
            System.out.println("false");

        }


    }


    }

