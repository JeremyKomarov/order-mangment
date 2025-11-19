package com.firstProject.controller;

import com.firstProject.model.Customer;
import com.firstProject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerRepository.getCustomerById(id);
    }

    @GetMapping("/all")
    public List<Customer> getCustomersByFirstName(@RequestParam String firstName){
        return customerRepository.getCustomersByFirstName(firstName);
    }

    @GetMapping("/ids")
    public List<Long> getCustomerIdsByFirstName(@RequestParam String firstName){
        return customerRepository.getCustomerIdsByFirstName(firstName);
    }

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
