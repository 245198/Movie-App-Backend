package com.ust.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.ust.project.dto.MovieDto;
import com.ust.project.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long>{
	

}
