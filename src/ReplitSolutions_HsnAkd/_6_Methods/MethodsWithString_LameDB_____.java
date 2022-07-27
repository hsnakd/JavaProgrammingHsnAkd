package ReplitSolutions_HsnAkd._6_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MethodsWithString_LameDB_____ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
    }

    public static String lameDb(String db, String op, String id, String data) {
        String result = "";

        String[] dataBase = db.split("#");
        ArrayList<String> newDataBase = new ArrayList<>();

       // (add, edit, or delete)
        if (op.equals("add")) {
            for (String each : dataBase) {
                for (int i = 1, j=Integer.parseInt(id); i <= dataBase.length; i++) {
                    if (Integer.parseInt(id) > i) {
                        newDataBase.add(each);
                    } else if (Integer.parseInt(id) == i) {
                        newDataBase.add(id+data);
                    } else if (Integer.parseInt(id) < i) {
                        newDataBase.add(each.charAt(0), id+j);
                        j++;
                    }
                }
            }
        }


        System.out.println(newDataBase);


        return result;
    }//end lameDb

}

/*
A database (DB) is an organized collection of data.
In other words, a database is used by an organization
as a method of storing, managing and retrieving information.

Implement the lameDb() method

This method has 4 String parameters and returns a String

db: information in database. Each item is separated by a #.
Each element will also have a number in the beginning about which element it is.

op: action that will be taken on database (add, edit, or remove)

id: The id number that will be manipulated

data: extra data that will be used alongside operation

The method returns the modified database

Examples:

m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
returns:  1etsy#2wooden#3spoon#4aaa

m.lameDb("1etsy#2wooden#3spoon","add","1","bbb")
returns:  1bbb#2etsy#3wooden#4spoon

m.lameDb("1test#2bla#3foo","edit","2","bbb")
returns:  1test#2bbb#3foo

m.lameDb("1tst#2bla#3foo","delete","1","")
returns:  2bla#3foo

Hint: use arrays
 */