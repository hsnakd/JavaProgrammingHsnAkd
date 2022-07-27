package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below.

        Arrays.sort(nums);

        System.out.println(nums[nums.length-1]);

        System.out.println("---------------------------------------------");

       int max=0;

        for( int i = 0, j=1; i < nums.length-1; i++,j++) {
            if(nums[i] < nums[j]) {
                max = nums[j];
            }
        }

        System.out.println(max);


        System.out.println("---------------------------------------------");

        int maxNum=0;

        for( int i = 0; i < nums.length; i++) {
            if(maxNum < nums[i]) {
                maxNum = nums[i];
            }
        }

        System.out.println(maxNum);
    }
}


/*
Given an array num, get the max number in the array and print it out to the console.

nums → [2, 4, 2, 3, -2]) → 4
nums → [2, 2, 5, 3, 0 ]) → 5
nums → [1, 33, 5, 7, 9]) → 33
hint:

create a variable called max and before you start searching assume the first item value is the max.

loop through each and every item and check for whether the value max is less than the item value.

if so assign the value to the max to overwrite existing max.

you will get the max value when you are done with the loop
 */