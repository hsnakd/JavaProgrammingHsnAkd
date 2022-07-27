package ReplitSolutions_HsnAkd._7_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SizeAndGet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(sum(list));

    }


    public static int sum(ArrayList<Integer> nums)	{
        //write code here
        int result = 0;

        for (int i = 0; i < nums.size() ; i++) {
            result+= nums.get(i);
        }




        return result;
    }

}
/*
The next two methods are .size() and .get().

If we have an ArrayList called someList and an Array called arr, these two do the same thing:

someList.size()

arr.length
In other words, .size() returns the length (size) of the list.

The method .get(i) will return the element found at index i.
The following two expressions also do the same thing:

someList.get(4)

arr[4]
Task: Given an ArrayList of Integers called nums, find and return the sum of all the numbers in the list
 */