package day35_Encapsulation.Z_0_Employee;

public class EmployeeClass {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public EmployeeClass(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name == ""){
            return;
        }
        this.name = name;
    }

    public void setGender(char gender) {
        if(!(gender == 'F' || gender == 'M')){
            return;
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if(age < 16 || age > 90){
            return;
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary <= 0){
            return;
        }
        this.salary = salary;
    }


    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

/*
Task:
	1. Create an Employee Tester:
			private variables:
				name, gender, age, salary

			Encapsulate all the private fields

				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative

 */