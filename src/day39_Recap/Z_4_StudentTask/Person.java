package day39_Recap.Z_4_StudentTask;

public class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){

    }

    public void drink(){

    }

    public void sleep(){

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Student Task:
	1. Create a class named Person:
			Variables:
				name, age, gender

			Encapsulate all the fields

			Add a constructor that can set all the fields

					Condition:
						1. name should not be set to null
						2. name should not be empty
						3. name should not contain any special character other than space
						4. age should not be set to negative
						5. gender must be valid

			Methods:
				eat()
				drink()
				sleep()
				toString()


	2. Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included



	3. Create the following subclasses of Student class:

				1. GraduateStudent:

						Override the study method

						add any additional fields and methods if necessary

				2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary

				3. CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

								Condition:
									1. batchNumber and groupNumber should not be set to zero or negative
									2. programmingLanguage should not be set to null
									3. programmingLanguage should not empty


						Override eat, drink and sleep methods (programmingLanguage need to be included)

						Override the toString method:
								name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included


		4. Create a class named StudentObjects:

			Create the objects of each subclasses

			test all the functions of each objects

            Analyze the relationships between the classes


 */