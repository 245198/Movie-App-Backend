package com.ust.project.dto;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
	
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9-]+$",message="Movie name should not be null")
	private String movieName;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9\\-.,]+$",message="Director name should not be null")
	private String movieDirector;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]+$",message="Genre should  contain alphabetic characters only")
	private String movieGenre;
	@NotNull
	@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$",message="Release date  should be in the format :'YYYY-MM-DD")
	private String movieReleaseDate;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]+$",message="Movie Language should  contain alphabetic characters only")
	private String movieLanguage;
	@NotNull
	@Pattern(regexp = "^\\d+$",message="Duration should  only contain numeric digits (0-9)")
	private String duration;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]+$",message="Country name  should only contain alphabetic characters")
	private String country;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]+$",message="Movie Language should  contain alphabetic characters only")
	private String movieDescription;
	@NotNull
	@Min(value = 1, message = "Rating must be at least 1")
    @Max(value = 10, message = "Rating must not exceed 10")
	private double overallRate;
	private String imageUrl;


}
