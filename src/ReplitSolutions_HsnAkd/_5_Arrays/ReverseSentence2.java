package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Scanner;

public class ReverseSentence2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here


        String [] word = sentence.split(" ");

        for (int i = word.length - 1; i >= 0; i--) {
            reversed += word[i] + " ";
        }


        //End your code here. do not modify below statement
        System.out.println(reversed.trim());

        System.out.println("----------------------------------------");




        reversed="";
        for (int i = word.length - 1; i > 0; i--) {
            reversed += word[i] + " ";
        }
        reversed += word[0];


        //End your code here. do not modify below statement
        System.out.println(reversed);



    }
}

/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
 */