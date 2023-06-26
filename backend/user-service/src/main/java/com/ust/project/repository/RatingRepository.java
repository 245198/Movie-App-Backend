package com.ust.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.project.entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long>{

	List<Rating> findAllByMovieId(Long movieId);

	Optional<List<Rating>> findByUserName(String userName);

}
