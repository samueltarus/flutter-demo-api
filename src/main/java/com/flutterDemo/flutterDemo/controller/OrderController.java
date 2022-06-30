package com.flutterDemo.flutterDemo.controller;

import com.flutterDemo.flutterDemo.model.Order;
import com.flutterDemo.flutterDemo.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
@Log
public class OrderController   {

    @Autowired
    private final OrderService orderService;

    @GetMapping("/list")
    public List<Order> listOrders(){

        return orderService.listOrders();


    }

    public  Order placeOrder(@RequestBody Order order){

        return  orderService.placeOrder(order);
    }
    @PutMapping("/{id}")
    public  Order
    updateOrder(@RequestBody Order order,
                   @PathVariable("id") Long orderId)
    {

        return  orderService.updateOrder(
                order, orderId);
    }
    @DeleteMapping("/{id}")
    // Delete operation
    public  Order deleteOrderById(@PathVariable("id")
                                     Long orderId)
    {

           orderService.deleteOrderById(
                orderId);
           return null;
    }
}
