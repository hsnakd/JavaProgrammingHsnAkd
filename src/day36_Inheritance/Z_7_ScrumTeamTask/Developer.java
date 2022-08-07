package day36_Inheritance.Z_7_ScrumTeamTask;

public class Developer extends Employee{
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary, String department) {
        super(name, age, gender, id, jobTitle, salary);
        setDepartment(department);
    }

    public void coding() {
        System.out.println(getJobTitle() + " " + getName() + " is coding");
    }

    public void fixingBugs() {
        System.out.println(getJobTitle() + " " + getName() + " is fixing bugs");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + getId() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                "department='" + department + '\'' +
                '}';
    }
}
/*
	4. Create a subclass of Employee named Developer:

			Add any extra variable or method that Developer object need to have
 */