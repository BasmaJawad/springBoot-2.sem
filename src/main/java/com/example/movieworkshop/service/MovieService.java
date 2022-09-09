package com.example.movieworkshop.service;

import com.example.movieworkshop.model.Movie;
import com.example.movieworkshop.repository.MoviesRepository;

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
}
