package day13_String;

import java.util.Scanner;

public class Z_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String word2 = input.nextLine();

        

        // TASK_4


        char ch41 = word.charAt(0);
        char ch42 = word2.charAt(0);

        String ch43 = String.valueOf(ch41);
        String ch44 = String.valueOf(ch42);

        System.out.println("ch43 = " + ch43);
        System.out.println("ch44 = " + ch44);
        System.out.println(ch43.toUpperCase()+ch44.toUpperCase());



    }
}


/*
      4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output




 */

        
