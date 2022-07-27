package ReplitSolutions_HsnAkd._5_Arrays;
import java.util.*;

public class InnerAndOuter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE

        int count=0;
        for (int i = 0; i < outer.length; i++) {
            if (inner[0] == outer[i]) {
                for (int j = 1; j < inner.length; j++) {
                    inner[j] = outer[i+1];
                    count++;
                }
        }

        }if (inner.length == count+1) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}

/*
Given two arrays of ints sorted in increasing order, outer and inner,
print out true if all the numbers in inner appear in outer.
Take advantage of the fact that both arrays are already in sorted order.

Examples:

input (outer): 1, 2, 4, 6
input (inner): 2, 4

output: true
input (outer):` 1, 2, 4
input (inner): 6, 5

output: false
 */