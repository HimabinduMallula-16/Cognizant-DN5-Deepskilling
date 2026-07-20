package com.employee.management.projection;

public class EmployeeDTO {

    private Long id;
    private String name;
    private String email;

    public EmployeeDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EmployeeDTO [id=" + id +
                ", name=" + name +
                ", email=" + email + "]";
    }
}