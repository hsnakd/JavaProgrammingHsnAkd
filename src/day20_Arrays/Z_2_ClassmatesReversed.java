package day20_Arrays;

public class Z_2_ClassmatesReversed {
    public static void main(String[] args) {

        String [] classmates = {"Nadide Lebibe", "Lebibe Melike", "Melike Ayşe", "Ayşe Fatma",
                "Fatma Hayriye", "Hayriye Ali", "Ali Veli", "Veli Hayri", "Hayri Nadide" };


        for (String classmate : classmates) {
            String each = "";

            for (int i = classmate.length()-1; i >= 0; i--) {
                each += classmate.charAt(i);
            }
            System.out.println(each);
        }







    }
}

/*

2. create string array, and store the names of your  classmates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {cube, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c

 */