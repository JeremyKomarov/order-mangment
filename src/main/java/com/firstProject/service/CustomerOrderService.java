package com.firstProject.service;

import com.firstProject.model.CustomerOrder;
import com.firstProject.model.CustomerOrderRequest;
import com.firstProject.model.CustomerOrderResponse;

public interface CustomerOrderService {
    CustomerOrderResponse createCustomerOrder(CustomerOrderRequest customerOrderRequest) throws Exception;
    void updateCustomerOrder(CustomerOrder customerOrder);
    void deleteCustomerOrder(Long id);
    CustomerOrder getCustomerOrderById(Long id);
}
