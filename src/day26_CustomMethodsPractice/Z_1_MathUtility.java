package day26_CustomMethodsPractice;

public class Z_1_MathUtility {
    public static void main(String[] args) {

    //		2.1 Create a method that can return the sum of two integers
        int sum = sum(10,2);
        System.out.println("sum = " + sum);

    //      2.2 Create a method that can return the sum of two decimal numbers
        double sum2 = sum(10.0,2.5);
        System.out.println("sum = " + sum2);

    //      2.3 Create a method that can return the subtraction of two integers
        int subtraction = subtraction(10,2);
        System.out.println("subtraction = " + subtraction);

    //      2.4 Create a method that can return the subtraction of two decimals
        double subtraction2 = subtraction(10.0,2.5);
        System.out.println("subtraction = " + subtraction2);

    //      2.5 Create a method that can return the multiplication of two integers
        int multiplication = multiplication(10,2);
        System.out.println("multiplication = " + multiplication);

    //      2.6 Create a method that can return the multiplication of two decimals
        double multiplication2 = multiplication(10.0,2.5);
        System.out.println("multiplication = " + multiplication2);

    //      2.7 Create a method that passes two int parameters and return the division result
        int division = division(10,2);
        System.out.println("division = " + division);

    //      2.7 Create a method that passes two double parameters and return the division result
        double division2 = division(10.0,2.5);
        System.out.println("division = " + division2);

    //      2.8 Create a method that can check if an integer is even number
        System.out.println("even number = " + even(2));

    //      2.9 Create a method that can check if an integer is odd number
        System.out.println("odd number = " + odd(2));

    //      2.10 Create a method that can return the maximum number between two integers
        int max = max(10,2);
        System.out.println("max = " + max);

    //      2.11 Create a method that can return the maximum number between two decimal number
        double max2 = max(10.0,2.5);
        System.out.println("max = " + max2);

    //      2.12 Create a method that can return the minimum number between two integers
        int min = min(10,2);
        System.out.println("min = " + min);

    //      2.13 Create a method that can return the minimum number between two decimal numbers
        double min2 = min(10.0,2.5);
        System.out.println("min = " + min2);

    //      2.14 Create a method that can return the square of an integer
        int square = square(10);
        System.out.println("square = " + square);

    //		2.15 Create a method that can return the square of a double
        double square2 = square(10);
        System.out.println("square = " + square2);

    //		2.16 Create a method that can return the cube of an integer
        int cube = cube(10);
        System.out.println("cube = " + cube);

    //		2.17 Create a method that can return the cube of a double
        double cube2 = cube(10);
        System.out.println("cube = " + cube2);

    }




    // TODO :





    //		2.1 Create a method that can return the sum of two integers
    public static int sum (int num1, int num2){
        int result = num1 + num2;
        return result;
    }

	//		2.2 Create a method that can return the sum of two decimal numbers
    public static double sum (double num1, double num2){
        double result = num1 + num2;
        return result;
    }

    //		2.3 Create a method that can return the subtraction of two integers
    public static int subtraction (int num1, int num2){
        int result = num1 - num2;
        return result;
    }

    //		2.4 Create a method that can return the subtraction of two decimals
    public static double subtraction (double num1, double num2){
        double result = num1 - num2;
        return result;
    }

    //		2.5 Create a method that can return the multiplication of two integers
    public static int multiplication (int num1, int num2){
        int result = num1 * num2;
        return result;
    }

    //		2.6 Create a method that can return the multiplication of two decimals
    public static double multiplication (double num1, double num2){
        double result = num1 * num2;
        return result;
    }

    //		2.7 Create a method that can return the division of two integers
    public static int division (int num1, int num2){
        int result = num1 / num2;
        return result;
    }

    //		2.7 Create a method that can return the subtraction of two decimals
    public static double division (double num1, double num2){
        double result = num1 / num2;
        return result;
    }

    //      2.8 Create a method that can check if an integer is even number
    public static boolean even (int num1){
        return (num1 % 2 == 0);
    }

    //      2.9 Create a method that can check if an integer is odd number
    public static boolean odd (int num1){
        return (num1 % 2 != 0);
    }

    //      2.10 Create a method that can return the maximum number between two integers
    public static int max (int num1, int num2){
        int result=0;
        if (num1 > num2) {
            result = num1;
        }else if (num1 < num2) {
            result = num2;
        }
    return result;
    }
    //      2.11 Create a method that can return the maximum number between two decimal number
    public static double max (double num1, double num2){
        double result=0;
        if (num1 > num2) {
        result = num1;
        }else if (num1 < num2) {
            result = num2;
        }
        return result;
    }
    //      2.12 Create a method that can return the minimum number between two integers
    public static int min (int num1, int num2){
        int result=0;
        if (num1 > num2) {
            result = num2;
        }else if (num1 < num2) {
            result = num1;
        }
        return result;
    }
    //      2.13 Create a method that can return the minimum number between two decimal numbers
        public static double min (double num1, double num2){
            double result=0;
            if (num1 > num2) {
                result = num2;
            }else if (num1 < num2) {
                result = num1;
            }
            return result;
        }
    //      2.14 Create a method that can return the square of an integer
    public static int square (int num1){
        int result = num1 * num1;
        return result;
    }
	//		2.15 Create a method that can return the square of a double
    public static double square (double num1){
        double result = num1 * num1;
        return result;
    }
	//		2.16 Create a method that can return the cube of an integer
    public static int cube (int num1){
        int result = num1 * num1 * num1;
        return result;
    }
	//		2.17 Create a method that can return the cube of a double
    public static double cube (double num1){
        double result = num1 * num1 * num1;
        return result;
    }
}

/*
1. Create a class called MathUtility under the utility package:

			2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers

			2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals

			2.5 Create a method that can return the multiplication of two integers
			2.6 Create a method that can return the multiplication of two decimals

			2.7 Create a method that passes two double parameters and return the division reslt

			2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number

			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers

			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers

			2.14 Create a method that can return the square of an integer
			2.15 Create a method that can return the square of a double

			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double

 */