package practice;

public class LogicalOperators {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        // AND
        boolean a = 10<5 && 10<7;
        System.out.println("a = " + a);

        boolean b = 10<5 && 10>7;
        System.out.println("b = " + b);

        boolean c = 10>5 && 10<7;
        System.out.println("c = " + c);

        boolean d = 10>5 && 10>7;
        System.out.println("d = " + d);


        System.out.println("--------------------------------------------------");


    // OR
        boolean aa = 10<5 || 10<7;
        System.out.println("aa = " + aa);

        boolean bb = 10<5 || 10>7;
        System.out.println("bb = " + bb);

        boolean cc = 10>5 || 10<7;
        System.out.println("cc = " + cc);

        boolean dd = 10>5 || 10>7;
        System.out.println("dd = " + dd);


        System.out.println("");


    // NOT
        boolean result1 =!true;
        System.out.println("result1 = " + result1);

        boolean result2 =!false;
        System.out.println("result1 = " + result2);

        boolean result3 = ! (100==200);
        System.out.println("result3 = " + result3);

        boolean result4 = ! (100==100);
        System.out.println("result3 = " + result4);


        System.out.println("--------------------------------------------------");


    }
    
    
    
    
    
}
