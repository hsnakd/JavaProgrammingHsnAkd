package day39_Recap.Z_4_StudentTask;

public class CydeoStudent extends Student{

	private String batchNumber;
	private int groupNumber;
	private String programmingLanguage;

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public CydeoStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName, String batchNumber, int groupNumber, String programmingLanguage) {
		super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
		setBatchNumber(batchNumber);
		setGroupNumber(groupNumber);
		setProgrammingLanguage(programmingLanguage);
	}

	@Override
	public void eat() {
		System.out.println("Cydeo eat method");
	}

	@Override
	public void drink() {
		System.out.println("Cydeo drink method");
	}

	@Override
	public void sleep() {
		System.out.println("Cydeo sleep method");
	}

	@Override
	public String toString() {
		return "CydeoStudent{" +
				"name='" + getName() + '\'' +
				", age=" + getAge() +
				", gender=" + getGender() +
				", studentId=" + getStudentId() +
				", fieldOfStudy='" + getFieldOfStudy() + '\'' +
				", grade=" + getGrade() +
				", schoolName='" + getSchoolName() + '\'' +
				", batchNumber='" + batchNumber + '\'' +
				", groupNumber=" + groupNumber +
				", programmingLanguage='" + programmingLanguage + '\'' +
				'}';
	}
}
/**
	3. Create the following subclasses of Student class:


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