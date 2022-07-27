package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        int gradeNumber = 6;

    if (gradeNumber >=1 && gradeNumber<=6){


        if (gradeNumber == 1) {
            System.out.println("Location :  Apple orchard\n"
                                + "Number of groups : 3\n"
                                + "Teacher in charge : Ms. Smith");
        } else if (gradeNumber == 2) {
            System.out.println("Location : Zoo\n"
                                + "Number of groups : 7\n"
                                + "Teacher in charge : Mr. Lee");
        } else if (gradeNumber == 3) {
            System.out.println("Location : Aquarium\n" +
                                "Number of groups : 5\n" +
                                "Teacher in charge : Ms. Wilson");
        } else if (gradeNumber == 4) {
            System.out.println("Location : Movie theater\n" +
                                "Number of groups : 2\n" +
                                "Teacher in charge : Ms. Reyes");
        } else if (gradeNumber == 5) {
            System.out.println("Location : Museum\n" +
                                "Number of groups : 5\n" +
                                "Teacher in charge : Ms. Lela");
        } else {
            System.out.println("Location : Six Flags\n" +
                                "Number of groups : 8\n" +
                                "Teacher in charge : Mr. Watt");
        }
    } else {
        System.out.println("Entered invalid number");
        }

        System.out.println("--------------------------------------------------");

    String result = (gradeNumber >=1 && gradeNumber<=6) ? ((gradeNumber ==1)? "grade - 1" : (gradeNumber ==2)? "grade - 2" : (gradeNumber ==3)? "grade - 3" : (gradeNumber ==4)? "grade - 4" : (gradeNumber ==5)? "grade - 5" : "grade - 6" ) : "Invalid";
        System.out.println(result);


        System.out.println("--------------------------------------------------");

    String location = "";
    int group = 0;
    String teacher = "";
    if (gradeNumber >=1 && gradeNumber<=6){

        if (gradeNumber == 1) {
            location =  "Apple orchard";
            group = 3;
            teacher = "Ms. Smith";
        } else if (gradeNumber == 2) {
            location =  "Zoo";
            group = 7;
            teacher = "Mr. Lee";
        } else if (gradeNumber == 3) {
            location =  "Aquarium";
            group = 3;
            teacher = "Ms. Wilson";
        } else if (gradeNumber == 4) {
            location =  "Movie theater";
            group = 2;
            teacher = "Ms. Reyes";

        } else if (gradeNumber == 5) {
            location =  "Museum";
            group = 5;
            teacher = "Ms. Lela";
        } else {
            location =  "Six Flags";
            group = 8;
            teacher = "Mr. Watt";
        }
        System.out.println("location - " + location + "\ngroup - " + group + "\nteacher - " + teacher);

    } else {
        System.out.println("Entered invalid number");
    }

        System.out.println("--------------------------------------------------");







}
}
/*
8. Create a class called FieldTrip. Your school goes on a Field trip each year.
The place you go will be based on your grade.
Given a variable gradeNumber (1-6) figure out the details of your field trip.
Print the information at the end.
    Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith
        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee
        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson
        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes
        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela
        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */