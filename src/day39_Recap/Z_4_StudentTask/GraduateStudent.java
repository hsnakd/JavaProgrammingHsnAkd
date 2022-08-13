package day39_Recap.Z_4_StudentTask;

public class GraduateStudent extends Student{

	public GraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
		super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
	}

	@Override
	public void study() {
		System.out.println("Study Java to find a job");
	}
}
/**
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


 */