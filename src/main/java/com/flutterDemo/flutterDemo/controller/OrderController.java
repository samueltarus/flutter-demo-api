package com.flutterDemo.flutterDemo.controller;

import com.flutterDemo.flutterDemo.model.Order;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.List;


@RestController
@RequestMapping("/api/orders")
public interface OrderController {
    @GetMapping("/list")
    public Response listOrders();

    @PostMapping("/place")
    public  Response placeOrder(@RequestBody Order order);

    @PutMapping("/{id}")
    public  Response
    updateOrder(@RequestBody Order order,
                @PathVariable("id") Long orderId);

    // Delete operation
    @DeleteMapping("/{id}")
    public  Response deleteOrderById(@PathVariable("id")
                                  Long orderId);
}
