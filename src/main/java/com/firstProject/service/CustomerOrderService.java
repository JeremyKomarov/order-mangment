package com.firstProject.service;

import com.firstProject.model.CustomerOrder;
import com.firstProject.model.CustomerOrderRequest;
import com.firstProject.model.CustomerOrderResponse;

public interface CustomerOrderService {
    CustomerOrderResponse createCustomerOrder(CustomerOrderRequest customerOrderRequest) throws Exception;
    CustomerOrderResponse updateCustomerOrder(CustomerOrder customerOrder) throws Exception;
    void deleteCustomerOrder(Long id);
    CustomerOrder getCustomerOrderById(Long id);
}
