package ReplitSolutions_HsnAkd._7_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveInstance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(removeInst(list, n));

    }
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) {
        ArrayList<Integer> result = new ArrayList<>(r);

        result.removeIf(p-> p.equals(n));



        return result;
    }

}

/*
This method gets an Arraylist of Integers and a number(Integer). It returns an Arraylist.

It removes any instance of the given number from the Arraylist.

Example:

removeInst([1,1,2,3,1,4],1)
returns: [2,3,4]

removeInst([3,4,3,3],4)
returns: [3,3,3]
 */