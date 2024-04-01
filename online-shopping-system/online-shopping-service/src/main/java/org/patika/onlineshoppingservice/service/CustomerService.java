package org.patika.onlineshoppingservice.service;


import org.patika.onlineshoppingservice.dto.CustomerRequest;
import org.patika.onlineshoppingservice.dto.CustomerResponse;
import org.patika.onlineshoppingservice.entity.Customer;
import org.patika.onlineshoppingservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository = new CustomerRepository();

    public CustomerResponse save(CustomerRequest customerRequest) {
        return customerRepository.save(customerRequest);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public CustomerResponse findById(int customerId) {
        return customerRepository.findById(customerId);
    }
}
