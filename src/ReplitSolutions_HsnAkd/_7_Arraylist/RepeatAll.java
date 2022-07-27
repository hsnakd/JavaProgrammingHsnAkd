package ReplitSolutions_HsnAkd._7_Arraylist;

import java.util.ArrayList;
import java.util.*;

public class RepeatAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }

    //create your method below

    public static ArrayList<Boolean> repeatAll (ArrayList<Boolean> dubs){

        ArrayList<Boolean> result = new ArrayList<>();

        result.addAll(dubs);
        result.addAll(dubs);



        return result;
    }







        // Do not touch below

}

/*
Create a static method that:

is called repeatAll
returns a modified ArrayList
takes in a single parameter - an ArrayList of Boolean
This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is

(true, false, false)
The modified ArrayList should be

(true, false, false, true, false, false)
 */