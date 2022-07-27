package day06_PrimativeTypeCasting;

import java.sql.SQLOutput;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1); //121, concatenation

        System.out.println(10 + 20); // 30, Addition
        System.out.println(100 - 50); // 50, subtraction
        System.out.println(10 * 6);  // 60, multiplication


        System.out.println( 100 / 3 );//33
        System.out.println(  10/4 ); //2
        System.out.println(  10.0/4 ); //2.5
        System.out.println( 10/4.0); //2.5
        System.out.println( 10d/4 ); //2.5
        System.out.println( 10/4d ); //2.5

        int a = 100;
        double b = a/6 ; //16.0
        // double b = 16;

        System.out.println(b);

        double c = (double)a/6;    //16.66666
        double d = a/6.0;    //16.66666

        System.out.println(c);
        System.out.println(d);


        System.out.println( 100D );


        System.out.println("");

        int  xx = 10;
        int yy = 4;
        int zz = xx % yy;
        System.out.println("zz = " + zz);


        int x = 5;
        int y = 10;
        Math.max (x, y);
        System.out.println( Math.max (x, y));


        int z = 16;
        System.out.println(Math.sqrt(z));

        System.out.println(Math.random());

        int hour = 12;
        int minute = 24;
        int second = 33;
        String amOrPm = "PM";

        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);








    }

}


/*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division
            integer / integer ====> integer
            decimal / integer ====> decimal
            integer / decimal ====> decimal
            decimal / decimal ====> decimal
            in math:
                10/4 = 2.5
                100/3 = 33.333....
            in java:
                10/4 = 2
                10.0/4 = 2.5
                100/3 = 33
    %: Remainder
 */