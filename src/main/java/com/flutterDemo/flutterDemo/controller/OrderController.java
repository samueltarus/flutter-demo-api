package com.flutterDemo.flutterDemo.controller;

import com.flutterDemo.flutterDemo.model.Order;
import com.flutterDemo.flutterDemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/list")
    public List<Order> listOrders(){
        return orderService.listOrders();
    }

    @PostMapping("/place")
    public Order placeOrder(@RequestBody Order order){
        return orderService.placeOrder(order);
    }
}
