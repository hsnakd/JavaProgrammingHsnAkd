package day12_Scanner;

    // import java.util.*; wild import : imports everything from the package

import java.util.Scanner; // regular import : imports one class from the package

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between from 1 to 7");

        int num = scan.nextInt();
        String result ;

        if (num >= 1 && num <= 7){
           result =  (num == 1) ? "Mon" :  (num == 2) ? "Tue" : (num == 3) ? "Wed" : (num == 4) ? "Thu" 
                    : (num == 5) ? "Fri" : (num == 6) ? "Sat" : "Sun";
            System.out.println("result = " + result);

        } else {
            System.out.println("Invalid Number");
        }

        scan.close();


    }
}
