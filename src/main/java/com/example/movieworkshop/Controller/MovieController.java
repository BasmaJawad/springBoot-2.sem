package com.example.movieworkshop.Controller;


import com.example.movieworkshop.model.Movie;
import com.example.movieworkshop.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
