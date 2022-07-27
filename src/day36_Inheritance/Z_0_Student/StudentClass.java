package day36_Inheritance.Z_0_Student;

public class StudentClass {
    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

    public static boolean isStudent;
    public static boolean isHuman;

    static {
        isStudent = true;
        isHuman = true;
    }

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
        if(age < 5 || age > 90){
            return;
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender == 'F' || gender == 'M')){
            return;
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            return;
        }
        this.grade = grade;
    }

    public  String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public StudentClass(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }


    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
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