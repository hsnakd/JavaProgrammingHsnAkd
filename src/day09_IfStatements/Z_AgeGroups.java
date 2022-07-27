package day09_IfStatements;

public class Z_AgeGroups {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        int age = 555;

        if ( (2 >= age &&  age > 0) ) {
            System.out.println("Infant");
        } else if (2 < age && age <= 5) {
            System.out.println("Toddler");
        } else if (5 < age && age <= 9) {
            System.out.println("Kid");
        } else if (9 < age && age <= 12) {
            System.out.println("Pre-Teen");
        } else if (12 < age && age <= 17) {
            System.out.println("Teenager");
        } else if (17 < age && age <= 20) {
            System.out.println("Young Adult");
        } else if (20 < age && age <= 39) {
            System.out.println("Adult");
        } else if (39 < age && age <= 49) {
            System.out.println("Young Middle-Aged Adult");
        } else if (49 < age && age <= 54) {
            System.out.println("Middle-Aged Adult");
        } else if (54 < age && age <= 64) {
            System.out.println("Very Young Senior Citizen");
        } else if (64 < age && age <= 74) {
            System.out.println("Young Senior Citizen");
        } else if (74 < age && age <= 84) {
            System.out.println("Senior Citizen");
        } else if (age >= 85) {
            System.out.println("Old Senior Citizen");
        } else {
            System.out.println("Enter a value age");
        }


        System.out.println("--------------------------------------------------");



    }


}
/*
5. Create a class called AgeGroups, and write a program that can define the age groups of a person
	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */