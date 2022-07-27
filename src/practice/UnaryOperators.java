package practice;

public class UnaryOperators {

    public static void main(String[] args) {

    // Positive / Negative
        int a = -100;
        int b = +200;

        boolean aIsNegative = a<0;
        boolean bIsPositive = b>0;

        System.out.println("a = " + a);
        System.out.println("aIsNegative = " + aIsNegative);
        System.out.println("b = " + b);
        System.out.println("bIsPositive = " + bIsPositive);

    // Increment & Decrement
        System.out.println("--------------------------");

        int x = 100;
        // Pre Increment
        System.out.println("x = " + ++x);

        System.out.println("--------------------------");

        // Pre Decrement
        System.out.println("x = " + --x);

        System.out.println("--------------------------");

        // Post Increment
        System.out.println("x++ = " + x++);
        System.out.println("x = " + x);

        System.out.println("--------------------------");
        
        // Post Decrement
        System.out.println("x = " + x--);
        System.out.println("x-- = " + x);


    }

}
