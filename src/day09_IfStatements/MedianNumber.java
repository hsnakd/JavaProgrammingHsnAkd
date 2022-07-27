package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {



        System.out.println("--------------------------------------------------");

        // Finding median number

        int number1 = 16;
        int number2 = 16;
        int number3 = 16;

        boolean isNumber1Median = (number1 < number2 && number1 > number3) || (number1 > number2 && number1 < number3),
                isNumber2Median = (number2 < number1 && number2 > number3) || (number2 > number1 && number2 < number3),
                isNumber3Median = (number3 < number1 && number3 > number2) || (number3 > number1 && number3 < number2),
                isEqual         = (number1 == number2 || number1 == number2 || number2 == number3 || (number1 == number2) && (number2== number3));
        if (isNumber1Median) {
            System.out.println(number1 + " is the median number");
        }
        if (isNumber2Median) {
            System.out.println(number2 + " is the median number");
        }
        if (isNumber3Median) {
            System.out.println(number3 + " is the median number");
        }
        if (isEqual) {
            System.out.println("Do not enter equal numbers");
        }






        System.out.println("--------------------------------------------------");

        // Finding with maximum number and minimum number
        int number11 = 10;
        int number22 = 20;
        int number33 = 30;

        boolean isNumber11Median = ((number22 > number11 && number22 > number33 && number33 < number11) || (number33 > number11 && number33 > number22 && number22 < number11)),
                isNumber22Median = ((number11 > number22 && number11 > number33 && number33 < number22) || (number33 > number22 && number33 > number11 && number11 < number22)),
                isNumber33Median = ((number11 > number33 && number11 > number22 && number33 < number11) || (number33 > number11 && number33 > number22 && number22 < number11)),
                isEqual123         = (number11 == number22 || number11 == number22 || number22 == number33 || (number11 == number22) && (number22== number33));
        if (isNumber11Median) {
            System.out.println(number11 + " is the median number");
        }
        if (isNumber22Median) {
            System.out.println(number22 + " is the median number");
        }
        if (isNumber33Median) {
            System.out.println(number33 + " is the median number");
        }
        if (isEqual123) {
            System.out.println("Do not enter equal numbers");
        }


        System.out.println("--------------------------------------------------");

        int a = 16,
            b = 16,
            c = 18;
        // if we have three different numbers, one MUST maximum, one MUST be minimum and one MUST be Median



        //               a= 15, b= 10, c = 20    a = 15, c = 10, b = 20
        boolean aIsMedian = (a > b  && a < c) || (a > c && a < b);
            /*
            in order for a to be the median number:
                    1. if c is the maximum number & b is the minimum number, then a is the median number
                    2. if b is the maximum number & c is the minimum number, then a is the median number
             */

        //              b=15, a = 20, c = 10,       b= 15,  a = 10, c= 20
        boolean bIsMedian = (b > c && b < a)  || (b > a && b < c);
        /*
        in order of b to be the median number:
         */


        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if(aIsMedian){ //if a is the median number
            System.out.println(a+" is the median number");
        }

        if( bIsMedian){ //if b is the median number
            System.out.println(b+" is the median number");
        }

        if(cIsMedian){ //if c is the median number
            System.out.println(c+" is the median number");

            System.out.println("--------------------------------------------------");




        }

    }
}


/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number
			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
 */