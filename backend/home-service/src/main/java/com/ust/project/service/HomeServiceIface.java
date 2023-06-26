package com.ust.project.service;

import com.ust.project.dto.RatingDto;
import com.ust.project.entity.Movie;
import com.ust.project.exception.MovieNotFoundException;
import com.ust.project.exception.MoviesNotFoundException;

import java.util.List;

public interface HomeServiceIface {
    List<Movie> fetchAllMovies() throws MoviesNotFoundException;
    Movie fecthMovieByName(String name) throws MovieNotFoundException;
    List<Movie> fecthMovieByDate(String date) throws MoviesNotFoundException;
    boolean addMovieRating(RatingDto ratingDto, Long movieId, String userName);
}
