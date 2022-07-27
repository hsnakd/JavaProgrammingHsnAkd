package day14_String;

import java.util.Scanner;

public class Z_6_AccountNumber_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an account number");
        String accountNumber = scan.next();

        int length = accountNumber.length();

        if (accountNumber.startsWith("2") && length == 7) {
            System.out.println("Valid");
        } else if (accountNumber.startsWith("5")  && length == 10) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid account number");
        }





    }
}
/*

  6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”



 */