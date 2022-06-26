package com.flutterDemo.flutterDemo.service;


import com.flutterDemo.flutterDemo.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> listOrders();

    Order placeOrder(Order order);


    Order updateOrder(Order order,
                          Long orderId);

    // Delete operation
    void deleteOrderById(Long orderId);

}
