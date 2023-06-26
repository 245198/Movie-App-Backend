package com.ust.project.dto;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingDto {
	//@Pattern(regexp = "^\\d{1,10}$", message = "Rating must be between 1 and 10")
	//@Pattern(regexp = "[1-9]|10",message = "Rating must be between 1 and 10")
	@Min(value = 1, message = "Rating must be at least 1")
    @Max(value = 10, message = "Rating must not exceed 10")
	private double rating;
	@NotEmpty(message = "Please provide movie description")
	private String message;

}
