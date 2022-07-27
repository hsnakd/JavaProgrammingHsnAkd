package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        System.out.println(true == !false);     // true
        System.out.println(!true != !true);     // false
        System.out.println(!false == true);     // true
        System.out.println(!!false);            // false
        System.out.println(!!!true);            // false

        System.out.println("--------------------------------------------------");


        int score = 75;

        boolean a =  90 <= score && score <=100;
        boolean b =  80 <= score && score <=89;
        boolean c =  70 <= score && score <=79;
        boolean d =  60 <= score && score <=69;
        boolean f =   0 <= score && score <=59;




        if (a){
            System.out.println(score +  " Excellent");
        }
        if (b){
            System.out.println(score +  " Great");
        }
        if (c){
            System.out.println(score +  " Good");
        }
        if (d){
            System.out.println(score +  " Passed");
        }
        if (f){
            System.out.println(score +  " Failed");
        }


/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */


    }



}
