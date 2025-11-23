package com.firstProject.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.firstProject.model.Customer;
import com.firstProject.model.CustomerStatus;
import com.firstProject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.getCustomerById(id);
    }

    @Override
    public List<Customer> getCustomersByFirstName(String firstName) {
        return customerRepository.getCustomersByFirstName(firstName);
    }

    @Override
    public List<Long> getCustomerIdsByFirstName(String firstName) {
        return customerRepository.getCustomerIdsByFirstName(firstName);
    }

    @Override
    public void createCustomer(Customer customer) throws JsonProcessingException {
        String customerAsString = objectMapper.writeValueAsString(customer);
        System.out.println("starting to create a customer with customer details: " + customerAsString);
        Customer customerFromString = objectMapper.readValue(customerAsString, Customer.class);

        System.out.println("starting to create a customer with customer details: " + customerFromString);

        if (customer.getCustomerStatus().equals(CustomerStatus.VIP)) {
            List<Customer> vipCustomers = customerRepository.getAllCustomersByStatus(CustomerStatus.VIP);
            if(!(vipCustomers.size() > 5)) {
                customerRepository.createCustomer(customer);
            } else {
                System.out.println("Could not create a new customer with status VIP - OUT OF LIMIT");
            }
        } else {
            customerRepository.createCustomer(customer);
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        if (customer.getCustomerStatus().equals(CustomerStatus.VIP)) {
            List<Customer> vipCustomers = customerRepository.getAllCustomersByStatus(CustomerStatus.VIP);
            if (!(vipCustomers.size() > 5)) {
                customerRepository.updateCustomer(customer);
            } else {
                System.out.println("Could not update a new customer with status VIP - OUT OF LIMIT");
            }
        } else {
            customerRepository.updateCustomer(customer);
        }
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteCustomer(id);
    }
}
