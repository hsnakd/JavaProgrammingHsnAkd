package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");


        String name = "Steven";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println(name + " is eligible to vote = " + isEligible);

        System.out.println("--------------------------------------------------");


        String name2 = "John";
        
        int creditScore = 790;
        int age2        = 23;
        int income      = 40000;

        boolean isEligible2 = age2 >= 21 && creditScore == 700 && income >= 60000;
        System.out.println(name2 + " is eligible for loan = " + isEligible2);

        System.out.println("--------------------------------------------------");


        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3 + " is eligible to register = " + isEligible3);

        System.out.println("--------------------------------------------------");


        String name4 = "James";
        String countryOfBirth = "USA";

        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        System.out.println(name4 + " is eligible to become USA citizen = " + isEligible4);

        System.out.println("--------------------------------------------------");


        String name5 = "Anna";
        double gpa = 3.5;
        int familyIncome = 100_000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60_000;
        System.out.println(name5 + " is eligible for USA scholarship = " + isEligible5);

        System.out.println("--------------------------------------------------");


        boolean result1 = true;
        boolean result2 = !result1;
        System.out.println("result1 = " + result1 + " /  result2 = " + result2);


        System.out.println("--------------------------------------------------");


        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("Passed = " + passed + " /  Failed = " + failed);




    }



}
