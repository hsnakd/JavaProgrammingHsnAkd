package day36_Inheritance.Z_0_Student;

public class StudentObject {
    public static void main(String[] args) {

        StudentClass student1 = new StudentClass("Ayşe",30,'F', 'B', "Cydeo");
        StudentClass student2 = new StudentClass("Fatma",20,'F', 'C', "CS");
        StudentClass student3 = new StudentClass("Hayriye",25,'F', 'A', "Cyber");


        student1.setAge(35);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
/*
1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fields (at least encapsulate two fields manually)
					requirements:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any character other than: 'M' and 'F'
						3. grade should not be set to any character other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirements of fields in the above must be applied)


			Methods:
				study()
				toString()

 */