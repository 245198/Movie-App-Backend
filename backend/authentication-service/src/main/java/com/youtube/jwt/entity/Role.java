package com.youtube.jwt.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Role {

    @Id
    private String roleName;
    private String roleDescription;


}
