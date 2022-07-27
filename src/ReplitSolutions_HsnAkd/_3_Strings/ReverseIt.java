package ReplitSolutions_HsnAkd._3_Strings;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        int length1 = word.length();
        if (length1 == 5){

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(1);
        char ch3 = word.charAt(2);
        char ch4 = word.charAt(3);
        char ch5 = word.charAt(4);
            System.out.println(""+ ch5+ch4+ch3+ch2+ch1);


        } else if (length1 < 5){
            System.out.println("Too short!");
        } else if (length1 > 5){
            System.out.println("Too long!");
        }else{
        }












    }

    }

