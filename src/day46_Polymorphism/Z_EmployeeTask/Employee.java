package day46_Polymorphism.Z_EmployeeTask;

public abstract class Employee extends Person {

    private final int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if(id <= 0){
            throw new RuntimeException("Invalid ID: "+id);
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
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


    public abstract void work();

    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


}

/**
Employee task:
		abstract Person:
			name, age, gender(final)

			eat();
			sleep();

		abstract Employee extends Person:
			 id(final), jobTitle, salary...

			work();


		Tester
			work(): testing

		Developer
			work(): developing

		Teacher
			work(): teaching

		Driver
			work(): driving

		...


 */