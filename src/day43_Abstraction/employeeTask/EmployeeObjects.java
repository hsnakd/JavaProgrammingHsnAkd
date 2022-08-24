package day43_Abstraction.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        //Person person = new Person("Josh", 35, 'M');
        //  Because Person and Employee Classes are Abstract Classes. That is why we can not create object
        //Employee employee = new Employee("Ali",30,'M',42,"SDET",145000.00);

        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Developer developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Driver driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("-----------------------------------");

        developer.work();
        developer.sleep();
       // developer.bugReport();
        developer.eat();
        developer.unitTest();

        System.out.println("-----------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();



        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        PersonalTrainer personalTrainer = new PersonalTrainer("fesfew",33,'M' ,2222,"efwe", 3333) {
            @Override
            public void work() {
                System.out.println("sdvsdvs");
            }

            @Override
            public void sleep() {
                System.out.println("sdvsdvs");
            }
        };

        personalTrainer.sleep();
        System.out.println(personalTrainer.getName());

    }


}
