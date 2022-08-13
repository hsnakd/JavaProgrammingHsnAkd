package day39_Recap.Z_4_StudentTask;

public class Student extends Person{
    private int studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public void study (){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/**
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



 */