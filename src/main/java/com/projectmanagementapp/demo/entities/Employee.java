package com.projectmanagementapp.demo.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Long employeeId;

    private String firstName;
    private String lastName;
    private String email;

    @ManyToOne(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE,CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name="project_id")
    private Project project;
}
