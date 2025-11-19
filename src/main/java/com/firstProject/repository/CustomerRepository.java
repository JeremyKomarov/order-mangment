package com.firstProject.repository;

import com.firstProject.model.Customer;

import java.util.List;

public interface CustomerRepository {
    Customer getCustomerById(Long id);
    List<Customer> getCustomersByFirstName(String firstName);
    List<Long> getCustomerIdsByFirstName(String firstName);
    void createCustomer (Customer customer);
    void updateCustomer (Customer customer);
    void deleteCustomer (Long id);
}
