package com.projectmanagementapp.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;

    private String stage;
    private String name;
    private String description;
    public Project(){

    }
    public Project(String stage, String name, String description) {
        this.stage = stage;
        this.name = name;
        this.description = description;
    }
}
