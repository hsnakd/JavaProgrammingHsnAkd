package day36_Inheritance.Z_2_EmployeeTask;

public class Developer extends EmployeeClass {

    public Developer(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void coding() {
        System.out.println(getJobTitle() + " " + getName() + " is coding");
    }

    public void fixingBugs() {
        System.out.println(getJobTitle() + " " + getName() + " is fixing bugs");
    }
}
/*
2.3 Create the subclass of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()
 */