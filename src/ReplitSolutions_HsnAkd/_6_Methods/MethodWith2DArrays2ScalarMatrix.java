package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Arrays;

public class MethodWith2DArrays2ScalarMatrix {

    public static void main(String[] args)
    {

        int [][] i= new int[][]{ {5,3,5}, {1,1,2} };
        i = scalar(i,2);
        System.out.println(Arrays.deepToString( i ));

    }//end main

    public static int[][] scalar(int[][] matrix ,int n) {
    int arr1 = 2;
    int arr2 = 3;

    int[][] result = new int[arr1][arr2];




        for (int i = 0; i < arr1; ) {
            for (int[] each1 : matrix) {
                for (int j = 0; j < arr2; ) {
                    for (int each2 : each1) {
                        result[i][j] = (each2*2);
                        j++;
                    }
                }
                i++;
            }
        }



    return result ;

        }

    }



/*
Scalar multiplication of matrix is the simplest and easiest way to multiply matrix.
You get an int 2d array and need to multiply each of its elements by value of parameter n int.
Returned the modified array.

Example:

matrix =
[ [1,1,1]
  [1,1,2] ]

scalar(matrix,5)  returns(after multiplying each value by 5):
[ [5,5,5]
  [5,5,10] ]


matrix =
[ [2,3,5]
  [1,1,2] ]

scalar(matrix,2) returns:
[ [4,6,10]
  [2,2,4] ]

hint: nested for loops
 */