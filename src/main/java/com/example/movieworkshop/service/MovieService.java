package com.example.movieworkshop.service;

import com.example.movieworkshop.model.Movie;
import com.example.movieworkshop.repository.MoviesRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MovieService {

    private MoviesRepository moviesRep;


    public MovieService (){
        this.moviesRep = new MoviesRepository();

    }

    public Movie getFirst(){

        return moviesRep.getOne(1);

    }

    public Movie getRandom() {

        Random ran = new Random();
        int random = ran.nextInt(moviesRep.getMovies().size())+1;

        return moviesRep.getOne(random);
    }

    public ArrayList<Movie> tenRandomMovies(){

        ArrayList<Movie> tenMovies = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            tenMovies.add(getRandom());
        }

        Collections.sort(tenMovies);
        return tenMovies;
    }

    public int countAwards() {

        int countAwards =0;

        for (int i = 1; i < moviesRep.getMovies().size(); i++) {
            if(moviesRep.getOne(i).getAwards().equals("Yes"))
                countAwards = countAwards +1;
        }
        return countAwards;
    }

    public int findCharXTimes(int i, char x) {
        int count= moviesRep.getOne(i).getTitle().length() -
                moviesRep.getOne(i).getTitle().replaceAll(String.valueOf(x),"").length();
        return count;
    }

    public ArrayList<Movie> filteredMovies(char x, int n) {
        ArrayList<Movie> filteredmovies = new ArrayList<>();

        for (int i = 0; i < moviesRep.getMovies().size(); i++) {
            if (findCharXTimes(i,x)==n)
                filteredmovies.add(moviesRep.getOne(i));
        }
        return filteredmovies;
    }
}