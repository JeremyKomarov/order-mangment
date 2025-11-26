package com.firstProject.repository;

import com.firstProject.model.CustomerOrder;

import java.util.List;

public interface CustomerOrderRepository {
    void createCustomerOrder(CustomerOrder customerOrder);
    void updateCustomerOrder(CustomerOrder customerOrder);
    void deleteCustomerOrder(Long id);
    CustomerOrder getCustomerOrderById(Long id);
    List<CustomerOrder> getAllCustomerOrdersById(Long id) throws Exception;
}
