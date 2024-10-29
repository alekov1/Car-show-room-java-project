package com.example.carshowroom.repositories;

import com.example.carshowroom.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByFirstName(String firstName);
}
