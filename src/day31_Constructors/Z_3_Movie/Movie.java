package day31_Constructors.Z_3_Movie;

import day31_Constructors.scrumTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country;
    public String title;
    public String genre;
    public String releaseDate;
    public String director;
    public ArrayList <String> casts = new ArrayList<>();


    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String name){
        casts.add(name);
    }

    public void addCasts(String[] names){
        casts.addAll(Arrays.asList(names));
    }

    //    toString(): returns the name of country, title, release date, and total number of casts

    @Override
    public String toString() {
        return "Movie{" +
                "country = '" + country + '\'' +
                ", title = '" + title + '\'' +
                ", genre = '" + genre + '\'' +
                ", releaseDate = '" + releaseDate + '\'' +
                ", total number of casts = " + casts.size() +
                '}';
    }
}

/*
3. Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), genre (String), releaseDate (String), director (String),
	        casts (ArrayList<String>)

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