package ReplitSolutions_HsnAkd._6_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray_WithArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        ArrayList<Integer> numsList = new ArrayList<>();
        for (int each : nums) {
            numsList.addAll(Arrays.asList(each));
        }


        for (Integer i = 0, j=numsList.size()-1; i < numsList.size()/2; i++,j--) {
            Collections.swap(numsList, i, j);
        }


        nums  = numsList.toArray(new Integer [0]);

        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}
/*
Given an array nums with 7 integers already assigned, write code to reverse it.

Do not use any additional arrays or Strings.

Example:

nums -> [4, 3, 2, 44, 1, 100, 55]

nums -> [55, 100, 1, 44, 2, 3, 4]
PseudoCode:

Take values at index 0 and last index and swap them

Take values at index 0+1 and last index-1 and swap them

Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)

How to swap values:

int temp = nums[0];
nums[0] = nums[4];
nums[4] = temp;
 */
