package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Z_9_AverageNumber {
    public static void main(String[] args) {

        ArrayList <Integer> num = new ArrayList<>();
        ArrayList <Integer> num2 = new ArrayList<>();

        num.addAll(Arrays.asList(6,2,3,4,5));

        int sum = 0;
        int count = 0;
        for (Integer each : num) {
            sum += each;
            count++;
        }
        double ave = sum / count;
        System.out.println("Sum : " + sum);
        System.out.println("Ave : " + ave);

    }
}

/*
	2. Write a program that can find the average number from an arrayList of integers

 */