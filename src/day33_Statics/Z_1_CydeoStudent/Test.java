package day33_Statics.Z_1_CydeoStudent;

public class Test {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Nadide", 38, 'F', 26,'A',9,9);
        System.out.println(student1);

        student1.printSchoolName();
        student1.printProgLanguage();
        student1.attendClass();
        student1.study();

        student1.printSchoolName();

    }
}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */
