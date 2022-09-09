package com.example.movieworkshop.repository;

import com.example.movieworkshop.model.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoviesRepository {

    private List<Movie> movies;


    public MoviesRepository(){
        this. movies = new ArrayList<>();
        genereateMovieList();
    }

    public void genereateMovieList()  {
        //læs fra csv fil og tilføj hver movie til listen

        try {
            Scanner input = new Scanner(new File("/Users/basmajawad/IdeaProjects/movieWorkshop/.mvn/resources/movies.csv"));
            input.useDelimiter(";|\n");

            while(input.hasNext()){

                //Year;Length;Title;Subject;Popularity;Awards

                String year = input.next();
                String length = input.next();
                String title = input.next();
                String subject = input.next();
                String pop = input.next();
                String awards = input.next();

                Movie movie = new Movie(year,length,title,subject,pop,awards);
                movies.add(movie);

            }
        }

        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Movie getOne(int index){
        return movies.get(index);
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
