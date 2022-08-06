package day36_Inheritance.Z_2_EmployeeTask;

public class Tester extends EmployeeClass{
    public Tester(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void testing() {
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }

    public void creatingTicket() {
        System.out.println(getJobTitle() + " " + getName() + " is creating ticket");
    }


    // OVERRIDE METHOD HSNAKD

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is overriding the working method");
    }
}
/*
2.2 Create the subclass of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()
 */