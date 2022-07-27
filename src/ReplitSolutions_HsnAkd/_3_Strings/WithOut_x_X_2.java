package ReplitSolutions_HsnAkd._3_Strings;

import java.util.Scanner;

public class WithOut_x_X_2 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String f = ""+word.charAt(0);
        String l = ""+word.charAt(word.length()-1);
        String word1 = word.replace("x","");
        String word2 = word.replace("X","");


        if (f.equals("x")||l.equals("x")||f.equals("X")||l.equals("X")){

            if(f.equals("x")&&l.equals("x")){
                System.out.println(word1);
            } else if (f.equals("X")&&l.equals("X")) {
                System.out.println(word2);
            } else if (f.equals("x")&&l.equals("X")) {
                System.out.println(word.substring(1,word.lastIndexOf("X")));
            }else if (f.equals("X")&&l.equals("x")) {
                System.out.println(word.substring(1,word.lastIndexOf("x")));
            }else if (f.equals("X")) {
                System.out.println(word.substring(1));
            }else if (f.equals("x")) {
                System.out.println(word.substring(1));
            }else if (l.equals("X")) {
                System.out.println(word.substring(0,word.lastIndexOf("X")));
            }else if (l.equals("x")) {
                System.out.println(word.substring(0,word.lastIndexOf("x")));
            }
        }else {
            System.out.println(word);
        }
        scan.close();




    }

    }

/*

Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX

output: Hi
input: apple

output: apple
input: xUxL

output: UxL
input: JavaX

output: Java

 */