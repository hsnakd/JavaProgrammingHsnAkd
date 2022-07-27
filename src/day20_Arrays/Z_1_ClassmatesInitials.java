package day20_Arrays;

public class Z_1_ClassmatesInitials {
    public static void main(String[] args) {

        String [] classmates = {"Nadide Lebibe", "Lebibe Melike", "Melike Ayşe", "Ayşe Fatma",
                                "Fatma Hayriye", "Hayriye Ali", "Ali Veli", "Veli Hayri", "Hayri Nadide" };

        for (String classmate : classmates) {
            System.out.print(classmate.charAt(0) +"." + classmate.charAt(classmate.indexOf(" ")+1)+".");
        }
        System.out.println();
        System.out.println("-------------------------------------");

        for (int i = 0; i < classmates.length; i++) {

            String initial = classmates[i].charAt(0) +"." + classmates[i].charAt(  classmates[i].indexOf(" ") + 1) +".";
            System.out.print(initial);

        }




    }
}

/*

1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */