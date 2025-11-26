package com.firstProject.controller;

import com.firstProject.model.CustomerOrder;
import com.firstProject.model.CustomerOrderRequest;
import com.firstProject.model.CustomerOrderResponse;
import com.firstProject.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class CustomerOrderController {

    @Autowired
    CustomerOrderService customerOrderService;

    @PostMapping("/create")
    public CustomerOrderResponse createCustomerOrder(@RequestBody CustomerOrderRequest customerOrderRequest) throws Exception {
        return customerOrderService.createCustomerOrder(customerOrderRequest);
    }

    @PutMapping("/update")
    public void updateCustomerOrder(@RequestBody CustomerOrder customerOrder) {
        customerOrderService.updateCustomerOrder(customerOrder);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomerOrder(@PathVariable Long id) {
        customerOrderService.deleteCustomerOrder(id);
    }

    @GetMapping("/{id}")
    public CustomerOrder getCustomerOrderById(@PathVariable Long id) {
        return customerOrderService.getCustomerOrderById(id);
    }


}
