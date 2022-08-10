package day39_Recap.Z_1_AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Bear bear1 = new Bear("Poo", "Panda", 'F', 11, "Large", "White and Black", true, false, false);
        System.out.println(bear1);
        bear1.hunt();
        bear1.drink();

        System.out.println("--------------------------------------------------------------------");

        Cat cat1 = new Cat("Meow", "Siamse", 'M', 4, "Small", "Green", false, true, true);
        System.out.println(cat1);
        cat1.meow();
        cat1.scratch();
        cat1.drink();
        cat1.move();

        System.out.println("--------------------------------------------------------------------");

        Dog dog1 = new Dog("Grow", "Husky", 'M', 5, "Medium", "Brown", false, true, true);
        System.out.println(dog1);
        dog1.bark();
        dog1.eat();
        dog1.pet();

        System.out.println("--------------------------------------------------------------------");

        Parrot parrot1 = new Parrot("Lazy", "Three", 'M', 6, "Small", "Yellow", false, true, true);
        System.out.println(parrot1);
        parrot1.fly();
        parrot1.sing();
        parrot1.play();

        System.out.println("--------------------------------------------------------------------");

        Python python1 = new Python("Danger", "Desert Snake", 'F', 14, "Tall", "Black", true, false,false);
        System.out.println(python1);
        python1.hunt();
        python1.eat();
        python1.sleep();

        System.out.println("--------------------------------------------------------------------");

        Lion lion1 = new Lion("King", "Desert Lion", 'M', 5, "Large", "Red and Yellow", true, false, false);
        System.out.println(lion1);
        lion1.hunt();
        lion1.eat();
        lion1.move();

    }

}
/*

	6. Create a class named Zoo:
			Create the objects of each subclasses and test all the functions of each objects

            Analyze the relationships between the classes


 */