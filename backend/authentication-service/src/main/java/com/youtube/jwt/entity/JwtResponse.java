package com.youtube.jwt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class JwtResponse {

    private User user;
    private String jwtToken;


}
