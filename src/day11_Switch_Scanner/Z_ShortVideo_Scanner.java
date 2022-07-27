package day11_Switch_Scanner;

import java.util.Scanner;

public class Z_ShortVideo_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer number");
        int data1 = input.nextInt();

        System.out.println("Enter a decimal number");
        double data2 = input.nextDouble();

        System.out.println("Enter 3 word");
        String data3 = input.next();

        System.out.println("Enter a word");
        String data4 = input.nextLine();

        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
        System.out.println("data3 = " + data3);
        System.out.println("data4 = " + data4);

    }


}
