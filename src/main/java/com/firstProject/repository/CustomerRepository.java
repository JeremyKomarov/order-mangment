package com.firstProject.repository;

import com.firstProject.model.Customer;

public interface CustomerRepository {
    void createCustomer (Customer customer);
    void updateCustomer (Customer customer);
    void deleteCustomer (Long id);
}
