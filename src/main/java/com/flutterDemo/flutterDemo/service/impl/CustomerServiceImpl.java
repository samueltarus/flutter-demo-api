package com.flutterDemo.flutterDemo.service.impl;

import com.flutterDemo.flutterDemo.model.Customer;
import com.flutterDemo.flutterDemo.repository.CustomerRepository;
import com.flutterDemo.flutterDemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
