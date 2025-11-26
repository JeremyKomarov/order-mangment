package com.firstProject.service;

import com.firstProject.model.Customer;
import com.firstProject.model.CustomerOrder;
import com.firstProject.model.CustomerOrderRequest;
import com.firstProject.model.CustomerOrderResponse;
import com.firstProject.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService{

    @Autowired
    CustomerOrderRepository customerOrderRepository;

    @Autowired
    CustomerService customerService;

    @Override
    public CustomerOrderResponse createCustomerOrder(CustomerOrderRequest customerOrderRequest) throws Exception {
        Customer selectedCustomer = customerOrderRequest.getCustomer();

        if(selectedCustomer != null) {
            if(selectedCustomer.getId() != null) {

            } else {

            }
        } else {
            throw new Exception("Cant create a customerOrder with customer null");
        }
        return null;
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
