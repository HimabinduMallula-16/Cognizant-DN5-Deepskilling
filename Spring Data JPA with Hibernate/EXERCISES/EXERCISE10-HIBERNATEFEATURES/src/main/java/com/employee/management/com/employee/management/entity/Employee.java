package com.employee.management.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.*;

@Entity
@Table(name="employees")

@DynamicInsert

@DynamicUpdate

public class Employee {

    @Id

    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String email;

    // getters setters
}