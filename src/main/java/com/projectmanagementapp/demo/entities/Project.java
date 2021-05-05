package com.projectmanagementapp.demo.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Long projectId;
    private String stage;
    private String name;
    private String description;

    @OneToMany(mappedBy = "project")
    private List<Employee> employee;

}
