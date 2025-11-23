package com.firstProject.repository;

import com.firstProject.model.CustomerOrder;

public interface CustomerOrderRepository {
    void createCustomerOrder(CustomerOrder customerOrder);
    void updateCustomerOrder(CustomerOrder customerOrder);
    void deleteCustomerOrder(Long id);
    CustomerOrder getCustomerOrderById(Long id);
}
