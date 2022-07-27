package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsWithArrays_AddElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[5];
        int [] nums2 = new int[5];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums.length; i++) {
            nums2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(addElements(nums, nums2)));
    }

    public static int[] addElements(int[] ints1, int[] ints2) {

        int[] result = new int[ints1.length];


        for (int i = 0; i < ints1.length;) {
            for (int each : ints1) {
                result[i] = each;
                i++;
            }
        }

        for (int i = 0; i < ints1.length;) {
            for (int each : ints2) {
                result[i] += each;
                i++;
            }
        }


        return result;







    }



}

/*
Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array.
You can assume that each array has 5 elements

addElements([10, 40, 50, 3, 1], [11, 0, 500, 44, 1101]);

return array after adding values in the arrays:
[21, 40, 550, 47, 1102]
 */