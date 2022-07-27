package day13_String;


import java.util.Scanner;

public class Z_10_TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split:");
        String split = input.next().toLowerCase();

        System.out.println("Number of people:");
        int numberOfPeople = input.nextInt();

        System.out.println("Check amount:");
        double checkAmount = input.nextDouble();


        System.out.println("Service Quality:");
        String serviceQuality = input.next().toLowerCase();

        String ch = "&";
        String people = ch.repeat(numberOfPeople);
        System.out.println("Number of people entered: " + people);
        double result = 0;


        if (serviceQuality == "poor") {
            result = ((checkAmount * 5 / 100) + checkAmount);
        } else if (serviceQuality.equals("fair")) {
            result = ((checkAmount * 10 / 100) + checkAmount);
        } else if (serviceQuality.equals("good")) {
            result = ((checkAmount * 15 / 100) + checkAmount);
        } else if (serviceQuality.equals("great")) {
            result = ((checkAmount * 20 / 100) + checkAmount);
        } else if (serviceQuality.equals("excellent")) {
            result = ((checkAmount * 25 / 100) + checkAmount);
        }
        System.out.println("Total to pay: " + result);


        System.out.println("Total tip: " + (result - checkAmount));

        System.out.println("Total per person: " + (result / numberOfPeople));

        System.out.println("Tip per person: " + ((result - checkAmount) / numberOfPeople));





/*
 Write a program for a tip calculator.

 There will be different service quality benchmarks that will determine the tip given.

 There will also the ability to calculate based on the number of people in the party and
 if there is a split of the bill or not.

Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%

The program should display the following information based on the user input:

Split or No split (Yes or No)
Number of people entered: (number) (each person = & in output)
Check amount: (number) Service Quality: (String)
Total to pay:
Total tip: Total per person:

Tip per person:



Example

Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75

 */

    }
}
