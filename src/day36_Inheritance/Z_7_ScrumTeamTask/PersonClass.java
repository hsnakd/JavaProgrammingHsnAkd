package day36_Inheritance.Z_7_ScrumTeamTask;

public class PersonClass {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        gender = ("" + gender).toUpperCase().charAt(0);
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public PersonClass(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "PersonClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
7. ScrumTeamTask:*
	1. Create a class named Person
			variables:
				name, age, gender

			methods:
				setInfo(): sets the name, age, gender of person
				eat(String food)
				drink(String drink)
				toString()

	2. Create a subclass of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
				SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
							Hint: after creating setInfo method of employee class, you can call the inherited setInfo() to set the name, age, and gender

				work()

				toString(): generate toString separately in Employee class so that name, age, gender, id, jobTitle and salary of the employee can be displayed


	3. Create a subclass of Employee named Tester:

			Add any extra variable or method that Tester object need to have


	4. Create a subclass of Employee named Developer:

			Add any extra variable or method that Developer object need to have

	5. Create a subclass of Employee named BusinessAnalyst:

			Add any extra variable or method that BusinessAnalyst object need to have

	6. Create a subclass of Employee named ProductOwner:

			Add any extra variable or method that ProductOwner object need to have

	7. Create a subclass of Employee named ScrumMaster:

			Add any extra variable or method that ScrumMaster object need to have


	8. Creat a class named ScrumTeam:
			Variables:
				PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
				testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

			Methods:
				addTester(Tester tester): adds the given tester to testers arraylist

				ddTesters(Tester[] testers): adds the given testers to testers arraylist

				removeTester(int id): removes the tester with the given id from the arraylist of tester

				addDeveloper(Developer developer): adds the given developer to testers arraylist

				addDeveloper(Developer[] developer): adds the given developers to testers arraylist

				removeDeveloper(int id): removes the developer with the given id from the arraylist of developer

				toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers


	9. Create a class named AmazonInc:

			create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
			Create 4 objects of Testers
			Create 5 Objects of Developers

			Create an object of ScrumTeam

			Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team
 */