package day10_NestedIf;

public class Z_AgeGroups {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");

        int ages = 75;
    String group = "";

    if (ages>=0 && ages<=150){
        if (ages < 21) {
            group = "Teenager";
        } else if (ages < 55) {
            group = "Adult";
        } else {
            group = "Senior";
        }

    } else {
        group ="Invalid";
    }

        System.out.println(group);


        System.out.println("--------------------------------------------------");



        int age = 75;

        boolean valid = age >= 0 && age <= 150;

        String result = "";

        if(valid){

            if(age >= 55){
                result = "Senior";
            }else if(age >= 21){
                result = "Adult";
            }else{
                result = "Teenager";
            }

        }else{
            result = "Invalid";
        }

        System.out.println(result);



        System.out.println("--------------------------------------------------");

    }

}
/*4. Create a class called AgeGroups, write a program that can define the age groups of a person
        age groups are:
        Teenager (< 21)
        Adult   (>=21 && <55 )
        Senior  ( >= 55 )

        if age is negative or greater than 150, print invalid

        NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */