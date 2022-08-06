package day36_Inheritance.Z_2_EmployeeTask;

public class Teacher extends EmployeeClass {
    public Teacher(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void teaching() {
        System.out.println(getJobTitle() + " " + getName() + " is teaching");
    }

}
/*
2.4 Create the subclass of Employee named Teacher:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				teaching
				toString()
 */