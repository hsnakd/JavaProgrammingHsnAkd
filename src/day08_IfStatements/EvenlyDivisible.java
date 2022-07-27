package day08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;

        boolean isDivisibleBy2 = number % 2 == 0;
        System.out.println(number + " divisibleBy2 = " + isDivisibleBy2);

        boolean isDivisibleBy3 = number % 3 == 0;
        System.out.println(number + " divisibleBy3 = " + isDivisibleBy3);

        boolean isDivisibleBy5 = number % 5 == 0;
        System.out.println(number + " divisibleBy5 = " + isDivisibleBy5);

        System.out.println("-------------------------------");

        int year = 2000;

        boolean isLeapYear = year % 4 == 0;
        System.out.println(year + " is Leap Year = " + isLeapYear);




/*
2. Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */





    }


}
