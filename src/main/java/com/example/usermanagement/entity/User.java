package com.example.usermanagement.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name = "users")
public class User {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@NotBlank(message = "Name is required")
private String name;


@Email(message = "Invalid email format")
@NotBlank(message = "Email is required")
@Column(unique = true)
private String email;


@Min(value = 1, message = "Age must be greater than 0")
private int age;


// Getters & Setters
public Long getId() { return id; }
public void setId(Long id) { this.id = id; }


public String getName() { return name; }
public void setName(String name) { this.name = name; }


public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }


public int getAge() { return age; }
public void setAge(int age) { this.age = age; }
}