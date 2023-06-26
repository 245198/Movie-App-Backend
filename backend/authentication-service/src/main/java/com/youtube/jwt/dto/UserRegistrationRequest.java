package com.youtube.jwt.dto;

import com.youtube.jwt.validation.ValidPassword;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationRequest {


    @NotEmpty(message = "Username is required")
    @Email(message = "Invalid email address")
    @Pattern(regexp = ".*@gmail\\.com$", message = "Email must be of format @gmail.com")
    private String userName;

    @NotEmpty(message = "First name is required")
    private String userFirstName;

    @NotEmpty(message = "Last name is required")
    private String userLastName;

    @NotEmpty(message = "Password is required")
    @ValidPassword(message = "Password criteria does not match")
    private String userPassword;

}
