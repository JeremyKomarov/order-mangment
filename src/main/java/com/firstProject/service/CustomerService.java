package com.firstProject.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.firstProject.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer getCustomerById(Long id);
    List<Customer> getCustomersByFirstName(String firstName);
    List<Long> getCustomerIdsByFirstName(String firstName);
    void createCustomer(Customer customer) throws JsonProcessingException;
    void updateCustomer(Customer customer);
    void deleteCustomer(Long id);
}
