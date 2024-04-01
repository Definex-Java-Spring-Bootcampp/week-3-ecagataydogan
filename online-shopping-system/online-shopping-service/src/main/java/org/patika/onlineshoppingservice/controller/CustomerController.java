package org.patika.onlineshoppingservice.controller;


import jakarta.ws.rs.Path;
import org.patika.onlineshoppingservice.dto.CustomerRequest;
import org.patika.onlineshoppingservice.dto.CustomerResponse;
import org.patika.onlineshoppingservice.entity.Customer;
import org.patika.onlineshoppingservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping()
    public CustomerResponse save(@RequestBody CustomerRequest customerRequest) {
        return customerService.save(customerRequest);
    }

    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping("/{customerId}")
    public CustomerResponse findById(@PathVariable int customerId){
        System.out.println("geldi");
        return customerService.findById(customerId);
    }
}
