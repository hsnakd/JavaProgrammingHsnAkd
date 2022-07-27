package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");


        int number1 = 50;
        int number2 = 60;

        boolean minimumNumber = number1 > number2;
        boolean equal = number1 == number2;

        if (equal) {
            System.out.println("Equal");
        }else if (minimumNumber) {
            System.out.println(number2 + " is the minimum number");
        } else  {
            System.out.println(number1 + " is the minimum number");
        }

        System.out.println("--------------------------------------------------");


        int number3 = 50;
        int number4 = 50;

        boolean isNumber1Minimum = number3 < number4,
                isNumber2Minimum = number3 > number4,
                equal2 = number3 == number4;

        if (isNumber1Minimum) {
            System.out.println(number3 + " is the minimum number");
        }
        if (isNumber2Minimum) {
            System.out.println(number4 + " is the minimum number");
        }
        if (equal2) {
            System.out.println(number3 + " and " + number4 + " are equal.");
        }


        System.out.println("--------------------------------------------------");


        int n1 = 200,
            n2 = 100;

        boolean n1IsMin = n1 < n2,
                n2IsMin = n2 < n1,
                isEqual =  n1 == n2;

/*
        if(n1 < n2){
            System.out.println(n1+" is the minimum number");
        }
*/

        if(n1IsMin){ //if n1 is the minimum number
            System.out.println(n1+" is the minimum number");
        }

        if (n2IsMin){ //if n2 is the minimum number
            System.out.println(n2+" is the minimum number");
        }

        if(isEqual){ //if n1 is equal to n2
            System.out.println("Equal");
        }


    }

}

/*
1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal
			Ex:
				n1= 100, n2 = 200;
			output:
				100 is the minimum number
			n1 & n2
			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */



