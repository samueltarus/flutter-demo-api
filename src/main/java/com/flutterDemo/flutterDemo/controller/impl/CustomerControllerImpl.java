package com.flutterDemo.flutterDemo.controller.impl;


import com.flutterDemo.flutterDemo.controller.BaseController;
import com.flutterDemo.flutterDemo.controller.CustomerController;
import com.flutterDemo.flutterDemo.model.Customer;
import com.flutterDemo.flutterDemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;

public class CustomerControllerImpl extends BaseController implements CustomerController {

    @Autowired
    private final CustomerService customerService;

    public CustomerControllerImpl(CustomerService customerService) {
        this.customerService = customerService;
    }


    public Response addCustomer(@RequestBody Customer customer){
         customerService.addCustomer(customer);
        return buildResponse(
                true,
                "Saved successfully",
                null
        );
    }

    public  Response
    updateCustomer(@RequestBody Customer customer,
                   @PathVariable("id") Long customerId)
    {
         customerService.updateCustomer(
                customer, customerId);
        return buildResponse(
                true,
                "Updated successfully",
                null
        );
    }

    // Delete operation
    public  Response deleteCustomerById(@PathVariable("id")
                                     Long customerId)
    {
        customerService.deleteCustomerById(
                customerId);

        return buildResponse(
                true,
                "Deleted Successfully",
                null
        );
    }

}
