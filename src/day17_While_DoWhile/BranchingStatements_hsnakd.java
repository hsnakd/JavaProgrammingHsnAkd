package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements_hsnakd {

    public static void main(String[] args) {

        System.out.println("---------------------------------");
        Scanner input = new Scanner(System.in);


        while (true){
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number < 0) {
                break;
            }
        }





        System.out.println("---------------------------------");




    }


}
