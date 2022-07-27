package day10_NestedIf;

public class Z_ShortVideo_Ternaries {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        int a = 100;
        int b = 200;
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println("max = " + max);

        System.out.println("--------------------------------------------------");

        int max2 = (a > b) ? a : b;     // Ternaries

        System.out.println("max (ternaries) = " + max2);


        System.out.println("--------------------------------------------------");

    }

}
