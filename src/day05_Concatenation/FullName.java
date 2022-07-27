package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Hasan";
        String lastName = "AKDOĞAN";
        String fullName = firstName + " " + lastName;
        int age =38;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 1000.575;


        System.out.println("Full name of the person is " + fullName + " and he is " + age + " years old. He is a "
                            + jobTitle + ", works at " + companyName + " and his salary $" + salary);



    }


}
