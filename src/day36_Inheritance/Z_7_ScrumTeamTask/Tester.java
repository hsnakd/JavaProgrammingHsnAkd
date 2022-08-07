package day36_Inheritance.Z_7_ScrumTeamTask;

public class Tester extends Employee{
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary, String department) {
        super(name, age, gender, id, jobTitle, salary);
        setDepartment(department);
    }


    public void testing() {
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }

    public void creatingTicket() {
        System.out.println(getJobTitle() + " " + getName() + " is creating ticket");
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
                "responsibility='" + department + '\'' +
                '}';
    }
}

/*
    3. Create a subclass of Employee named Tester:

			Add any extra variable or method that Tester object need to have
 */