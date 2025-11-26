package com.firstProject.service;

import com.firstProject.model.Customer;
import com.firstProject.model.CustomerOrder;
import com.firstProject.model.CustomerOrderRequest;
import com.firstProject.model.CustomerOrderResponse;
import com.firstProject.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService{

    @Autowired
    CustomerOrderRepository customerOrderRepository;

    @Autowired
    CustomerService customerService;

    @Override
    public CustomerOrderResponse createCustomerOrder(CustomerOrderRequest customerOrderRequest) throws Exception {
        Customer selectedCustomer = customerOrderRequest.getCustomer();
        Customer customerForResponse = null;

        if(selectedCustomer != null) {
            if(selectedCustomer.getId() != null) {
                Customer exisitingCustomer = customerService.getCustomerById(selectedCustomer.getId());

                if(exisitingCustomer != null) {
                    customerOrderRepository.createCustomerOrder(customerOrderRequest.toCustomerOrder());
                    customerForResponse = exisitingCustomer;
                } else {
                    throw new Exception("Cant create customerOrder woth non existing id " + selectedCustomer.getId());
                }
            } else {
                Long createdCustomerId = customerService.createCustomer(selectedCustomer);
                CustomerOrder customerOrderToCreate = customerOrderRequest.toCustomerOrder();
                customerOrderToCreate.setCustomerId(createdCustomerId);
                customerOrderRepository.createCustomerOrder(customerOrderToCreate);
                customerForResponse = customerService.getCustomerById(createdCustomerId);
            }
        } else {
            throw new Exception("Cant create a customerOrder with customer null");
        }

        List<CustomerOrder> customerOrderList = customerOrderRepository.getAllCustomerOrdersById(customerForResponse.getId());

        CustomerOrderResponse customerOrderResponse = customerOrderRequest.getCustomerOrder().toCustomerOrderResponse(
                customerForResponse,
                customerOrderList
        );
        return customerOrderResponse;
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
