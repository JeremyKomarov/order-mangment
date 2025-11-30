package com.firstProject.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.firstProject.model.Customer;
import com.firstProject.model.CustomerStatus;

import java.util.List;

public interface CustomerRepository {
    Customer getCustomerById(Long id) throws JsonProcessingException;
    List<Customer> getCustomersByFirstName(String firstName);
    List<Long> getCustomerIdsByFirstName(String firstName);
    List<Customer> getAllCustomersByStatus(CustomerStatus status);
    Long createCustomer (Customer customer);
    void updateCustomer (Customer customer);
    void deleteCustomer (Long id);
}
