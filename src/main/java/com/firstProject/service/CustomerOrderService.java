package com.firstProject.service;

import com.firstProject.model.CustomerOrder;

public interface CustomerOrderService {
    void createCustomerOrder(CustomerOrder customerOrder);
    void updateCustomerOrder(CustomerOrder customerOrder);
    void deleteCustomerOrder(Long id);
    CustomerOrder getCustomerOrderById(Long id);
}
