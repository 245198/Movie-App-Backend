package com.ust.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.project.dto.RatingDto;
import com.ust.project.exception.InvalidRatingException;
import com.ust.project.exception.MovieNotFoundException;
import com.ust.project.exception.MoviesNotFoundException;
import com.ust.project.entity.Movie;
import com.ust.project.service.UserService;

@RestController
@RequestMapping("/api/1.0/users")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@GetMapping("/viewAllMovies")
	public ResponseEntity<List<Movie>> getAllMovies() throws MoviesNotFoundException
	{
		return ResponseEntity.ok().body(userService.fetchAllMovies());
	}
	
	
	@GetMapping("/search/movie/name/{name}")
	public ResponseEntity<List<Movie>> getMovieByName(@PathVariable String name) throws MovieNotFoundException
	{
		return ResponseEntity.ok().body(userService.fecthMovieByName(name));
		
	}
	
	
	@GetMapping("/search/movie/date/{date}")
	public ResponseEntity<List<Movie>> getMovieByDate(@PathVariable String date) throws MoviesNotFoundException
	{
		return ResponseEntity.ok().body(userService.fecthMovieByDate(date));
	}
	
	
	@PostMapping("add/rating/movie/{movieId}/{userName}")
	public ResponseEntity<String> addRatingMovie(@Valid @RequestBody RatingDto ratingdto, @PathVariable Long movieId,@PathVariable String userName) throws InvalidRatingException, MovieNotFoundException {
		if (ratingdto.getRating() < 1 || ratingdto.getRating() > 10) {
			throw new InvalidRatingException("Invalid rating. Please provide a rating between 1 and 10");
		}
		boolean ratingAdded = userService.addMovieRating(ratingdto, movieId,userName);

		if (ratingAdded) {
			return ResponseEntity.status(HttpStatus.CREATED).body("Rating added successfully.");
		} else {
			throw new MovieNotFoundException("Failed to add rating, Movie not found");
		}

	}

}
