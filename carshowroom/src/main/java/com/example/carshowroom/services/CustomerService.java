package com.example.carshowroom.services;


import com.example.carshowroom.models.Customer;
import com.example.carshowroom.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> listCustomer(String firstName) {
        if (firstName != null) return customerRepository.findByFirstName(firstName);
        return customerRepository.findAll();
    }
}
