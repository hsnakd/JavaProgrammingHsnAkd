package ReplitSolutions_HsnAkd._7_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimesTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }
    //create your method below
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
        ArrayList<Integer> result1 = new ArrayList<>(nums);
        ArrayList<Integer> result2 = new ArrayList<>();

        for (Integer each : result1) {
            result2.add(each*2);
        }

        return result2;
    }
}

/*
Create a method that:

is called timesTwo
returns an ArrayList of Integers
takes in a single parameter - an ArrayList of Integers called nums
This method should take the ArrayList parameter and multiply every value by two.
 */