package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {


        int num1 = +25;     // It is the same  int num1 = 25;
        int num2 = 25;
        int num3 = -25;
        System.out.println( num1 < 0 ); // false
        System.out.println( num2 < 0 ); // false
        System.out.println( num3 < 0 ); // true

        System.out.println("--------------------");

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        System.out.println("--------------------");

        System.out.println("++num1 = " + ++num1);
        System.out.println("--num2 = " + --num2);

        System.out.println("--------------------");

        int a = 5;
        System.out.println("a = " + a);

        ++a; //pre increment: increases the value by 1 right away
        System.out.println("++a = " + a);   //6

        int b = 5;
        System.out.println("b = " + b);

        --b; //pre decrement: decreases the value by 1 right away
        System.out.println("--b = " + b);   //4

        System.out.println("--------------------------------------------");

        int c = 100;
        System.out.println("c = " + c);
        System.out.println("++c = " + ++c); //pre increment: increases the value by 1 right away

        int d = 100;
        System.out.println("d = " + d);
        System.out.println("d++ = " + d++); // post increment: first passes the current value, then increases the value by 1
        System.out.println("d = " + d);     // 101


        System.out.println("------------------------------------------------");

        int x = 200;

        System.out.println( --x ); //pre decrement:  decreases the value by 1 right away
        System.out.println("------------------------------------------------");
        int y = 200;

        System.out.println( y-- );      //200       // post decrement: first passes the current value, then decreases the value by 1
        System.out.println( y-- );      //199
        System.out.println( y-- );      //198
        System.out.println( y-- );      //197
        System.out.println( y-- );      //196
        System.out.println(y);          //195
        System.out.println(y);          //195

        System.out.println("--------------------------------------------------");

        int z = 45;

        System.out.println("++z = " +  ++z); // 46, z= 46
        System.out.println("z++ = " +  z++); //46, z = 47
        System.out.println("z = " + z); //47

        System.out.println("--------------------------------------------------");

        int q = 30;

        System.out.println("--q = " + --q); //29, q = 29
        System.out.println("q-- = " + q--); //29, q = 28
        System.out.println("q = " + q); //28












    }

}
