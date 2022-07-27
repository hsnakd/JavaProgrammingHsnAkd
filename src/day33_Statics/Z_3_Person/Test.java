package day33_Statics.Z_3_Person;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Lebibe", 38, 'F');
        System.out.println(person1);

        person1.eat();
        person1.drink();
        person1.sleep();

    }
}
/*
3. Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */