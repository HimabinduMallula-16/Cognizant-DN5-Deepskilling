package com.employee.management.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="employees")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude="department")

public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique=true)
    private String email;

    @ManyToOne

    @JoinColumn(name="department_id")

    private Department department;

}