package day31_Constructors.Z_6_Restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {

        Server[] servers = {
                new Server("Nadide", 1, 20, true),
                new Server("Lebibe", 2, 25, true),
                new Server("Melike", 3, 10, false),
                new Server("Ali",    4, 15, true),
                new Server("Veli",   5, 20, false),
        };

        Chef[] chefs = {
                new Chef("Ayşe",     6, 25, false),
                new Chef("Fatma",    7, 30, false),
                new Chef("Hayriye",  8, 20, true),
                new Chef("Alparslan",  9, 15, false),
        };


        Restaurant restaurant = new Restaurant("HSN", "ESK", 5);
        restaurant.hireServers(servers);
        restaurant.hireChefs(chefs);


        System.out.println(restaurant);

    }


}

/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	 - Make a Restaurant object

	 - Create an array of servers with their information set.
	 Add those initial servers to the ArrayList of Servers in the Restaurant object

	 - Create an array of chefs with their information set.
	 Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	 - Print your whole restaurants information


 */