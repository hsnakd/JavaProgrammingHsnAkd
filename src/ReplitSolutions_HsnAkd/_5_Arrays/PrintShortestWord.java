package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Scanner;

public class PrintShortestWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        //TODO.write your code below


        String minLength = "null";

        minLength = str[0];

        for( int i = 0, j=0; i < str.length; i ++) {
            for( j =i+1; j < str.length; j++) {
                if(minLength.length() > str[j].length()) {
                    minLength = str[j];
                }
            }
        }
        System.out.println(minLength);


    }
}

/*
Write a program that will print the shortest word in the given array str.

input: java, cable, red, vivid, remedy, grace

output: red
 */