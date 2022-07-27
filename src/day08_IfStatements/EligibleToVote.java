package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        String name = "Josh";
        int age = 8;
        String citizen = "USA";

        if (age >= 18 && citizen=="USA") {
            System.out.println(name + " is eligible to vote");
        }

        if (age < 18 || citizen !="USA") {
            System.out.println(name + " is not eligible to vote");
        }


        System.out.println("--------------------------------------------------");


        String name2 = "Josh";
        int age2 = 38;
        String citizen2 = "USA";

        boolean isEligible = age2 >= 21 && citizen2 == "USA"; //True

        // Eligible
        if(isEligible){ // True
            System.out.println("Eligible");
        }

        //Not Eligible
        if(!isEligible){ // !True ==> not true==> false
            System.out.println("Not Eligible");
        }

        System.out.println("--------------------------------------------------");





    }



}
