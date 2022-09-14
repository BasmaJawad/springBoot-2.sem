package com.example.movieworkshop.Controller;


import com.example.movieworkshop.model.Movie;
import com.example.movieworkshop.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {

    private MovieService movieService;


    public MovieController(){
        this.movieService = new MovieService();
    }


    //ex2. get first movie


@GetMapping("/getfirst")
    public Movie getFirst(){

        return movieService.getFirst();
    }

    @GetMapping("/getRandom")
    public Movie getRandom(){
        return movieService.getRandom();
    }

    @GetMapping("/getTenSortByPopularity")

    public ArrayList<Movie> sortedMovies(){
        return movieService.tenRandomMovies();
    }

    @GetMapping("/howManyWonAnAward")
    public int awards(){
        return movieService.countAwards();
    }

    @GetMapping("/filter")

    public ArrayList<Movie> filteredMovies(){
        return movieService.filteredMovies('b',2);
    }
}

