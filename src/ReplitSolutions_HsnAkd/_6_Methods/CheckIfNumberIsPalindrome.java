package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class CheckIfNumberIsPalindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean check = isPalindrome(num);
        System.out.println(check);
    }

    public static boolean isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int digit = 0;
        int sum = 0;
        int temp = 0;
        

        temp=num;
        
        while(num > 0){
            digit = num % 10;
            sum = (sum * 10) + digit;
            num = num / 10;
        }

            boolean result = (temp==sum) ;


        return result;
    }

}

/*
Complete the method isPalindrome() that will check if number is a palindrome.
Print your result as a boolean (true or false).

Challenge: Do not convert int into a string!

Examples:

input: 1001

output: true
input: 1234

output: false
 */
