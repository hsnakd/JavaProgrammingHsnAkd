package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        byte    age     = 38;           //  (1 byte)                          -128  to  127

        short   weight  = 160;          //  (2 byte)                       -32,768  to  32,767

        int     salary  = 100_000;      //  (4 byte)                -2,147,483,648  to  2,147,483,647

        long    asset   = 3_333_333_333l;// (8 byte)    -9,223,372,036,854,775,808  to  -9,223,372,036,854,775,807

        float   tax     = 0.26f;        // (4 byte)         +- 3.40282347 x 10^38   to  +- 1.40239846 x 10^45

        double  PI      = 3.14;         // (8 byte) +- 1.79769313486231570 x 10^308 to  +- 4.94065645841246544 x 10^324

        System.out.println(age);
        System.out.println(weight);
        System.out.println(salary);
        System.out.println(asset);
        System.out.println(tax);
        System.out.println(PI);

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 = 65534;
        System.out.println("ch3 = " + ch3);
        char gender = 'F';
        char grade = 'A';
        char yesNo = 'Y';
        System.out.println("gender = " + gender);
        System.out.println("grade = " + grade);
        System.out.println("yesNo = " + yesNo);

        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "CYDEO";
        String country = "Turkey";
        System.out.println("name = " + name);
        System.out.println("country = " + country);


    }





}
