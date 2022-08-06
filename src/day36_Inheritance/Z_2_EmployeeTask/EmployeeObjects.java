package day36_Inheritance.Z_2_EmployeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Nadide", 'F',25,12345,"Java Developer", 2000);
        Driver driver1 = new Driver("Lebibe", 'F', 28, 67890, "Truck Driver", 1500);
        Teacher teacher1 = new Teacher("Melike", 'F', 30, 54321, "IP", 3000);
        Tester tester1 = new Tester("Hsn", 'M', 38, 987654321, "SDET", 5000);

        System.out.println(developer1);
        System.out.println(driver1);
        System.out.println(teacher1);
        System.out.println(tester1);

        developer1.work();
        developer1.coding();
        developer1.fixingBugs();
        driver1.driving();
        teacher1.teaching();
        tester1.creatingTicket();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        tester1.work();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        System.out.println(tester1.getName());
        System.out.println(tester1.toString());
    }

}
/*
	2.7 Create a class named Employee Objects  and test of the subclass' objects

 */