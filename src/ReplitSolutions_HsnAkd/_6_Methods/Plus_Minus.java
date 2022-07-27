package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class Plus_Minus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++) {
            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }

    static public String plus_minus (int[] ints){
        String result = "";
        int countPos = 0 ;
        int countNeg = 0 ;
        int countZero = 0 ;

        for (int each : ints) {

            if (each > 0) {
                countPos++;
            } else if (each < 0) {
                countNeg++;
            } else if (each == 0) {
                countZero++;
            }
        }
        result = "positives:" + countPos + ", negatives:" + countNeg + ", zeros:" + countZero;
        System.out.println(result);


        return result;
    }


}
/*
Create a method called plus_minus that gets an array of ints (int[]),
it outputs how many negative , positive and zero numbers are in the array.

Example:

plus_minus (new int[]{1,2,55,-9,-2,0});

output:
positives:3, negatives:2, zeros:1

 */
