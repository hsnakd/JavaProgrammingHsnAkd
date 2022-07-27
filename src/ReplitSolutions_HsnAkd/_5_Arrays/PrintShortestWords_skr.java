package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWords_skr {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(", ");
        String shortest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<shortest.length()){
                shortest=arr[i];
            }
        }

        String result="";

        for(String w:arr){
            if(w.length()==shortest.length()){
                result+=w+" ";
            }
        }
        arr=result.split(" ");
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


    }
}

/*
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
 */