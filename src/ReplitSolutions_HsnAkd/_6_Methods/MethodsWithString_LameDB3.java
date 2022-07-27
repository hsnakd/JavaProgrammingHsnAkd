package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithString_LameDB3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
    }


        public static String lameDb(String db, String op, String id, String data) {

            String[] dB = db.split("#");

            String[] result = {};

            if (op.equals("add")) {
                result = new String[dB.length + 1];
                int k = 0;
                for ( int i = 0, j = 0; i < result.length; i++, j++ ) {
                    int order = Integer.parseInt(id);
                    if ( i+1 == order ){
                        result[k++] = (i+1) + data;
                        j--;
                    } else {
                        result[k++] = (i+1) + dB[j].substring(1);
                    }
                }
            } else if (op.equals("delete")) {
                result = new String[dB.length - 1];
                int k = 0;
                for (int i = 0, j = 0; i < result.length; i++, j++) {
                    int order = Integer.parseInt(id);
                    if ( order == i + 1) {
                        result[k++] = dB[j+1];
                        j++;
                    } else {
                        result[k++] = dB[j];
                    }
                }
            } else if ( op.equals("edit")){
                result = new String[dB.length];
                int k = 0;
                for (int i = 0, j = 0; i < result.length; i++, j++) {
                    int order = Integer.parseInt(id);
                    if ( order == i + 1 ) {
                        result[k++] = order + data;
                    } else {
                        result[k++] = (i + 1) + dB[j].substring(1);
                    }
                }
            }
            String container = "";
            for ( String each : result ){
                container += each + "#";
            }

            container = container.substring(0,container.length()-1);
            return container;





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