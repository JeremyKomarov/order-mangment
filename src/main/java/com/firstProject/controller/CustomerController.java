package com.firstProject.controller;

import com.firstProject.model.Customer;
import com.firstProject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/create")
    public void createCustomer(@RequestBody Customer customer) {
        customerRepository.createCustomer(customer);
    }

    @PutMapping("/update")
    public void updateCustomer(@RequestBody Customer customer) {
        customerRepository.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerRepository.deleteCustomer(id);
    }
}
