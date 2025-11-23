package com.firstProject.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.firstProject.model.Customer;
import com.firstProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @GetMapping("/all")
    public List<Customer> getCustomersByFirstName(@RequestParam String firstName){
        return customerService.getCustomersByFirstName(firstName);
    }

    @GetMapping("/ids")
    public List<Long> getCustomerIdsByFirstName(@RequestParam String firstName){
        return customerService.getCustomerIdsByFirstName(firstName);
    }

    @PostMapping("/create")
    public void createCustomer(@RequestBody Customer customer) throws JsonProcessingException {
        customerService.createCustomer(customer);
    }

    @PutMapping("/update")
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}
