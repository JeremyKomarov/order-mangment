package com.firstProject.controller;

import com.firstProject.model.CustomerOrder;
import com.firstProject.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order")
public class CustomerOrderController {

    @Autowired
    CustomerOrderService customerOrderService;

    @PostMapping("/create")
    public void createCustomerOrder(@RequestBody CustomerOrder customerOrder) {
        customerOrderService.createCustomerOrder(customerOrder);
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
