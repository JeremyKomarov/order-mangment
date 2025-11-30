package com.firstProject.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.firstProject.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer getCustomerById(Long id) throws JsonProcessingException;
    List<Customer> getCustomersByFirstName(String firstName);
    List<Long> getCustomerIdsByFirstName(String firstName);
    Long createCustomer(Customer customer) throws Exception;
    void updateCustomer(Customer customer) throws Exception;
    void deleteCustomer(Long id);
}
