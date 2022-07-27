package day14_String;

import java.util.Scanner;

public class Z_6_AccountNumber_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an account number");
        String accountNumber = scan.next();

        boolean ch2 = accountNumber.startsWith("2");
        boolean ch5 = accountNumber.startsWith("5");
        boolean accountNumber7 = (accountNumber.length()==7);
        boolean accountNumber10 = (accountNumber.length()==10);

        String result = "";

        result = (ch2==true && accountNumber7==true)? "account number is valid" :
                 (ch5==true && accountNumber10==true)?  "account number is valid" :
                 "Invalid account number" ;

        System.out.println(result);
        scan.close();





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