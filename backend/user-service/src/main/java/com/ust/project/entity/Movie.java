package com.ust.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MOVIES_TABLE")
public class Movie {
	@Column(name="movie_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long movieId;
	@Column(name="movie_name")
	private String movieName;
	@Column(name="movie_director")
	private String movieDirector;
	@Column(name="movie_genre")
	private String movieGenre;
	@Column(name="movie_release_date")
	private String movieReleaseDate;
	@Column(name="movie_language")
	private String movieLanguage;
	@Column(name="duration")
	private String duration;
	@Column(name="country")
	private String country;
	@Column(name="movie_description")
	private String movieDescription;
	@Column(name="overall_rate")
	private double overallRate;
	@Column(name="image_url")
	private String imageUrl;
}
