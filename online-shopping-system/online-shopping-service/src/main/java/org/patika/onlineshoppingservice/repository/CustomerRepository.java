package org.patika.onlineshoppingservice.repository;

import org.patika.onlineshoppingservice.dto.CustomerRequest;
import org.patika.onlineshoppingservice.dto.CustomerResponse;
import org.patika.onlineshoppingservice.entity.Customer;
import org.patika.onlineshoppingservice.exception.CustomerNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private List<Customer> customers;

    public CustomerRepository() {
        this.customers = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public CustomerResponse save(CustomerRequest customerRequest) {
        Customer toSaveCustomer = new Customer();
        toSaveCustomer.setAge(customerRequest.getAge());
        toSaveCustomer.setName(customerRequest.getName());
        toSaveCustomer.setOrders(new ArrayList<>());
        toSaveCustomer.setId(Customer.forIdCount);
        customers.add(toSaveCustomer);
        CustomerResponse savedCustomer = new CustomerResponse();
        savedCustomer.setName(toSaveCustomer.getName());
        savedCustomer.setAge(toSaveCustomer.getAge());
        savedCustomer.setOrders(toSaveCustomer.getOrders());
        return savedCustomer;
    }

    public List<Customer> findAll() {
        return customers;
    }

    public CustomerResponse findById(int customerId) {
        CustomerResponse customerResponse = new CustomerResponse();
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                customerResponse.setName(customer.getName());
                customerResponse.setAge(customer.getAge());
                customerResponse.setOrders(customer.getOrders());
                return customerResponse;
            }
        }
        throw new CustomerNotFoundException("Customer not found with id: " + customerId);

    }
}
