package com.example.carshowroom.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "lastMNme", nullable = false)
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone", nullable = false, unique = true)
    private String phone;
}
