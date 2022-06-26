package com.flutterDemo.flutterDemo.service;

import com.flutterDemo.flutterDemo.model.Customer;
import com.flutterDemo.flutterDemo.model.Order;

public interface CustomerService {
    Customer addCustomer(Customer customer);

    Customer placeCustomer(Customer customer);


    Customer updateCustomer(Customer customer,
                      Long customerId);

    // Delete operation
    void deleteCustomerById(Long customerId);
}
