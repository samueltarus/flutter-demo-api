package com.flutterDemo.flutterDemo.controller;

import com.flutterDemo.flutterDemo.model.Customer;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;


@RestController
@RequestMapping("/api/orders")
public interface CustomerController {

    @PostMapping("/add")
    public Response addCustomer(@RequestBody Customer customer);
    @PutMapping("/{id}")
    public  Response
    updateCustomer(@RequestBody Customer customer,
                   @PathVariable("id") Long customerId);

    // Delete operation
    @DeleteMapping("/{id}")
    public  Response deleteCustomerById(@PathVariable("id")
                                     Long customerId);
}
