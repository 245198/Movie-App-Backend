package com.ust.project.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
	private String movieName;
	private String movieDirector;
	private String movieGenre;
	private String movieReleaseDate;
	private String movieLanguage;
	private String duration;
	private String country;
	private double overallRate;
	private String movieDescription;
	private String imageUrl;
}
