package day31_Constructors.Z_3_Movie;

public class MovieObjects {
    public static void main(String[] args) {

        String title = "Journey to SDET: Cydeo EU9";
        String genre = "Adventure, Comedy, Thriller";

        Movie movie1 = new Movie("USA", title, genre,  "10/25/2021", "Kuzzat Altay");

        String[] casts = {"Asiya", "Adam", "Muhtar", "Sukru", "Omer", "Zeynep", "Basak", "Hatice", "Jamal"};
        movie1.addCasts(casts);
        System.out.println(movie1);
    }
}

/*
3. Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts

    3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie


 */