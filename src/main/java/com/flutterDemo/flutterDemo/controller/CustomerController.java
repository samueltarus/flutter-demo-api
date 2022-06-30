package com.flutterDemo.flutterDemo.controller;


import com.flutterDemo.flutterDemo.model.Customer;
import com.flutterDemo.flutterDemo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
@Log
public class CustomerController  {

    @Autowired
    private final CustomerService customerService;


    public Customer addCustomer(@RequestBody Customer customer){

        return customerService.addCustomer(customer);
    }
    @PutMapping("/{id}")
    public  Customer
    updateCustomer(@RequestBody Customer customer,
                   @PathVariable("id") Long customerId)
    {

        return  customerService.updateCustomer(
                customer, customerId);
    }
    @DeleteMapping("/{id}")
    // Delete operation
    public  Customer deleteCustomerById(@PathVariable("id")
                                     Long customerId)
    {
        customerService.deleteCustomerById(
                customerId);

        return  null;
    }

}
