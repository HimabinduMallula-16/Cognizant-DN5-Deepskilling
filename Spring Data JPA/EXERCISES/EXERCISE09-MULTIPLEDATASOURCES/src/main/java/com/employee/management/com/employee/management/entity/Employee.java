package com.employee.management.entity;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")
@EntityListeners(AuditingEntityListener.class)
@NamedQueries({
    @NamedQuery(
        name = "Employee.findByDepartment",
        query = "SELECT e FROM Employee e WHERE e.department.name = :deptName"
    ),
    @NamedQuery(
        name = "Employee.findAllEmployees",
        query = "SELECT e FROM Employee e"
    )
})

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "department")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    @CreatedDate
private LocalDateTime createdDate;

@LastModifiedDate
private LocalDateTime lastModifiedDate;

@CreatedBy
private String createdBy;

@LastModifiedBy
private String lastModifiedBy;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

}