package day27_WrapperClasses;

import java.util.Arrays;

public class Z_2_Swap {
    public static void main(String[] args) {

            int [] arr = {10, 20, 30, 40, 50};
            int index = 2;
            int index2 = 4;

            int [] arr1 = insert(arr, index, index2);
            System.out.println(Arrays.toString(arr1));

        }

        public static int [] insert (int [] arr,  int index, int index2){

            int [] result = new int[arr.length];

            if(index < 0 || index > arr.length-1){
                System.err.println("Invalid Index: "+index);
                System.exit(0);
            }
            if(index2 < 0 || index2 > arr.length-1){
                System.err.println("Invalid Index: "+index2);
                System.exit(0);
            }


            for (int i = 0, j=0; i < arr.length; i++) {

                if (i == index) {
                    result [i] = arr[index2];
                } else if (i == index2) {
                    result [i] = arr[index];
                }else {
                    result [i] = arr[i];
                }


            }
            return result;
        }


}

/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters:
	integer array, integer i, integer j.
	The method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array
 */