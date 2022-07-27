package day35_Encapsulation.Z_0_Employee_WithErrorMessages;

public class EmployeeObject {
    public static void main(String[] args) {
        EmployeeClass employee1 = new EmployeeClass("Nadide", 'F', 38, 10000);
        EmployeeClass employee2 = new EmployeeClass("Lebibe", 'F', 34, 15000);
        EmployeeClass employee3 = new EmployeeClass("Melike", 'F', 30, 20000);
        EmployeeClass employee4 = new EmployeeClass("", 'Q', 100, 0);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);



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