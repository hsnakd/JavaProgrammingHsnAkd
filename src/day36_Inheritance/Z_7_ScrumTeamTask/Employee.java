package day36_Inheritance.Z_7_ScrumTeamTask;

public class Employee extends PersonClass{
    private int id;
    private String jobTitle;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public void work() {
        System.out.println(getName() + " is working ");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }



}
/*
2. Create a subclass of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
				SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
							Hint: after creating setInfo method of employee class, you can call the inherited setInfo() to set the name, age, and gender

				work()

				toString(): generate toString separately in Employee class so that name, age, gender, id, jobTitle and salary of the employee can be displayed



 */