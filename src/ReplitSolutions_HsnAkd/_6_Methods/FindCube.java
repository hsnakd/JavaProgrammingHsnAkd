package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class FindCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        cube(num);
    }
    //your code here
    public static void cube (int num){
        int cube = num * num * num;

        System.out.println(cube);
    }
    //end cube
}

/*
Create a method called cube. It is a void method with no arguments.
Write all required code inside this method in order to asks the user for a number and
then prints the cubed value of that number:

Example:

input: 5

output: 125
hint: cube of a number n = n^3
 */