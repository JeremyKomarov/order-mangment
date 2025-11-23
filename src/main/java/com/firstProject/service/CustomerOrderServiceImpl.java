package com.firstProject.service;

import com.firstProject.model.CustomerOrder;
import com.firstProject.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService{

    @Autowired
    CustomerOrderRepository customerOrderRepository;

    @Override
    public void createCustomerOrder(CustomerOrder customerOrder) {
        customerOrderRepository.createCustomerOrder(customerOrder);
    }

    @Override
    public void updateCustomerOrder(CustomerOrder customerOrder) {
        customerOrderRepository.updateCustomerOrder(customerOrder);
    }

    @Override
    public void deleteCustomerOrder(Long id) {
        customerOrderRepository.deleteCustomerOrder(id);
    }

    @Override
    public CustomerOrder getCustomerOrderById(Long id) {
        return customerOrderRepository.getCustomerOrderById(id);
    }
}
