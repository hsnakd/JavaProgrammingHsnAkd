package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args){

        System.out.println("Enter your age:");  // -20
        int age = new Scanner(System.in).nextInt();

        if(age < 0){
           throw new InputMismatchException("Age can not be negative: "+age);
        }

        if(age > 21){
            System.out.println("You are eligible");
        }else{
            throw new RuntimeException("You must be at least 21 years old");
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");


    //   throw new Exception("Exception Error");

    // Giving compile error ==> check exception
    // 1. Add exception to method signature (public static void main(String[] args) throws Exception {
    // 2. Surround with try/catch

    }


}
