package day11_Switch_Scanner;

import java.util.Scanner;

public class Z_ShortVideo_Scanner_NextLine2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int data3 = input.nextInt();

        input.nextLine();  // for clear scanner memory


        System.out.println("Enter your full name");
        String data4 = input.nextLine();

        System.out.println("data3 = " + data3);
        System.out.println("data4 = " + data4);


    }


}
