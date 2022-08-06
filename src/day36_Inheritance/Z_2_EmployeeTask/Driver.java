package day36_Inheritance.Z_2_EmployeeTask;

public class Driver extends EmployeeClass{
    public Driver(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void driving() {
        System.out.println(getJobTitle() + " " + getName() + " is driving");
    }
}
/*
2.6 Create the subclass of Employee named Driver:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				driving()
				toString()
 */