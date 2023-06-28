//package day00_BootCamp;
//
//class PersonInstance{
//
//    public String name;
//
//    public static int number_of_head;
//
//    static{
//        number_of_head = 1;
//    }
//
//
//    public PersonInstance(String name) {
//        this.name = name;
//    }
//
//
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//
//}
//
//
//public class CustomClassInstance {
//
//    public static void main(String[] args) {
//
//        Person person1 = new Person("Cydeo");
//        person1.name = "Cydeo";
//
//        Person person2 = new Person("Java");
//        person2.name = "Java";
//
//        Person person3 = new Person("Selenium");
//        person3.name = "Selenium";
//
//
//        System.out.println("person1.name = " + person1.name);   // person1.name = Cydeo
//        System.out.println("person2.name = " + person2.name);   // person2.name = Java
//        System.out.println("person3.name = " + person3.name);   // person3.name = Selenium
//
//
//        System.out.println("person1 = " + person1);     // person1 = Person{name='Cydeo'}
//        System.out.println("person2 = " + person2);     // person2 = Person{name='Java'}
//        System.out.println("person3 = " + person3);     // person3 = Person{name='Selenium'}
//
//
//        System.out.println("person3.name = " + person3.name);   // person3.name = Selenium
//
//        System.out.println(person1.number_of_head);
//
//
//    }
//
//}
