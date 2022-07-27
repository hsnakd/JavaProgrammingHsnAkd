package day27_WrapperClasses;

import java.util.Arrays;

import static TasksSolutions.day27_WrapperClasses.InsertElement.insert;

public class Z_1_Insert {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int index = 2;
        int element = 100;

        int [] arr1 = insert(arr, index, element);
        System.out.println(Arrays.toString(arr1));

    }

    public static int [] insert (int [] arr,  int index, int element){

        int [] result = new int[arr.length + 1];

        if(index < 0 || index > arr.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        for (int i = 0, j=0; i < arr.length; i++) {

            if (i == index) {
                result [i] = element;
                j++;
                result [i+j] = arr[i];
            } else {
                result [i+j] = arr[i];
            }

        }
        return result;
    }



}

/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters:
		integer array, integer index, integer element.
		The method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
 */