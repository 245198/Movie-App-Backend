package com.ust.project.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ust.project.dto.MovieDto;
import com.ust.project.entity.Movie;
import com.ust.project.exception.MovieNotFoundException;
import com.ust.project.repository.MovieRepository;
import com.ust.project.service.MovieService;



@RestController
@RequestMapping("/api/1.0/admin")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	


	
	@PostMapping(value = "/addMovie")
	
	public ResponseEntity<String> addMovie( @RequestParam("movieName") 
	                                      	String name,
	                                       @RequestParam("movieDirector") 
	                                        String director,
	                                       @RequestParam("movieGenre") 
	                                       String genre,
	                                       @RequestParam("movieReleaseDate") 
	                                       String releaseDate,
	                                       @RequestParam("movieLanguage") 
	                                        String language,
	                                       @RequestParam("duration") 
	                                        String duration,
	                                       @RequestParam("country") 
	                                       String country,
	                                       @RequestParam("description")
	                                       String description,	                                       
	                                       @RequestParam("overallRate") 
										    double overallrate,
											@RequestParam("file")
	                                        MultipartFile imageFile) {
	    try {
	        movieService.addMovie(name, director, genre, releaseDate, language, duration, country,description,overallrate, imageFile);
	        return ResponseEntity.ok("Movie added successfully");
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add movie");
	    }
	}
	
		
	@GetMapping("/viewAllMovies")
	public List<Movie> viewAllMovies() {
		return movieService.view();
	}

	@GetMapping("/get/{movieId}")
	public ResponseEntity<Movie> getById(@PathVariable long movieId) throws MovieNotFoundException{
		return ResponseEntity.ok(movieService.fetchById(movieId));
	}

	@PutMapping("/updateAMovie/{movieId}")
	public ResponseEntity<String> updateMovie(@PathVariable long movieId,
			@RequestParam("movieName") 
    String name,
   @RequestParam("movieDirector") 
    String director,
   @RequestParam("movieGenre") 
   String genre,
   @RequestParam("movieReleaseDate") 
   String releaseDate,
   @RequestParam("movieLanguage") 
    String language,
   @RequestParam("duration") 
    String duration,
   @RequestParam("country") 
   String country,
   @RequestParam("movieDescription")
   String description,	                                       
   @RequestParam("overallRate") 
    double overallrate,
	@RequestParam("file")
    MultipartFile imageFile)  throws MovieNotFoundException {
		
		try {
	        movieService.updateMovie(movieId,name, director, genre, releaseDate, language, duration, country,description,overallrate, imageFile);

            return ResponseEntity.ok("Movie updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update movie");
        }
    }
	
	 @DeleteMapping("/deleteAMovie/{movieId}")
	    public ResponseEntity<String> deleteMovie(@PathVariable Long movieId) {
	        try {
	            movieService.deleteMovieById(movieId);
	            return ResponseEntity.ok("Movie deleted successfully");
	        } catch (IllegalArgumentException e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete movie");
	        }
	    }
		
        

	}


